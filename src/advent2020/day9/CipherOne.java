package advent2020.day9;

import utils.adventTasks.AocTask;
import utils.adventTasks.StageNumber;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CipherOne extends AocTask {

    protected List<Long> numbers;
    final int PREAMBLE_LEN = 25;


    public CipherOne() {
        super(StageNumber.One, 9);
        setStageAnswer(Optional.of(90433990L));
    }

    @Override
    public long calculateAnswer(Stream<String> stringStream) {
        this.numbers = stringStream
                .map(Long::parseLong)
                .collect(Collectors.toList());

        return firstInvalidNumber().orElseThrow();
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


}


class CipherTwo extends CipherOne {
    public CipherTwo() {
        setStageNumber(StageNumber.Two);
        setStageAnswer(Optional.of(11691646L));
    }

    @Override
    public long calculateAnswer(Stream<String> stringStream) {
        super.calculateAnswer(stringStream);
        return stage2(super.firstInvalidPos().orElseThrow()).orElseThrow();
    }


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


class CipherRunnerX {
    public static void main(String[] args) {
        CipherOne one = new CipherOne();
        CipherTwo two = new CipherTwo();

        one.testAssertions();
        two.testAssertions();
    }
}
