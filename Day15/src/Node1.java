public class Node1 {
    //Properties
    Node1 next;
    int data;

    //Constructors
    public Node1(int newData){
        this.data = newData;
        next = null;
    }
    public Node1(int newData, Node1 newNnext){
        data = newData;
        next = newNnext;
    }

    public Node1 getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    public void setNext(Node1 next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }
}
