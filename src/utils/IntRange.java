package utils;

public abstract class IntRange {
    public abstract boolean isInRange(int number);
    public abstract IntRange or(IntRange another);
}
