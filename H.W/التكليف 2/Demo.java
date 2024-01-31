package HW2;

public class Demo {
    public static void main(String[] args) {
        CircularlyLinkedList list = new CircularlyLinkedList<>();
        list.add("Mosa");
        list.add("Amran");
        list.add(11);

        CircularlyLinkedList list2 = new CircularlyLinkedList<>();
        list2.add("Mosa");
        list2.add("Amran");
        list2.add(11);

        System.out.println(String.format("The two lists are %s",
                list.equals(list2) ? "equal" : "not equal"));

        System.out.println("The value of index 0 is: " + list.getElement(0));
        System.out.println("The size of the list is: " + list.size());
        System.out.println("The value of the last element is: " + list.getTail().getElement());
    }
}
