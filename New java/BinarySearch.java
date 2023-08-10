import java.io.File;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = { 2, 7, 9, 3, 1 };

        // Arrays.sort(nums);
        int l = nums.length;
        int money = nums[0];
        for (int i = 1; i <= l; i++) {
            if (i % 2 == 0) {
                money = money + nums[i];
            }
        }
        System.out.println(money);

    }
}
