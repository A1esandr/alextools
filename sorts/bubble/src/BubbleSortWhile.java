import java.util.Arrays;

public class BubbleSortWhile {
    public static void main(String[] args){
        int[] ints = {1,201,54,7,99,44,22};
        System.out.println(Arrays.toString(ints));

        int a = 0;
        while(a < ints.length) {
            //Count of iterations
            System.out.println("Iterate index: "+String.valueOf(a));
            boolean flag = false;
            int j = 0;
            while(j < (ints.length-1)) {
                if(ints[j] > ints[j+1]){
                    swap(ints, j, j+1);
                    flag = true;
                }
                j++;
            }
            if (!flag)
                break;
            a++;
        }
        System.out.println(Arrays.toString(ints));
    }

    public static void swap(int[] arr, int prev, int next){
        int nx = arr[next];
        arr[next] = arr[prev];
        arr[prev] = nx;
    }
}
