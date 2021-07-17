package com.bl.programs;

public class BubbleSort_04 {
    public static void main(String[] args) {
        int arr[] = {34,22,10,78};
        System.out.println("Array before sort");
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]+ " ");
        bubbleSort(arr);
        System.out.println("Array after bubble sort");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        int i;
        for (i=0; i< arr.length; i = i + 1) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    private static void bubbleSort(int[] arr) {
        int i= arr.length;
        int temp = 0;
        for (int n = 0; n< arr.length; n = n + 1){
            int key = arr[n];
            int j= n-1;
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
}
