public class Node {
    //Properties
    Node next;
    int data;

    //Constructors
    public Node(int newData){
        this.data = newData;
        next = null;
    }
    public Node(int newData, Node newNnext){
        data = newData;
        next = newNnext;
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }
}
