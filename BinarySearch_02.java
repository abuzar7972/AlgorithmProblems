package com.bl.programs;

import java.util.Scanner;

public class BinarySearch_02 {
    static int binarySearch(String[] arr, String x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            int res = x.compareTo(arr[m]);

            if (res == 0)
                return m;

            if (res > 0)
                l = m + 1;

            else
                r = m - 1;
        }
        return -1;
    }

    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] arr = { "zz", "great", "abu", "shaikh"};
        System.out.print("Enter word to check present or not::");
        String x = scanner.next();
        int result = binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index::" + result);
    }
}
