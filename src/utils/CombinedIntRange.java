package utils;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CombinedIntRange extends IntRange {

    private List<IntRange> ranges = new ArrayList<>();
    private BiFunction<IntRange, IntRange, Boolean> combinerFun;

    @Override
    public boolean isInRange(int number) {
        return ranges.stream()
                .anyMatch(range -> range.isInRange(number));
    }

    @Override
    public IntRange or(IntRange another) {
        var combRange = new CombinedIntRange();
        combRange.ranges.addAll(this.ranges);
        if (another instanceof SimpleIntRange) {
            combRange.ranges.add(another);
        } else if (another instanceof CombinedIntRange) {
           var casted = (CombinedIntRange) another;
           combRange.ranges.addAll(casted.ranges);
        } else {
            throw new RuntimeException("Unimplemented!"); //TODO
        }
        return combRange;
    }

    static CombinedIntRange of(IntRange... intRanges) {
        var comb = new CombinedIntRange();
        comb.ranges.addAll(Arrays.asList(intRanges));
        return comb;
    }

    @Override
    public String toString() {
        var list = ranges.stream()
                .map(r -> r.toString())
                .collect(Collectors.toList());

        return addSeparator(list, " or ");
    }

    public static String addSeparator(List<String> strings, String separator) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strings.size(); i++) {
            sb.append(strings.get(i))
                    .append(i < strings.size() - 1 ? separator : "");
        }

        return sb.toString();
    }
}
