package advent2020.day4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PasswordValidator {

    public static final String[] REQUIRED_FIELDS = {"byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid"};
    public static final Set<String> EYE_COLORS = Set.of("amb", "blu", "brn", "gry", "grn", "hzl", "oth");
    //amb blu brn gry grn hzl oth

    public static void main(String[] args) {
        var x = new Scanner(System.in)
                .useDelimiter("\n\n")
                .tokens()
                .filter(PasswordValidator::isLineValidExtended)
                .count();

        System.out.println(x);
    }


    static boolean isLineValid(String line) {
        final var set = Arrays.stream(line.split("\\s+"))
                .map(field -> field.split(":")[0])
                .collect(Collectors.toSet());

        return Arrays.stream(REQUIRED_FIELDS)
                .allMatch(set::contains);
    }

    static boolean isLineValidExtended(String line) {
        if (!isLineValid(line)) {
            return false;
        }

        final var map = Arrays.stream(line.split("\\s+"))
                .map(field -> field.split(":"))
                .collect(Collectors.toMap(arr -> arr[0], arr -> arr[1]));

        return Stream.of(
                        isYearGood(map.get("byr"), 1920, 2002),
                        isYearGood(map.get("iyr"), 2010, 2020),
                        isYearGood(map.get("eyr"), 2020, 2030),
                        isHeightGood(map.get("hgt")),
                        map.get("hcl").matches("#[0-9a-f]{6}"),
                        map.get("ecl") != null && EYE_COLORS.contains(map.get("ecl")),
                        map.get("pid").matches("[0-9]{9}")
                )
                .allMatch(i -> i);
    }


    static boolean isYearGood(String year, int min, int max) {
        if (year == null || year.length() != 4) {
            return false;
        }

        try {
            int y = Integer.parseInt(year);
            return y >= min && y <= max;
        } catch (NumberFormatException exc) {
            return false;
        }
    }

    static boolean isHeightGood(String h) {
        if (h == null) {
            return false;
        }

        if (h.matches(".*in.*")) {
            try {
                int x = Integer.parseInt(h.replaceAll("in", ""));
                return x >= 59 && x <= 76;
            } catch (Exception e) {
                return false;
            }
        } else if (h.matches(".*cm.*")) {
            try {
                int x = Integer.parseInt(h.replaceAll("cm", ""));
                return x >= 150 && x <= 193;
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }
    }

}
