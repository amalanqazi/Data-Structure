package HW2;

public class CircularlyLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    // private int size = 0;

    // public CircularlyLinkedList() {

    // }

    public boolean isEmpty() {
        return (head == null);
    }

    public int size() {
        if (isEmpty())
            throw new RuntimeException("The list is empty");
        else {
            Node<E> helpPtr = this.head;
            int size = 1;
            while (!helpPtr.equals(this.tail)) {
                size++;
                helpPtr = helpPtr.getNext();
            }
            // this.size = size;
            return size;
        }
    }

    public void add(E element) {
        Node<E> newNode = new Node<E>(element, null);
        if (isEmpty())
            this.head = newNode;
        else
            this.tail.setNext(newNode);
        tail = newNode;
        tail.setNext(this.head);
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element, tail.getNext());
        if (isEmpty()) {
            // the list was empty so far
            this.head = newNode;
            newNode.setNext(this.tail);
            this.tail = this.head;
        } else {
            // there were already elements in the list
            newNode.setNext(head.getNext());
            this.head = newNode;
        }
        // this.size++;
    }

    /**
     * @return
     *         The first element of the list.
     * @throws
     * RuntimeException         if empty
     */
    public E first() {
        if (isEmpty())
            throw new RuntimeException("The list is empty");
        return this.head.getElement();
    }

    /**
     * @return
     *         The last element of the list.
     * @throws
     * RuntimeException         if empty
     */
    public E last() {
        if (isEmpty())
            throw new RuntimeException("The list is empty");
        return tail.getElement();
    }

    /**
     * Shift the first element to the last
     */
    public void rotate() {
        if (tail != null)
            tail = tail.getNext();
    }

    /**
     * Get the last element of the list
     * 
     * @return
     *         The last element of the list
     */
    public Node<E> getTail() {
        return tail;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
    }

    public E getElement(int index) {
        if (isEmpty())
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: 0");
        else if (index > (this.size() - 1))
            throw new IndexOutOfBoundsException(String.format("Index: %d, Size: %d", index, this.size()));
        Node<E> helpPtr = this.head;
        for (int i = 0; i < index; i++) {
            helpPtr = helpPtr.getNext();
        }
        return helpPtr.getElement();
    }

    public boolean equals(CircularlyLinkedList<E> list) {
        // Check if the lists have the same size
        if (this.size() == list.size()) {
            for (int i = 0; i < list.size(); i++) {
                if (this.getElement(i) != list.getElement(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
