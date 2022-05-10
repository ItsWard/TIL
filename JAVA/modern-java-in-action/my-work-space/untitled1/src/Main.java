import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] test = new int[]{1,2,3,4,5,6};
        int[] test2 = new int[]{};
        System.out.println(Arrays.toString(getAllElementsButNth(test, 2)));
    }


    public int[] getEvenNumbers(int[] arr) {
        // TODO:


        if (arr.length == 0) { return new int[]{}; }

        int index = 0;
        for(int num : arr){
            if(num % 2 == 0) {
                index ++;
            }
        }

        int[] result_arr = new int[index];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                result_arr[i] = arr[i];
            }
        }


        return result_arr;
    }
//,1,23,4,5,6  === 2

    public static int[] getAllElementsButNth(int[] arr, int n) {
        // TODO:
        if (arr.length > n)
            return arr;
        if (arr.length == 0)
            return new int[]{};

        int[] result = new int[arr.length-1];
        System.arraycopy(arr, 1, result, 0, n-1);

        return result;
    }
}
