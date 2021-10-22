package svalbard.tunnel.elements;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Factory<T> {
    private BiFunction<T, T, T> summing;
    private BiFunction<T, T, T> producing;
    private Function<T, T> negating;
    private T neutral;

    public Factory(BiFunction<T, T, T> summing, BiFunction<T, T, T> producing, Function<T, T> negating, T neutral) {
        this.summing = summing;
        this.producing = producing;
        this.negating = negating;
        this.neutral = neutral;
    }

    public Sum<T> sumOf(Elem<T> left, Elem<T> right) {
        var sum = new Sum<T>(left, right);
        sum.fun = summing;
        return sum;
    }

    public Prod<T> prodOf(Elem<T> left, Elem<T> right) {
        var prod = new Prod<T>(left, right);
        prod.fun = producing;
        return prod;
    }

    public Negate<T> negOf(Elem<T> elem) {
        var negation = new Negate<T>(elem);
        negation.fun = negating;
        return negation;
    }

    public Neutral<T> neutral() {
        var neutr = new Neutral<T>();
        neutr.val = this.neutral;
        return neutr;
    }
}
