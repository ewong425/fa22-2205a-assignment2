package LA2Q1;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import static java.util.Collections.disjoint;
import static java.util.Collections.sort;

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
        sort(newList);
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

        //Testing bubble sort ***
        System.arraycopy(backup, 0, myArray, 0, sz); //recopy the original array with the backup
        newList = Arrays.asList(myArray);
        System.out.println("\nThe unsorted list: " + newList);
        System.out.printf("My Bubble-Sort: %.2f milliseconds \n", (double)(bubbleSort(myArray)) * conversion);
        System.out.println("The sorted list using Bubble-sort: " + newList);

        //Testing insertion sort ***
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
//        sort(newList);
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
        long startTime = System.nanoTime();
        T[] arr = a;
        for(int i=0; i<arr.length-1; i++) {
            int min = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            T temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        a = arr;
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    public static <T extends Comparable<? super T>> long bubbleSort(T[] a) {
        long startTime = System.nanoTime();
        boolean nextPass = true;
        T[] arr = a;
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            nextPass = false;
            for(int j = 0; j < n-i -1; j++) {
                if(arr[j].compareTo(arr[j+1]) > 0) {
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
        for(int i=1; i<n; i++) {
            T key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j+1] = arr[j];
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
        if(n < 2) {
            endTime = System.nanoTime();
            time = endTime - startTime;
            return time;
        }
        int mid = n/2;
        T[] leftHalf = Arrays.copyOfRange(S, 0, mid);
        T[] rightHalf = Arrays.copyOfRange(S, mid, n);
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(S, leftHalf, rightHalf);
        endTime = System.nanoTime();
        time = endTime - startTime;
        return time;
    }
    public static <T extends Comparable<? super T>> void merge(T[] inputArray, T[] leftHalf, T[] rightHalf) {
        int i = 0,j = 0,k = 0;
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;
        while(i < leftLength && j < rightLength) {
            if(leftHalf[i].compareTo(rightHalf[j]) <= 0) {
                inputArray[k] = leftHalf[i];
                i++;
            }
            else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
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
        if(a < b) {
            int pivotIndex = partition(s, a, b);
            quickSort(s, a, pivotIndex);
            quickSort(s, pivotIndex+1, b);
        }
        endTime = System.nanoTime();

        return endTime - startTime;
    }
    public static <T extends Comparable<? super T>> int partition(T[] s, int startIndex, int endIndex) {
        int pivotIndex = (startIndex + endIndex) / 2;
        T pivotValue = s[pivotIndex];
        startIndex--;
        endIndex++;
        while(true) {
            do startIndex++; while(s[startIndex].compareTo(pivotValue) < 0);
            do endIndex--; while(s[endIndex].compareTo(pivotValue) > 0);
            if(startIndex >= endIndex) {
                return endIndex;
            }
            T temp = s[startIndex];
            s[startIndex] = s[endIndex];
            s[endIndex] = temp;
        }
    }
    public static long bucketSort(Integer[] a, int first, int last, int maxDigits) {
        long endTime; long startTime = System.nanoTime();
        Vector<Integer>[] bucket = new Vector[10];
        for(int i = 0; i < 10; i++) {
            bucket[i] = new Vector<>();
        }
        for(int i = 0; i < maxDigits; i++) {
            for(int j = 0; j < 10; j++) {
                bucket[j].removeAllElements();
            }
            for(int index = first; index <= last; index ++) {
                Integer digit = findDigit(a[index], i);
                bucket[digit].add(a[index]);
            }
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
    public static Integer findDigit(int number, int i) {
        int target = 0;
        for(int k = 0; k <= i; k++) {
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
