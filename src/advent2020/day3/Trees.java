package advent2020.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Trees {

    final int MULTIPLYING_FACTOR = 159;
    final int TO_THE_RIGHT = 3;
    final int TO_DOWN = 1;

    final char TREE = '#';

    char[][] map;

    int x = 0;
    int y = 0;

    int downFactor = TO_DOWN;
    int rightFactor = TO_THE_RIGHT;


    public static void main(String[] args) {
//        init();
        new Trees().product();
    }

    char[][] makeArray(Stream<String> rows) {
        return rows
//                .map(line -> multiplyString(line, MULTIPLYING_FACTOR))
                .map(String::toCharArray)
                .toArray(char[][]::new);
    }

    static void init() {
        Trees self = new Trees();
        self.map = self.makeArray(new Scanner(System.in).useDelimiter("\n").tokens());
        System.out.println(self.differentFactors());
    }

    int differentFactors() {
        int prod = 1;


        System.out.println(countTrees());

        rightFactor = 1;
        downFactor = 1;
        System.out.println(countTrees());
        prod *= countTrees();

        rightFactor = 5;
        downFactor = 1;
        prod *= countTrees();
        System.out.println(countTrees());

        rightFactor = 7;
        downFactor = 1;
        prod *= countTrees();
        System.out.println(countTrees());

        rightFactor = 1;
        downFactor = 2;
        prod *= countTrees();
        System.out.println(countTrees());

        return prod;
    }

    int getNext() {
        x += downFactor;
        y += rightFactor;
        y %= map[0].length;

        try {
            return map[x][y] == TREE ? 1 : 0;
        } catch (IndexOutOfBoundsException exc) {
            return -1;
        }
    }

    void product() {
        new Scanner(System.in)
                .useDelimiter("\n")
                .tokens()
                .mapToLong(Long::parseLong)
                .reduce((a, b) -> a * b)
                .stream()
                .mapToObj(Long::toString)
                .findAny()
                .orElse("no args!")
                .lines()
                .forEach(System.out::println);

    }

    int countTrees() {
        x = 0;
        y = 0;
        return IntStream.generate(this::getNext)
                .takeWhile(ii -> ii >= 0)
                .sum();
//                .reduce(1, (a, b) ->  a + b);
    }

    static String multiplyString(String str, int times) {
        return Stream.generate(() -> str)
                .limit(times)
                .collect(Collectors.joining());
    }

    int treesEncounteredOnSlopes() {
      final String slopes = "1,1; 3,1; 5,1; 7,1; 1,2";
      var slopeFactors = Arrays.stream(slopes.replaceAll("\\s+", "").split(";"))
              .map(pair -> pair.split(","))
              .map(pairArr -> Arrays.stream(pairArr).mapToInt(Integer::parseInt).toArray())
              .toArray(int[][]::new);

      var treesEncounteredList = new ArrayList<Integer>();

      for (int[] factors:slopeFactors) {
          rightFactor = factors[0];
          downFactor = factors[1];

          treesEncounteredList.add(countTrees());
      }


      return treesEncounteredList.stream()
              .mapToInt(Integer::intValue)
              .reduce((prod, elem) -> prod * elem)
              .orElse(0);
    }



}
