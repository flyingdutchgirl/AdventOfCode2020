package utils;

public class SimpleIntRange extends IntRange {
    private int left;
    private int right;
    private boolean leftInc;
    private boolean rightInc;

    public static final String DEF_LEFT_INC_BRACKET = "[";
    public static final String DEF_RIGHT_INC_BRACKET = "]";
    public static final String DEF_LEFT_EXC_BRACKET = "(";
    public static final String DEF_RIGHT_EXC_BRACKET = ")";
    public static final String DEF_SEPARATOR = ", ";



    public SimpleIntRange(int left, int right, boolean leftInc, boolean rightInc) {
        if (left > right) {
            throw new IllegalArgumentException(
                    String.format("Left can't be greater than right! Left = %d, right = %d", left, right));
        }

        this.left = left;
        this.right = right;
        this.leftInc = leftInc;
        this.rightInc = rightInc;
    }


    public boolean isInRange(int number) {
        if (leftInc && number == left || rightInc && number == right) {
            return true;
        }

        return left < number && number < right;
    }

    @Override
    public IntRange or(IntRange another) {
        return CombinedIntRange.of(this, another);
//        return null;
    }


    public static SimpleIntRange inc(int left, int right) {
        return new SimpleIntRange(left, right, true, true);
    }

    public static SimpleIntRange exc(int left, int right) {
        return new SimpleIntRange(left, right, false, false);
    }

    public static SimpleIntRange incExc(int left, int right) {
        return new SimpleIntRange(left, right, true, false);
    }

    public static SimpleIntRange excInc(int left, int right) {
        return new SimpleIntRange(left, right, false, true);
    }

    public String toString(String separator) {
        return (leftInc ? DEF_LEFT_INC_BRACKET : DEF_LEFT_EXC_BRACKET)
                + left
                + separator
                + right
                + (rightInc ? DEF_RIGHT_INC_BRACKET : DEF_RIGHT_EXC_BRACKET);
    }

    @Override
    public String toString() {
        return toString(DEF_SEPARATOR);
    }

    public static SimpleIntRange parseIncRange(String text) {
        var tokens = text.replaceAll("//s+", "").split("[-,; ]+");
        int l = Integer.parseInt(tokens[0]);
        int r = Integer.parseInt(tokens[1]);
        return SimpleIntRange.inc(l, r);
    }
}
