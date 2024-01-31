package HW1;

import java.util.ArrayList;

/**
 * Assignment1.Q1
 */
public class Q1 {

    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            num1.add(i);
            num2.add(i);
        }
        String status = num1.equals(num2) ? "\b" : "not";
        System.out.println(String.format("The arrays are %s equal.", status));
    }
}