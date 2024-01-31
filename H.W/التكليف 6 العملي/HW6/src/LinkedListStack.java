import java.util.LinkedList;

public class LinkedListStack<T> {

    private LinkedList<T> list;

    public LinkedListStack() {
        list = new LinkedList<>();}

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(T element) {
        list.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return list.removeFirst();
    }

    public T top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return list.getFirst();
    }

    public void printAllElements() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void clear() {
        list.clear();
        System.out.println("Stack has been cleared.");
    }



}



