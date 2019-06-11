package src.interview;

/**
 * Created by morven on 2018/8/7.
 */
public class Pair<T> {
    
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        System.out.println("date super invoke");
        this.second = second;
    }
}
