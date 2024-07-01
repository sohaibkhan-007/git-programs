import java.util.*;

import javax.swing.text.PlainDocument;

public class LeetCode {

    public static void main(String[] args) {

        int nums1[] = { 1, 2 };
        int nums2[] = { 3, 4 };

        int l1 = nums1.length;
        int l2 = nums2.length;
        int l3 = l1 + l2;
        int a[] = new int[l1 + l2];
        for (int i = 0; i < l1; i++) {
            a[i] = nums1[i];
        }
        for (int i =l1; i < l2; i++) {
            a[l1] = nums2[i];

        }
        for (int i : a) {
            System.out.println(i);
        }

    }
}
