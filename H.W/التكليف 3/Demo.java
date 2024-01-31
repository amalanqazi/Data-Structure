package HW3;

public class Demo {
    public static void main(String[] args) {
        DoublyLinkedList<Object> list = new DoublyLinkedList<>();
        // System.out.println(list.isEmpty());
        list.add("Mosa");
        list.add("Amran");
        list.add(11);
        list.addFirst("Name");
        list.add(20);
        list.rotate();
        list.add(1, "Abdullah");

        System.out.println(list + "\n\n");
        // DoublyLinkedList list2 = new DoublyLinkedList<>();
        // list2.add("Mosa");
        // list2.add("Amran");
        // list2.add(11);

        // System.out.println(String.format("The two lists are %s",
        // list.equals(list2) ? "equal" : "not equal"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }

        System.out.println("\n");

        System.out.println("The first element is: " +
                list.first());
        System.out.println("The last element is: " +
                list.last());
        System.out.println("The value at index 2 is: " + list.get(2));
        System.out.println("The list size is: " + list.size());

        DoublyLinkedList<Object> list2 = new DoublyLinkedList<>();
        list2.clone(list);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list.equals(list2));
        System.out.println(list2.size());
        list2.remove("Abdullah");
        list2.remove(list2.get(list2.last()));
        list2.set(3, "Hi There!");
        list2.addAll(list);
        System.out.println(list2);
        System.out.println(list2.size());
        System.out.println(list2.indexOf("Hi There!"));

        // System.out.println("The value of the last element is: " +
        // list.getTail().getElement());
    }
}
