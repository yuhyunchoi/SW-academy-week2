public interface IQueue {
    void enQueue(Object input);
    Object deQueue();
    int size();
    boolean isEmpty();
    boolean isFull();
}
