import java.util.Arrays;

public class Main{
    public static void main(String[] args) {

        int[] arr = {5, 8, 2, 99};
        System.out.println(lowest(arr));
        System.out.println(highest(arr));
    }
    public static int lowest(int[] arr){
        Arrays.sort(arr);
        int lowestNumber = arr[0];

        //System.out.println(arr[0]);
        return lowestNumber;
    }

    public static int highest(int[] arr){
        Arrays.sort(arr);
        int highestNumber = arr[arr.length-1];

        return highestNumber;
    }
}
