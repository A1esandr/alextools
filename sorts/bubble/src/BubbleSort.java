import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] ints = {201,54,7,99,44,22};
        System.out.println(Arrays.toString(ints));
        for (int a=0; a < ints.length; a++){
            for (int j=0; j < (ints.length-1); j++){
                swap(ints, j, j+1);
            }
        }
        System.out.println(Arrays.toString(ints));
    }

    public static void swap(int[] arr, int prev, int next){
        int pr = arr[prev];
        int nx = arr[next];
        if(arr[prev] > arr[next]){
            arr[next] = pr;
            arr[prev] = nx;
        }
    }

}
