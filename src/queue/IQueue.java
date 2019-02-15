package queue;

public interface IQueue<E> {
    //入队 复杂度O(1)
    void enqueue(E e);

    //出队 复杂度O(n)
    E dequeue();

    //
    E getFront();

    //
    int getSize();

    //
    boolean isEmpty();

}
