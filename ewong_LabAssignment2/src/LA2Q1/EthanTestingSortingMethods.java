package LA2Q1;
import java.util.Arrays;
import java.util.Vector;

public class EthanTestingSortingMethods {
    public static void main(String[] args) {
        //header call
        header(2, 1);
        int sz = 5;
        //creating two Integer arrays of variable size set to 5
        Integer[] myArray = new Integer[sz];
        Integer[] backup = new Integer[sz];
        //Populating first array with values between 13 and 93 inclusive with a for loop.
        for(int i = 0; i<sz; i++) {
            myArray[i] = Math.ra() * (93-13) + 13;
        }
    }
    public static <T extends Comparable<? super T>> long selectionSort(T [] a) {
        long time; long startTime = System.nanoTime();
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
        time = endTime - startTime;
        return time;
    }
    public static <T extends Comparable<? super T>> long bubbleSort(T[] a) {
        long time; long startTime = System.nanoTime();
        boolean nextPass = true;
        T temp;
        T[] arr = a;
        for(int i = 1; i<arr.length -1; i++) {
            nextPass = false;
            for(int j = 1; j<arr.length-i; j++) {
                if(arr[j].compareTo(arr[j+1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    nextPass = true;
                }
            }
        }
        a = arr;
        long endTime = System.nanoTime();
        time = endTime - startTime;
        return time;
    }
    public static <T extends Comparable<? super T>> long insertionSort(T[] a) {
        long time; long startTime = System.nanoTime();
        int l, j = 0;
        T[] arr = a;
        for(int i = 1; i<arr.length -1; i++) {
            T key = arr[i];
            for(j = i-1; j>0 && arr[j].compareTo(key)>0; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
        a = arr;
        long endTime = System.nanoTime();
        time = endTime - startTime;
        return time;
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
        long time, endTime; long startTime = System.nanoTime();
        int n = s.length;
        if(a < b) {
            int pivotIndex = partition(s, a, b);
            quickSort(s, a, pivotIndex);
            quickSort(s, pivotIndex+1, b);
        }
        endTime = System.nanoTime();
        time = endTime - startTime;
        return time;
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
        long time, endTime; long startTime = System.nanoTime();
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
        time = endTime - startTime;
        return time;
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
        System.out.println("Goal: To realize Stacks and Queues using the Linked List data structure");
        System.out.println("=============================================\n");
    }
    public static void footer(int n, int q) {
        int lab = n;
        System.out.println("=============================================");
        System.out.println("Completion of Lab Assignment " + n + ", Q" + q + " is successful!");
        System.out.println("Signing off -Ethan ");
    }

}
