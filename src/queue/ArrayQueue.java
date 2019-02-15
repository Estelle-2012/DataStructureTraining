package queue;

import array.Array;

public class ArrayQueue<E> implements IQueue<E> {
    Array<E> array;

    public ArrayQueue() {
        this.array = new Array<E>();
    }

    public ArrayQueue(int capacity) {
        this.array = new Array<E>(capacity);
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }


    @Override
    public E dequeue() {
        return array.removeFirst();

    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity() {
        return array.getCapacity();
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ArrayQueue:");
        for (int i = 0; i < array.getSize(); i++) {
            stringBuilder.append(array.get(i));
            if (i != array.getSize() - 1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();

    }
}
