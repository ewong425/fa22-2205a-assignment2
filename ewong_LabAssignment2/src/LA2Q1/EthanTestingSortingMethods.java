package LA2Q1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class EthanTestingSortingMethods {
    public static void main(String[] args) {
        double conversion = 10E-6;
        //header call
        header(2, 1);
        int sz = 5;
        //creating two Integer arrays of variable size set to 5
        Integer[] myArray = new Integer[sz];
        Integer[] backup = new Integer[sz];
        //Populating first array with values between 13 and 93 inclusive with a for loop.
        for(int i = 0; i<sz; i++) {
            double rand = Math.random()*(93-13) + 13;
            myArray[i] = (int)rand;
        }
        //copying the array contents into the backup
        System.arraycopy(myArray, 0, backup, 0, sz);
        //creating List with the contents of arrays
        List<Integer> newList = Arrays.asList(myArray);

        //Testing Collections Sort
        System.out.println("Testing Execution time of different sorting methods for sorting 5 random numbers: ");
        System.out.println("The unsorted list: " + newList);
        long endTime; long startTime = System.nanoTime();
        Collections.sort(newList);
        endTime = System.nanoTime();
        double time = (endTime - startTime) * conversion;
        System.out.printf("Collections' Sorting Time: %.2f milliseconds \n", time);
        System.out.println("Sorted list using collection sort: " + newList);

        //Testing with Selection Sort

        System.arraycopy(backup, 0, myArray, 0, sz); //recopy the original array with the backup
        newList = Arrays.asList(myArray); //save the array into a List to use toString
        System.out.println("\nThe unsorted list: " + newList);
        System.out.printf("My Selection-Sort Time: %.2f milliseconds \n", (double)(selectionSort(myArray)) * conversion); //call selection sort method and multiply its return by conversion of 10E-6
        System.out.println("The sorted list using selection-sort: " + newList);

        //Testing bubble sort
        System.arraycopy(backup, 0, myArray, 0, sz); //recopy the original array with the backup
        newList = Arrays.asList(myArray);
        System.out.println("\nThe unsorted list: " + newList);
        System.out.printf("My Bubble-Sort: %.2f milliseconds \n", (double)(bubbleSort(myArray)) * conversion);
        System.out.println("The sorted list using Bubble-sort: " + newList);

        //Testing insertion sort
        System.arraycopy(backup, 0, myArray, 0, sz); //recopy the original array with the backup
        newList = Arrays.asList(myArray);
        System.out.println("\nThe unsorted list: " + newList);
        System.out.printf("My Insertion-Sort: %.2f milliseconds \n", (double)(insertionSort(myArray)) * conversion);
        System.out.println("The sorted list using Insertion-sort: " + newList);

        //Testing  merge sort
        System.arraycopy(backup, 0, myArray, 0, sz); //recopy the original array with the backup
        newList = Arrays.asList(myArray);
        System.out.println("\nThe unsorted list: " + newList);
        System.out.printf("My Merge-Sort: %.2f milliseconds \n", (double)(mergeSort(myArray)) * conversion);
        System.out.println("The sorted list using Merge-sort: " + newList);

        //Testing quick sort
        System.arraycopy(backup, 0, myArray, 0, sz); //recopy the original array with the backup
        newList = Arrays.asList(myArray);
        System.out.println("\nThe unsorted list: " + newList);
        System.out.printf("My Quick-Sort: %.2f milliseconds \n", (double)(quickSort(myArray, 0, sz-1)) * conversion);
        System.out.println("The sorted list using Quick-sort: " + newList);

        //Testing Bucket sort
        System.arraycopy(backup, 0, myArray, 0, sz); //recopy the original array with the backup
        newList = Arrays.asList(myArray);
        System.out.println("\nThe unsorted list: " + newList);
        System.out.printf("My Bucket-Sort: %.2f milliseconds \n", (double)(bucketSort(myArray, 0,4,4)) * conversion);
        System.out.println("The sorted list using Bucket-sort: " + newList);
        footer(2,1);
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        double conversion = 10E-6;
//        //header call
//        header(2, 1);
//        int sz = 50000;
//        //creating two Integer arrays of variable size set to 5
//        Integer[] myArray = new Integer[sz];
//        Integer[] backup = new Integer[sz];
//        //Populating first array with values between 13 and 93 inclusive with a for loop.
//        for(int i = 0; i<sz; i++) {
//            double rand = Math.random()*(93-13) + 13;
//            myArray[i] = (int)rand;
//        }
//        //copying the array contents into the backup
//        System.arraycopy(myArray, 0, backup, 0, sz);
//        //creating List with the contents of arrays
//        List<Integer> newList = Arrays.asList(myArray);
//
//        //Testing Collections Sort
//        System.out.println("Testing Execution time of different sorting methods for sorting 50000 random numbers: ");
//        long endTime; long startTime = System.nanoTime();
//        Collections.sort(newList);
//        endTime = System.nanoTime();
//        double time = (endTime - startTime) * conversion;
//        System.out.printf("Collections' Sorting Time: %.2f milliseconds \n", time);
//
//        //Testing with Selection Sort
//        System.arraycopy(backup, 0, myArray, 0, sz); //recopy the original array with the backup
//        newList = Arrays.asList(myArray); //save the array into a List to use toString
//        System.out.printf("My Selection-Sort Time: %.2f milliseconds \n", (double)(selectionSort(myArray)) * conversion); //call selection sort method and multiply its return by conversion of 10E-6
//
//        //Testing bubble sort ***
//        System.arraycopy(backup, 0, myArray, 0, sz); //recopy the original array with the backup
//        newList = Arrays.asList(myArray);
//        System.out.printf("My Bubble-Sort: %.2f milliseconds \n", (double)(bubbleSort(myArray)) * conversion);
//
//        //Testing insertion sort ***
//        System.arraycopy(backup, 0, myArray, 0, sz); //recopy the original array with the backup
//        newList = Arrays.asList(myArray);
//        System.out.printf("My Insertion-Sort: %.2f milliseconds \n", (double)(insertionSort(myArray)) * conversion);
//
//        //Testing  merge sort
//        System.arraycopy(backup, 0, myArray, 0, sz); //recopy the original array with the backup
//        newList = Arrays.asList(myArray);
//        System.out.printf("My Merge-Sort: %.2f milliseconds \n", (double)(mergeSort(myArray)) * conversion);
//
//        //Testing quick sort
//        System.arraycopy(backup, 0, myArray, 0, sz); //recopy the original array with the backup
//        newList = Arrays.asList(myArray);
//        System.out.printf("My Quick-Sort: %.2f milliseconds \n", (double)(quickSort(myArray, 0, sz-1)) * conversion);
//
//        //Testing Bucket sort
//        System.arraycopy(backup, 0, myArray, 0, sz); //recopy the original array with the backup
//        newList = Arrays.asList(myArray);
//        System.out.printf("My Bucket-Sort: %.2f milliseconds \n", (double)(bucketSort(myArray, 0,4,2)) * conversion);
//        footer(2,1);
    }
    public static <T extends Comparable<? super T>> long selectionSort(T [] a) {
        long startTime = System.nanoTime(); //start timer
        T[] arr = a; //save input array into arr
        for(int i=0; i<arr.length-1; i++) { //tracks the boundary of the unsorted array.
            //finding the minimum element in the unsorted array
            int min = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            //swap the found minimum element with the first indexed element.
            T temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        a = arr;
        long endTime = System.nanoTime(); //stop timer
        return endTime - startTime; //return the difference in times
    }
    public static <T extends Comparable<? super T>> long bubbleSort(T[] a) {
        long startTime = System.nanoTime();
        boolean nextPass = true; //checking if a next pass is required
        T[] arr = a; //copy input array into arr
        int n = arr.length;
        //looping through each element in the array
        for(int i = 0; i < n-1; i++) {
            nextPass = false;
            //comparing each element to its neighbours and switching the element with them if it is greater
            for(int j = 0; j < n-i -1; j++) {
                if(arr[j].compareTo(arr[j+1]) > 0) { //if the prev element is greater than the next element swap them
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    nextPass = true;
                }
            }
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    public static <T extends Comparable<? super T>> long insertionSort(T[] a) {
        long startTime = System.nanoTime();
        T[] arr = a;
        int n = a.length;
        //looping through the entire unsorted list
        for(int i=1; i<n; i++) {
            T key = arr[i];
            int j = i-1;
            //compare elements to the left of them and if greater then move it into the sorted position. Save sorted items.
            while(j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j+1] = arr[j]; //swapping places
                j = j -1;
            }
            arr[j+1] = key;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    public static <T extends Comparable<? super T>> long mergeSort(T[] S) {
        long time; long startTime = System.nanoTime(); long endTime;
        int n = S.length;
        //base case when elements are in arrays of size 1
        if(n < 2) {
            endTime = System.nanoTime();
            time = endTime - startTime;
            return time;
        }
        int mid = n/2;
        //divide the array into 2 sections and copy their elements into two separate arrays
        T[] leftHalf = Arrays.copyOfRange(S, 0, mid);
        T[] rightHalf = Arrays.copyOfRange(S, mid, n);
        //recursive call
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        //merge each split
        merge(S, leftHalf, rightHalf);
        endTime = System.nanoTime();
        time = endTime - startTime;
        return time;
    }
    public static <T extends Comparable<? super T>> void merge(T[] inputArray, T[] leftHalf, T[] rightHalf) {
        int i = 0,j = 0,k = 0;
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;
        //continue while there are elements in each half of the array
        while(i < leftLength && j < rightLength) {
            //if the left half element is greater than the right half add the left half to the 'k' position
            if(leftHalf[i].compareTo(rightHalf[j]) <= 0) {
                inputArray[k] = leftHalf[i];
                i++;
            }
            //otherwise add the right half into the k position
            else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        //for the last elements during the merge add them to the end of the array
        while(i < leftLength) {
            inputArray[k] = leftHalf[i];
            i++; k++;
        }
        while(j < rightLength) {
            inputArray[k] = rightHalf[j];
            j++; k++;
        }
    }
    public static <T extends Comparable<? super T>> long quickSort(T[] s, int a, int b) {
        long endTime; long startTime = System.nanoTime();
        int n = s.length;
        //find a pivot index to chose from
        if(a < b) {
            int pivotIndex = partition(s, a, b);
            //recursive call to sort each half on either side of the pivot
            quickSort(s, a, pivotIndex);
            quickSort(s, pivotIndex+1, b);
        }
        endTime = System.nanoTime();
        return endTime - startTime;
    }
    public static <T extends Comparable<? super T>> int partition(T[] s, int startIndex, int endIndex) {
        //find the median of the array
        int pivotIndex = (startIndex + endIndex) / 2;
        //set the pivot value to the element at the pivot index
        T pivotValue = s[pivotIndex];
        startIndex--;
        endIndex++;
        while(true) {
            //starting at the first index of the sub-array we increment each index until we find a value greater than the pivot value
            do startIndex++; while(s[startIndex].compareTo(pivotValue) < 0);
            //starting at the last index we decrement until we find a value less than the pivot value
            do endIndex--; while(s[endIndex].compareTo(pivotValue) > 0);
            //breaking the loop when the front index and end index are equal or greater
            if(startIndex >= endIndex) {
                return endIndex;
            }
            //swap the values of each index
            T temp = s[startIndex];
            s[startIndex] = s[endIndex];
            s[endIndex] = temp;
        }
    }
    public static long bucketSort(Integer[] a, int first, int last, int maxDigits) {
        long endTime; long startTime = System.nanoTime();
        //create a vector with the size of 10 since we are in base-10 (decimal)
        Vector<Integer>[] bucket = new Vector[10];
        //instantiate each bucket
        for(int i = 0; i < 10; i++) {
            bucket[i] = new Vector<>();
        }
        for(int i = 0; i < maxDigits; i++) {
            //clearing the buckets
            for(int j = 0; j < 10; j++) {
                bucket[j].removeAllElements();
            }
            //placing the index element at the end of the index of bucket[digit]
            for(int index = first; index <= last; index ++) {
                Integer digit = findDigit(a[index], i);
                bucket[digit].add(a[index]);
            }
            //adding all the buckets back into the array
            int index = 0;
            for(int m = 0; m < 10; m++) {
                for(int n = 0; n < bucket[m].size(); n++) {
                    a[index++] = bucket[m].get(n);
                }
            }
        }
       endTime = System.nanoTime();
        return endTime - startTime;
    }
    //finds the digit at the ith value
    public static Integer findDigit(int number, int i) {
        int target = 0;
        for(int k = 0; k <= i; k++) { //finds the digit value at the 0th, 1st, 2nd, etc
            target = number % 10;
            number = number / 10;
        }
        return target;
    }
    public static void header(int n, int q) {
        System.out.println("Lab Assignment " + n + ", Q" + q);
        System.out.println("Prepared by: Ethan Wong");
        System.out.println("Student Number: 251205049");
        System.out.println("Goal: To see the time that it takes");
        System.out.println("=============================================");
    }
    public static void footer(int n, int q) {
        int lab = n;
        System.out.println("=============================================");
        System.out.println("Completion of Lab Assignment " + n + ", Q" + q + " is successful!");
        System.out.println("Signing off -Ethan ");
    }
}
