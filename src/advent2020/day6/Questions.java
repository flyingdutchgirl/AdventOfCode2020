package advent2020.day6;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Questions {


    public static void main(String[] args) {
        final boolean isStageOne = false;

        var x = new Scanner(System.in)
                .useDelimiter("\n\n")
                .tokens()
                .mapToInt(isStageOne ? Questions::anyoneMatches : Questions::everyoneMatches)
                .sum();

        System.out.println("x = " + x);
    }


    static int anyoneMatches(String text) {
        var set = text.replaceAll("\\s+", "")
                .chars()
                .boxed()
                .collect(Collectors.toSet());

        return set.size();
    }

    static int everyoneMatches(String text) {
        return text.lines()
                .map(line -> line.chars().boxed().collect(Collectors.toSet()))
                .reduce(Questions::setProduct)
                .map(Set::size)
                .orElse(0);
    }


    public static <T> Set<T> setProduct(Set<T> s1, Set<T> s2) {
        var iter = s2.iterator();
        while (iter.hasNext()) {
            if (!s1.contains(iter.next())) {
                iter.remove();;
            }
        }

        return s2;
    }


}
