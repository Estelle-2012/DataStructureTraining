package linkedlist;

public class LinkedList<E> {
    //节点（对外屏蔽实现细节）
    private class Node {
        public E e;
        public Node next;

        public Node() {
        }

        public Node(E e) {
            this(e, null);

        }

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }


    }

    @Override
    public String toString() {
        return super.toString();
    }
}
