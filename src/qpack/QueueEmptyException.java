package qpack;

public class QueueEmptyException extends Exception {
    int size;

    public String toString() {
        return "\nQueue is empty";
    }
}
