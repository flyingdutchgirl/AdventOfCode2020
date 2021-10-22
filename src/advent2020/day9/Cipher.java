package advent2020.day9;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cipher {

    private List<Long> numbers;
    final int PREAMBLE_LEN = 25;
//    int pos = PREAMBLE_LEN;


    public Cipher(List<Long> numbers) {
        this.numbers = numbers;
    }


    Optional<Long> firstInvalidNumber() {
        return firstInvalidPos().map(i -> this.numbers.get(i));
    }


    Optional<Integer> firstInvalidPos() {
        for (int i = PREAMBLE_LEN; i < numbers.size(); i++) {
            if (!isNumberValid(i)) {
                return Optional.of(i);
            }
        }

        return Optional.empty();
    }


    private List<Long> getLastNumbers(int position) {
        return numbers.subList(position - PREAMBLE_LEN, position);
    }

    private boolean isNumberValid(int pos) {
        var previousNums = getLastNumbers(pos);
        var set = new HashSet<>(previousNums);
        long current = this.numbers.get(pos);

        for (Long ii : previousNums) {
            if (set.contains(current - ii)) {
                return true;
            }
        }

        return false;
    }


    // stage 2

    long partialSum(int start, int len) {
        long sum = 0;

        int pos = start;

        for (int i = 0; i < len; i++) {
            sum += this.numbers.get(pos++);
        }

        return sum;
    }


    Optional<Long> stage2(int posOfInvalid) {
        var sublist = this.numbers.subList(0, posOfInvalid);
        long invalid = this.numbers.get(posOfInvalid);

        for (int len = 2; len < sublist.size(); len++) {
            for (int i = 0; i < sublist.size(); i++) {
                if (invalid == partialSum(i, len)) {
                    var set = this.numbers.subList(i, i + len);
                    var stats = Stream.of(set.toArray(Long[]::new))
                            .sorted()
                            .mapToLong(l -> l)
                            .summaryStatistics();

                    return Optional.of(stats.getMin() + stats.getMax());
                }
            }
        }

        return Optional.empty();
    }

    
}


class CipherRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var numbers = sc.useDelimiter("\n")
                .tokens()
                .map(Long::parseLong)
                .collect(Collectors.toList());

        var cipher = new Cipher(numbers);
        var result = cipher.firstInvalidNumber().orElseThrow();
        System.out.println(result);

        System.out.println("stageTwo = " + cipher.stage2(cipher.firstInvalidPos().orElseThrow()));

    }
}
