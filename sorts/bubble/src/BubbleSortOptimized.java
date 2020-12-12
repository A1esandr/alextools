import java.util.Arrays;

public class BubbleSortOptimized {
    public static void main(String[] args){
        int[] ints = {1,201,54,7,99,44,22};
        System.out.println(Arrays.toString(ints));
        for (int a=0; a < ints.length; a++){
            //Count of iterations
            System.out.println("Iterate index: "+String.valueOf(a));
            boolean flag = false;
            for (int j=0; j < (ints.length-1); j++){
                if(ints[j] > ints[j+1]){
                    swap(ints, j, j+1);
                    flag = true;
                }
            }
            if (!flag)
                break;
        }
        System.out.println(Arrays.toString(ints));
    }

    public static void swap(int[] arr, int prev, int next){
        int nx = arr[next];
        arr[next] = arr[prev];
        arr[prev] = nx;
    }
}
