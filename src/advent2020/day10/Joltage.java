package advent2020.day10;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Joltage {

    public static void main(String[] args) {

        var input = IntStream.concat(IntStream.of(0),
                new Scanner(System.in)
                        .useDelimiter("\n")
                        .tokens()
                        .mapToInt(Integer::parseInt))
                .toArray();

        var map = differenceMap(input);

        long res = map.get(1) * map.get(3);

        System.out.println("stageOne = " + res);
        System.out.println(map);

    }


    static Map<Integer, Long> differenceMap(int[] adapters) {
        Arrays.sort(adapters);
        List<Integer> differences = new ArrayList<>();


        for (int i = 0; i < adapters.length - 1; i++) {
            differences.add(adapters[i + 1] - adapters[i]);
        }

        var map = differences
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.computeIfPresent(3, (k, v) -> v + 1);
        return map;
    }



}
