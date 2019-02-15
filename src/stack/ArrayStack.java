package stack;

import array.Array;

/**
 * 常用操作
 */
public class ArrayStack<E> implements IStack<E> {
    Array<E> array;

    public ArrayStack() {
    }

    public ArrayStack(int capacity) {
        this.array = new Array<E>(capacity);
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void push(E e) {
        array.addLast(e);

    }

    @Override
    public E pop() {
        array.removeLast();
        return null;
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
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
