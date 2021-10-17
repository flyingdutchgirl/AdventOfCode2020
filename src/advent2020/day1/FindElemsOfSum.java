package advent2020.day1;

import java.util.*;
import java.util.stream.Collectors;

public class FindElemsOfSum {

//    List<Integer> numbers;

    public static void main(String[] args) {
        final int REQ_SUM = 2020;

        var amounts = new Scanner(System.in)
                .useDelimiter("\n")
                .tokens()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        sumOfThree(amounts, REQ_SUM)
                .ifPresentOrElse(System.out::println, () -> System.out.println("NOT FOUND!"));
    }

    private static Optional<Integer> findElemsSummingTo(List<Integer> numbers, int sum) {
        var nums = numbers.stream()
                .mapToInt(i -> i)
                .filter(i -> i <= sum)
                .toArray();


        for (int i = 0; i < nums.length; i++) {
            for (int k = nums.length - 1; k >= 0; k--) {
                if (nums[i] + nums[k] == sum) {
                    System.out.println("i = " + nums[i] + " ,k = " + nums[k]);
                    return Optional.of(nums[i] * nums[k]);
                }
            }
        }

        return Optional.empty();
    }

    private static Optional<Integer> sumOfThree(List<Integer> numbers, int reqSum) {
        var nums = numbers.stream()
                .mapToInt(i -> i)
                .filter(i -> i <= reqSum)
                .toArray();

        var set = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());


        for (int a = 0; a < nums.length; a++) {
            for (int b = 0; b < nums.length; b++) {
                if (a == b) {
                    continue;
                }

                int third = reqSum - nums[a] - nums[b];

                if (set.contains(third)) {
                    return Optional.of(nums[a] * nums[b] * third);
                }

            }
        }

        return Optional.empty();
    }


}
