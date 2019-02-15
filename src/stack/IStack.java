package stack;

public interface IStack<E> {
    int getSize();

    boolean isEmpty();

    void push(E e);//入栈操作

    E pop();  //出栈操作

    E peek();//查看栈顶元素


}
