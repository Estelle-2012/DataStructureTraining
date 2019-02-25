package array;

/**
 * 动态数组
 * 用于索引有语意的情况
 */
public class Array<E> {
    private E[] data;
    private int size;

    public Array() {
        this(10);
    }

    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    //获取数组中的元素个数
    public int getSize() {
        return size;
    }


    //取出index位置元素
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("数组越界");
        }
        return data[index];
    }

    //取出末尾位置元素
    public E getLast() {
        return get(size - 1);

    }

    //取出首位置元素
    public E getFirst() {
        return get(0);
    }

    //将index位置元素修改为e
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("数组越界");
        }
    }

    //获取数组的容量
    public int getCapacity() {
        return data.length;
    }

    //判断是否为空
    public boolean isEmpty() {
        return size == 0;
    }


    //数组中index位置添加元素e（数组右移）
    public void add(int index, E e) {
        if (size == data.length) {
            throw new IllegalArgumentException("数组越界");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("数组越界");
        }
        if (size == data.length) {

        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;

    }

    //数组末尾添加元素
    public void addLast(E e) {
        add(size, e);
    }

    //数组末尾添加元素
    public void addFirst(E e) {
        add(0, e);
    }

    //删除index位置元素(数组左移)；做删除操作时返回删除元素
    public E remove(int index) {
        E e = data[index];
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("数组越界");
        }
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return e;
    }

    //删除末位元素
    public void removeLast() {
        remove(size);
    }

    //删除首位元素
    public E removeFirst() {
        return remove(0);
    }

    //判断数组是否包含元素e
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;

    }

    //在数组中查找元素e索引，没有返回-1
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("array.Array:size = %d , capacity = %d\n [", size, data.length));
        for (int i = 0; i < size; i++) {
            stringBuilder.append(data[i]);
            if (i != size - 1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();

    }

    //重新定义数组长度
    private void resize() {

    }
}
