package com.bl.programs;

import java.util.Dictionary;
import java.util.Scanner;

public class InsertingSort_03 {
        public static void main(String a[])
        {
            int[] myArray  = {860,8,200,9};

            System.out.println("Before Insertion Sort");

            printArray(myArray);

            insertionSort(myArray);

            System.out.println("After Insertion Sort");

            printArray(myArray);
        }
        public static void insertionSort(int arr[])
        {
            int n = arr.length;

            for (int i = 1; i < n; i++)
            {
                int key = arr[i];
                int j = i-1;

                while ( (j > -1) && ( arr [j] > key ) )
                {
                    arr [j+1] = arr [j];
                    j--;
                }
                arr[j+1] = key;
                printArray(arr);
            }
        }

        static void printArray(int[] array){
            for(int i=0; i < array.length; i++)
            {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
}
