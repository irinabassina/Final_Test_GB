package kz.bassina;

public class Counter implements AutoCloseable {

    private int sum = 0;

    public void add() {
        sum++;
    }

    @Override
    public void close() {
        System.out.println("Counter closed");
    }
}
