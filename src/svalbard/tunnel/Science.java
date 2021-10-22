package svalbard.tunnel;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Science {

    public static void main(String[] args) {
//        info();
        replacing1();
    }

    static void info() {
        var occurs = Consts.TEXT.chars()
                .mapToObj(i -> Character.valueOf((char) i))
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream()
                .map(entry -> String.format("'%c' => %d", entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());

        occurs.forEach(System.out::println);
        System.out.println("Size = " + Consts.TEXT.length());
    }

    static void replacing1() {
        var one = Consts.TEXT
                .replaceAll("!!", "")
                .replaceAll("!!!", "!")
                .replaceAll("!!!!", "")
                .replaceAll("\\[\\]", "0")
                .replaceAll("!0", "1")
                .replaceAll("\\+0", "0")
                .replaceAll("\\+0", "0");


        System.out.println(one);
    }

}
