import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        Integer[] ints = {1,201,54,7,99,44,22};
        System.out.println(Arrays.toString(ints));
        sortIntegers(ints);
        System.out.println(Arrays.toString(ints));

        Integer[] others = {1231,201,54,7,99,4224,22};
        System.out.println(Arrays.toString(others));
        sort(others);
        System.out.println(Arrays.toString(others));
    }

    // For Integers
    public static void sortIntegers(Integer[] arr) {
        for(int i = 1; i < arr.length; i++) {
            Integer tmp = arr[i];
            Integer index = i;
            while (index > 0 && arr[index - 1].compareTo(tmp) > 0) {
                arr[index] = arr[index - 1];
                --index;
            }
            arr[index] = tmp;
        }
    }

    // General case
    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            T item = arr[i];
            int index = i;
            while (index > 0 && arr[index - 1].compareTo(item) > 0) {
                arr[index] = arr[--index];
            }
            arr[index] = item;
        }
    }
}
