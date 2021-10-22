package advent2020.day14;

import utils.adventTasks.AocTask;
import utils.adventTasks.StageNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class BitsAndMasks extends AocTask {

    public final static int INT_LEN = 36;

    public BitsAndMasks() {
        super(StageNumber.One, 14);
        setStageAnswer(7997531787333L);
    }


    public static void main(String[] args) {
        new BitsAndMasks().testAssertions();
        new FloatingBits().testAssertions();
    }


    @Override
    public long calculateAnswer(Stream<String> stringStream) {
        return parseInput(stringStream)
                .values()
                .stream()
                .mapToLong(l -> l)
                .sum();
    }

    protected Map<Long, Long> parseInput(Stream<String> lines) {
        var commands = lines
                .map(this::parseLine)
                .collect(Collectors.toList());

        MaskCmd mask = null;
        Map<Long, Long> memory = new HashMap<>();

        for (Command cmd : commands) {
            if (cmd instanceof MaskCmd) {
                mask = (MaskCmd) cmd;
            } else if (cmd instanceof MemoryCmd) {
                var memCmd = (MemoryCmd) cmd;
                updateMap(memCmd, mask, memory);
            }
        }

//        memory.entrySet().forEach(entry -> System.out.println(entry.toString()));

        return memory;
    }


    protected void updateMap(MemoryCmd memCmd, MaskCmd maskCmd, Map<Long, Long> map) {
        long masked = applyMask(memCmd, maskCmd);
        map.put(memCmd.getIndex(), masked);
    }

    protected Command parseLine(String line) {
        if (line.contains("mask")) {
            String mask = line.split("=")[1].trim();
            assert mask.length() == 36;
            return new MaskCmd(mask);
        } else if (line.contains("mem")) {
            String[] tokens = line
                    .replaceAll("mem\\[", "")
                    .split("] = ");

            return new MemoryCmd(Long.parseLong(tokens[0]), Long.parseLong(tokens[1]));
        }

        throw new IllegalArgumentException("Unknown command!");
    }


    protected long applyMask(MemoryCmd memoryCmd, MaskCmd maskCmd) {
        var maskArr = maskCmd.getMask().toCharArray();
        var valArr = addZeros(Long.toBinaryString(memoryCmd.getValue()), INT_LEN).toCharArray();

        for (int i = maskArr.length - 1; i >= 0; i--) {
            if (maskArr[i] == '0' || maskArr[i] == '1') {
                valArr[i] = maskArr[i];
            }
        }

        return Long.parseLong(new String(valArr), 2);
    }

    protected static String addZeros(String str, int requiredLen) {
        int numOfZeros = str.length() >= requiredLen
                ? 0
                : requiredLen - str.length();

        return addZerosTo(str, numOfZeros);
    }

    protected static String addZerosTo(String str, int numberOfZeros) {
        return IntStream.range(0, numberOfZeros)
                .mapToObj(i -> "0")
                .collect(Collectors.joining())
                + str;
    }


}


interface Command {
}


class MaskCmd implements Command {
    public final String mask;

    public MaskCmd(String mask) {
        this.mask = mask;
    }

    public String getMask() {
        return mask;
    }
}


class MemoryCmd implements Command {
    public final long index;
    public final long value;

    public MemoryCmd(long index, long value) {
        this.index = index;
        this.value = value;
    }

    public long getIndex() {
        return index;
    }

    public long getValue() {
        return value;
    }
}