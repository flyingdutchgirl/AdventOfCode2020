package advent2020.day14;

import utils.IntRange;
import utils.adventTasks.StageNumber;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FloatingBits extends BitsAndMasks {

    public FloatingBits() {
        setStageNumber(StageNumber.Two);
        setStageAnswer(3564822193820L);
    }



    @Override
    protected void updateMap(MemoryCmd memCmd, MaskCmd maskCmd, Map<Long, Long> map) {
        maskedIndexes(memCmd, maskCmd)
                .stream()
                .forEachOrdered(idx -> map.put(idx, memCmd.getValue()));
    }

    protected static List<Long> maskedIndexes(MemoryCmd memoryCmd, MaskCmd maskCmd) {
        var maskArr = maskCmd.getMask().toCharArray();
        var valArr = addZeros(Long.toBinaryString(memoryCmd.getIndex()), INT_LEN).toCharArray();

        final char X = 'X';

        for (int i = maskArr.length - 1; i >= 0; i--) {
            if (maskArr[i] == '1') {
                valArr[i] = '1';
            } else if (maskArr[i] == X) {
                valArr[i] = X;
            }
        }


        final String masked = new String(valArr);
        var combinations = getFloatingCombinations(countOcurrences(masked, X));
        List<Long> indexes = new ArrayList<>();


        for (List<Character> comb : combinations) {
            var iter = comb.iterator();
            var idx = masked.toCharArray();

            assert comb.size() == countOcurrences(masked, X);
//            System.out.println("occ = " + countOcurrences(masked, X) + ", masked = " + masked + ", norm = " + Long.toBinaryString(memoryCmd.getValue()) + ", comb = " + comb);

            for (int i = 0; i < idx.length; i++) {
                if (idx[i] == X && iter.hasNext())  {
                    idx[i] = iter.next();
                }
            }

//            System.out.println(Arrays.toString(idx) + " " + Long.parseUnsignedLong(new String(idx), 2));

            indexes.add(Long.parseUnsignedLong(new String(idx), 2));
        }

        return indexes;
    }


    static List<List<Character>> getFloatingCombinations(int len) {
        return IntStream.range(0, (int) Math.pow(2, len))
                .mapToObj(Integer::toBinaryString)
                .map(str -> addZeros(str, len))
                .map(String::toCharArray)
                .map(FloatingBits::charArrToList)
                .collect(Collectors.toList());
    }

    static List<Character> charArrToList(char[] charArr) {
        var charList = new ArrayList<Character>();

        for (char c : charArr) {
            charList.add(c);
        }

        return charList;
    }

    static int countOcurrences(String str, char ch) {
        return (int) str.chars()
                .filter(c -> c == ch)
                .count();
    }

}
