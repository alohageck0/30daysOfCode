public class Node1<D> {
    //Properties
    Node1<D> next;
    D data;

    //Constructors
    public Node1(D newData){
        this.data = newData;
        next = null;
    }
    public Node1(D newData, Node1<D> newNnext){
        data = newData;
        next = newNnext;
    }

    public Node1<D> getNext() {
        return next;
    }

    public D getData() {
        return data;
    }

    public void setNext(Node1<D> next) {
        this.next = next;
    }

    public void setData(D data) {
        this.data = data;
    }
}
