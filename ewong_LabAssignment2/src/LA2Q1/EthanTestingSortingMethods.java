package LA2Q1;
public class EthanTestingSortingMethods {
    public static <T extends Comparable<? super T>> long selectionSort(T [] a) {
        T[] arr = a;
        for(int i=0; i<arr.length - 1; i++) {
            T outerIndex = a[i];
            for(outerIndex =)
        }
    }
    public static <T extends Comparable<? super T>> long bubbleSort(T[] a) {
        boolean nextPass = true;
        T temp;
        T[] arr = a;
        for(int i = 1; i<arr.length -1; i++) {
            nextPass = false;
            for(int j = 1; j<arr.length-i; j++) {
                if(arr[j].compareTo(arr[j+1] > 0) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    nextPass = true;
                }
            }
        }
    }
    public static <T extends Comparable<? super T>> long insertionSort(T[] a) {
        int l, j = 0;
        for(int i = 1; i<a.length -1; i++) {
            T key = a[i];
            for(j = i-1; j>0 && a[j].compareTo(key)>0; j--) {
                a[j+1] = a[j];
            }
            a[j+1] = key;
        }
        for(int k=0; k<a.length; k++) {
            return ;
        }
    }
    public static <T extends Comparable<? super T>> long mergeSort(T[] S) {

    }
    public static <T extends Comparable<? super T>> long quickSort(T[] s, int a, int b) {

    }
    public static long bucketSort(Integer[] a, int first, int last, int maxDigits) {

    }
    public int compareTo(int p){
        int rv = 0;
        if(sz[a] > p) {
            rv =
        }
    }
    public static void main(String[] args) {

    }
}
