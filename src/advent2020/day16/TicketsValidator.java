package advent2020.day16;

import utils.IntRange;
import utils.SimpleIntRange;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TicketsValidator {

    public static void main(String[] args) {
//        testRanges();
        stage2();
    }

    private static void stage2Plus(List<List<Integer>> tickets, List<IntRange> ranges) {
        final int columns = tickets.get(0).size();
        final int rows = tickets.size();

        for (int clmn = 0; clmn < columns; clmn++) { //checking column
            for (int r = 0; r < ranges.size(); r++) { //checking range
                IntRange rng = ranges.get(r);
                boolean found = true;

                for (int h = 0; h < rows; h++) {
                    if (!rng.isInRange(tickets.get(h).get(clmn))) {
                        found = false;
                        break;
                    }
                }

                if (found) {
                    System.out.println("(clmn+1)=" + (clmn+1) + " range = " + rng.toString());
                    ranges.remove(rng);
                    break;
                }
            }
        }

    }
    private static void stage2() {
        System.out.println("Enter classes:");

        final var classLines = new Scanner(System.in)
                .useDelimiter("\n")
                .tokens()
                .takeWhile(line -> !line.matches(";"))
                .collect(Collectors.toList());

        final var ranges = ranges(classLines);
        final var tickets =
                tickets().stream()
                                .filter(list -> list.stream().anyMatch(ii -> !matchesAnyRange(ii, ranges)))
                                        .collect(Collectors.toList());


        stage2Plus(tickets, ranges);
//        var matchedRanges = fieldList(tickets, ranges);

//          .map(str -> str.split(": ")[1])
//                .map(String::trim)
//                .map(str -> str.split(" or "))
//                .map(arr -> SimpleIntRange.parseIncRange(arr[0]).or(SimpleIntRange.parseIncRange(arr[1])))

//        Arrays.stream(matchedRanges)
//                .map(r -> {
//                    assert r != null;
//                    int pos = findRangePos(r, ranges);
//                    return classLines.get(pos);
//                })
//                .forEachOrdered(System.out::println);


    }


    private static int findRangePos (IntRange rng, List<IntRange> rangeList) {
        for (int i = 0; i < rangeList.size(); i++) {
            if (rng.equals(rangeList.get(i))) {
                return i;
            }
        }

        assert false;
        return -1;
    }

    private int findRangeIdx(IntRange r, IntRange[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            if (r.equals(arr[i])) {
                return i;
            }
        }

        assert false;
        return -1;
    }

    private static List<IntRange> ranges(List<String> classLines) {
        return classLines.stream()
//                .map(str -> str.replaceAll("^[0-9-]+", " "))
                .map(str -> str.split(": ")[1])
                .map(String::trim)
                .map(str -> str.split(" or "))
//                .map(str -> str.split("\\s+"))
                .map(arr -> SimpleIntRange.parseIncRange(arr[0]).or(SimpleIntRange.parseIncRange(arr[1])))

                .collect(Collectors.toList());
    }

    private static List<List<Integer>> tickets() {
        System.out.println("Enter nearby tickets:");

        return new Scanner(System.in)
                .useDelimiter("\n")
                .tokens()
                .map(str -> str.split(","))
                .map(arr -> Arrays.stream(arr)
                        .map(Integer::parseInt)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    private static boolean matchesAnyRange(int number, List<IntRange> ranges) {
        return ranges.stream()
                .anyMatch(r -> r.isInRange(number));
    }

    private static long errorCode(List<List<Integer>> codes, List<IntRange> ranges) {
        return codes.stream()
                .flatMapToLong(list -> list.stream().mapToLong(Integer::longValue))
                .filter(i -> !matchesAnyRange((int) i, ranges))
                .sum();
    }


    private static IntRange[] fieldList(List<List<Integer>> codes, List<IntRange> ranges) {
        final int fieldsNumber = codes.get(0).size();
        IntRange[] titles = new IntRange[fieldsNumber];
        assert fieldsNumber == ranges.size();

        for (int i = 0; i < ranges.size(); i++) {
            IntRange range = ranges.get(i);
            for (int k = 0; k < fieldsNumber; k++) {
                int finalK = k;
                boolean isFound = codes.stream()
                        .allMatch(list -> range.isInRange(list.get(finalK)));

                if (isFound && titles[k] == null) {
                    titles[k] = range;
                    break;
                }
            }
        }

        System.out.println("fields: " + Arrays.toString(titles));

        return titles;
    }

//    static void stage1() {
//        var ranges = ranges();
//        var tickets = tickets();
//        long code = errorCode(tickets, ranges);
//
//        System.out.println(code);
//    }

//    static void testRanges() {
//        ranges().stream()
//                .forEachOrdered(System.out::println);
//    }

}
