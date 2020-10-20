package java8.ImplementStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream<T> {
    List<T> list;
    public Stream(List<T> list) {
        this.list = list;
    }
    @SafeVarargs
    public static <T> Stream<T> of (T... list) {
        List<T> result = new ArrayList<>(Arrays.asList(list));
        return new Stream<>(result);
    }

    public Stream<T> filter(Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for(T s: this.list) {
            if(predicate.condition(s)) {
                result.add(s);
            }
        }
        return new Stream<>(result);
    }

    public Stream<T> limit(int nb) {
        List<T> result = new ArrayList<>();

        if(nb < 0) {
            throw new IllegalArgumentException("Parameter could not be negative");
        }

        if(nb > this.list.size()) {
            return this;
        }

        for(int i = 0; i < nb; i++) {
            result.add(this.list.get(i));
        }

        return new Stream<>(result);
    }

    /**
     * To discuss
     */
    public <U> Stream<U> map(Function<T, U> function) {
        List<U> result = new ArrayList<>();

        for(T s: this.list) {
            result.add(function.apply(s));
        }

        return new Stream<>(result);
    }

    public List<T> toList() {
        return this.list;
    }
}
