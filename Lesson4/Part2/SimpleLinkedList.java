package Lesson4.Part2;

/**
 * Created by User on 07.03.2016.
 */
public class SimpleLinkedList {
    private Node root;
    private int size;

    public class Node {
        private Object o;
        private Node node;

        public Node() {
        }

        public Node getNode() {
            return node;
        }

        public void setNode(Node node) {
            this.node = node;
        }

        public Object getO() {
            return o;
        }

        public void setO(Object o) {
            this.o = o;
        }
    }

    public SimpleLinkedList() {
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addFirst(Object o){

    }
    public void addLast(Object o){

    }
    public void addAfter(Object o1, Object o2){

    }
}
