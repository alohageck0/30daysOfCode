import java.util.*;

public class Queuey {
    LinkedList queue;

    //
    public Queuey() {
        queue = new LinkedList();
    }

    //Is our queue empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void enqueue(String n) {
        queue.addLast(n);
    }

    public String dequeue() {
        return (String) queue.removeFirst();
    }

    public String peek() {
        return (String) queue.get(0);
    }

    public static void main(String[] args) {
        Stack<String> stacky = new Stack<>();
        stacky.push("there");
        stacky.push("Hi");
        System.out.print(stacky.pop() + " ");
        System.out.println(stacky.peek());
        System.out.print(stacky.pop() + "! ");
        System.out.println(stacky.size());

//        Queuey numberQueue = new Queuey();
//        numberQueue.enqueue(5);
//        numberQueue.enqueue(7);
//        numberQueue.enqueue(6);
//        System.out.println("First out " + numberQueue.dequeue());
//        System.out.println("Peek at ceond out " + numberQueue.peek());
//        System.out.println("Second out " + numberQueue.dequeue());
//        System.out.println("Third out " + numberQueue.dequeue());
//        Queuey stringQueue = new Queuey();
//        stringQueue.enqueue("Hi");
//        stringQueue.enqueue("there");
//        System.out.print(stringQueue.dequeue() + " ");
//        System.out.print(stringQueue.dequeue() + ". ");

    }
}
