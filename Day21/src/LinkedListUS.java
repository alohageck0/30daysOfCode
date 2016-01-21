import java.util.LinkedList;

public class LinkedListUS<D> {
    //Porps
    Node1<D> head;
    int count;


    //COnstrucor
//    public LinkedList() {
//        head = null;
//        count = 0;
//    }

    public LinkedListUS(Node1<D> newHead) {
        head = newHead;
        count = 1;
    }

    //Metdhods
    //add
    public void add(D newData) {
        Node1<D> temp = new Node1(newData);
        Node1<D> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    //get
    public D get(int index) {
//        if (index <= 0) {
//            return -1;
//        }
        Node1<D> current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }


    //size
    public int size() {
        return count;
    }

    //isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    //remove
    public void remove() {
        //remove from back of the list
        Node1<D> current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Alice");
        System.out.println(linkedList);
        linkedList.add("Alicey");
        System.out.println(linkedList);

    }
}
