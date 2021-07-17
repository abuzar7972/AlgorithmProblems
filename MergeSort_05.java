package com.bl.programs;

public class MergeSort_05 {
        void mergeArray(int sortableArray[], int startPoint, int midPoint, int endPoint) {

            int left = midPoint - startPoint + 1;
            int right = endPoint - midPoint;

            int LeftArray[] = new int[left];
            int RightArray[] = new int[right];

            for (int x = 0; x < left; ++x) {
                LeftArray[x] = sortableArray[startPoint + x];

            }

            for (int x = 0; x < right; ++x) {
                RightArray[x] = sortableArray[midPoint + 1 + x];

            }

            int x = 0;
            int y = 0;
            int z = startPoint;
            while (x < left && y < right) {
                if (LeftArray[x] <= RightArray[y]) {
                    sortableArray[z] = LeftArray[x];
                    x++;
                } else {
                    sortableArray[z] = RightArray[y];
                    y++;
                }
                z++;
            }
            while (x < left) {
                sortableArray[z] = LeftArray[x];
                x++;
                z++;
            }

            while (y < right) {
                sortableArray[z] = RightArray[y];
                y++;
                z++;
            }
        }

        void sortArray(int arr[], int startingPoint, int endingPoint) {
            if (startingPoint < endingPoint) {
                int middlePoint = (startingPoint + endingPoint) / 2;
                sortArray(arr, startingPoint, middlePoint);
                sortArray(arr, middlePoint + 1, endingPoint);
                mergeArray(arr, startingPoint, middlePoint, endingPoint);
            }

        }

    }

    class MergeSortExample{
        public static void main(String args[])
        {
            int unsortedArray[] = {40, 29, 45, 5, 11, 84, 12};
            MergeSort_05 mergeSort = new MergeSort_05();


            mergeSort.sortArray(unsortedArray, 0, unsortedArray.length-1);
            System.out.println("Aray after merge sort");

            System.out.println();

            for(int item: unsortedArray)
            {
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }
