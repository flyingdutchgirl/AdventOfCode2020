package advent2020.day2;

import java.util.Arrays;
import java.util.Scanner;

public class PasswordChecker {

    public static boolean isPasswordValid(String line) {
        String[] tokens = line.trim().split("\\s+");

        var limits = Arrays.stream(tokens[0].split("\\D"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int min = limits[0];
        int max = limits[1];

        final char requiredLetter = tokens[1].charAt(0);

        long occurences = tokens[2].chars()
                .filter(ch -> ch == requiredLetter)
                .count();

        return occurences >= min && occurences <= max;
    }

    public static boolean anotherPolicy(String line) {
        String[] tokens = line.trim().split("\\s+");

        var limits = Arrays.stream(tokens[0].split("\\D"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int pos1 = limits[0] - 1;
        int pos2 = limits[1] - 1;

        final char requiredLetter = tokens[1].charAt(0);

         return (tokens[2].charAt(pos1) == requiredLetter) ^ (tokens[2].charAt(pos2) == requiredLetter);
    }



    public static void main(String[] args) {
        takeLines();
    }

    static void takeLines(){
        Scanner sc = new Scanner(System.in);
        long howMany = sc.useDelimiter("\n")
                .tokens()
                .filter(line -> {
                    try {
                        return anotherPolicy(line);
                    } catch (Exception exc) {
                        return false;
                    }
                })
                .count();

        System.out.println(howMany);
    }

    static void test1() {
        String sample = "1-3 a: abcde\n" +
                "1-3 b: cdefg\n" +
                "2-9 c: ccccccccc";

        Arrays.stream(sample.split("\n"))
                .filter(PasswordChecker::isPasswordValid)
                .forEachOrdered(System.out::println);

    }


}
