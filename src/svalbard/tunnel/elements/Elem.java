package svalbard.tunnel.elements;

import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class Elem<T> {
    protected T value;

    public T getValue() {
        return value;
    }
}


class Sum<T> extends Elem<T> {
    Elem<T> left;
    Elem<T> right;
    protected BiFunction<T, T, T> fun;

    public Sum(Elem<T> left, Elem<T> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public T getValue() {
        return fun.apply(left.getValue(), right.getValue());
    }
}

class Prod<T> extends Elem<T> {
    Elem<T> left;
    Elem<T> right;
    protected BiFunction<T, T, T> fun;

    public Prod(Elem<T> left, Elem<T> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public T getValue() {
        return fun.apply(left.getValue(), right.getValue());
    }
}


class Negate<T> extends Elem<T> {
    Elem<T> elem;
    protected Function<T, T> fun;

    public Negate(Elem<T> elem) {
        this.elem = elem;
    }

    @Override
    public T getValue() {
        return fun.apply(elem.getValue());
    }
}


class Neutral<T> extends Elem<T> {
    T val;

    @Override
    public T getValue() {
        return val;
    }
}


