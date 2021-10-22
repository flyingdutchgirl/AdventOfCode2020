package utils.adventTasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.Scanner;
import java.util.stream.Stream;

public abstract class AocTask {

    private StageNumber stageNumber;
    private int dayNumber;
    protected Optional<Long> stageAnswer = Optional.empty();

//    public final static String DEFAULT_INPUT_FILENAME = "src/inputs/input5.txt";


    public AocTask(StageNumber stageNumber, int dayNumber) {
        this.stageNumber = stageNumber;
        this.dayNumber = dayNumber;
    }

    public abstract long calculateAnswer(Stream<String> stringStream);

    public long showAnswer() {
        long val = calculateAnswer(new Scanner(System.in).useDelimiter("\n").tokens());

        return val;
    }

    public void useConsole() {
        printInfo(calculateAnswer(readFromConsole()));
    }

    public void testAssertions() {
        final long val = calculateAnswer(readFromFile());
        printInfo(val);
    }

    public void printInfo(long calculatedVal) {
        final String res = String.format("day = %d, stage = %s, actual = %d, ",
                getDayNumber(), getStageNumber().toString(), calculatedVal);

        getStageAnswer()
                .map(l -> res + String.format("expected = %d, isTestPassed = %b", l, l == calculatedVal))
                .orElse(res)
                .lines()
                .forEachOrdered(System.out::println);
    }

    public static Stream<String> readFromConsole() {
        return new Scanner(System.in)
                .useDelimiter("\n")
                .tokens();
    }

    public static Stream<String> readFromFile(String fileName) {
        try {
            return new Scanner(new File(fileName))
                    .useDelimiter("\n")
                    .tokens();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return Stream.empty();
        }
    }

    public Stream<String> readFromFile() {
        return readFromFile(getFilename());
    }

    protected String getFilename() {
        return String.format("src/inputs/input%d.txt", getDayNumber());
    }

    public StageNumber getStageNumber() {
        return stageNumber;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public Optional<Long> getStageAnswer() {
        return stageAnswer;
    }

    protected void setStageAnswer(Optional<Long> stageAnswer) {
        this.stageAnswer = stageAnswer;
    }

    protected void setStageAnswer(long l) {
        setStageAnswer(Optional.of(l));
    }

    protected void setStageAnswer(int i) {
        setStageAnswer(Optional.of((long) i));
    }

    protected void setStageNumber(StageNumber stageNumber) {
        this.stageNumber = stageNumber;
    }

    protected void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }
}


