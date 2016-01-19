import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Palindrome {
    Queue<Character> queue = new Queue<Character>() {
        @Override
        public boolean add(Character character) {
            queue.add(character);
            return true;
        }

        @Override
        public boolean offer(Character character) {
            return false;
        }

        @Override
        public Character remove() {
            queue.remove();
            return null;
        }

        @Override
        public Character poll() {
            return null;
        }

        @Override
        public Character element() {
            return null;
        }

        @Override
        public Character peek() {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Character> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Character> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };
    Stack<Character> stack = new Stack<>();

    public Palindrome() {
    }

    public void pushCharacter(char c) {
        this.stack.push(c);
    }

    public void enqueueCharacter(char c) {
        this.queue.add(c);
    }

    public char popCharacter() {
        return stack.pop();
    }

    public char dequeueCharacter() {
        return queue.remove();
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // read the string s.
        String s = sc.nextLine();

        // create the Palindrome class object p.
        Palindrome p = new Palindrome();
        char arr[] = s.toCharArray();//Converting string to a character array
        // push all the characters of string s to stack.
        for (char c : arr) {
            p.pushCharacter(c);
        }

        // enqueue all the characters of string s to queue.
        for (char c : arr) {
            p.enqueueCharacter(c);
        }

        boolean f = true;

        // pop the top character from stack.
        // dequeue the first character from queue.
        // compare both the characters.
        for (int i = 0; i < s.length(); i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                f = false;
                break;
            }
        }

        // finally print whether string s is palindrome or not.
        if (f) {
            System.out.println("The word, " + s + ", is a palindrome.");
        } else {
            System.out.println("The word, " + s + ", is not a palindrome.");
        }
    }
}