package HW1;

import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 25; i++) {
            nums.add(i);
        }
        removeElements(nums, 2, 20);
        for (Integer integer : nums) {
            System.out.println(integer);
        }
    }

    public static void removeElements(ArrayList obj) {
        for (int i = 0; i < obj.size(); i++) {
            obj.remove(i);
        }
    }

    public static void removeElements(ArrayList obj, int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            obj.remove(i);
        }
    }
}
