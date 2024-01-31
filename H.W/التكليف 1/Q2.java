package HW1;

import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            num1.add(i);
        }
        ArrayList<Integer> numCopy = (ArrayList<Integer>) num1.clone();
        String status = num1.equals(numCopy) ? "\b" : "not";
        System.out.println(String.format("The arrays are %s equal.", status));
    }
}
