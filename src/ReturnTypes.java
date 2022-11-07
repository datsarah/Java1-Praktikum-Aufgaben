import java.lang.StringBuilder;
import java.util.Arrays;
public class ReturnTypes {
    public static void main(String[] args) {


        int[] values = new int[]{3, 1, 7, 99, -78, 22, 100, 5, -6};

        System.out.println("Dataset 1:");

        System.out.println(ReturnTypes.statistics(values));

        System.out.println("\nDataset 2:");

        System.out.println(ReturnTypes.statistics(new int[] { -9,-5,6,7,8,9,10,11,99,200,-99,-33,-55,1000,2500,-88 }));
    }


    public static String statistics(int[] arr) {
        StringBuilder sb = new StringBuilder();
        //
        int numVal = (arr.length);
        sb.append("Number of values: " + numVal + "\n");
        //Aufruf von removeBelowZero
        int belowzero = (arr.length - removeBelowZero(arr).length);

        sb.append("Number of negative values removed: " + belowzero + "\n" );


        //Aufruf von highest
        sb.append("Highest value in dataset: " + highest(arr) + "\n");


        //Aufruf von lowest
        sb.append("Lowest value in dataset: " + lowest(arr) + "\n");


        //Aufruf von percentOf
        int part = lowest(arr);
        int total = highest(arr);
        sb.append("Lowest is " + percentageOf(part, total) +"% of highest value \n");


        return sb.toString();
    }


    public static int[] removeBelowZero(int[] arr) {
        int abovedzero = 0;
        int zaehler = 0;
        int[] newuarr = new int[arr.length];

        for (int zahl : arr) {
            if (zahl >= 0) {
                abovedzero++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                newuarr[zaehler] = arr[i];
                zaehler++;
            }
        }

        return newuarr;
    }

    public static double percentageOf(int part, int total){
        /*
        100% = zahlx
        1%   = zahlx/100
        z%   = (zahlx/100)*z
         */
        double ergebnis = 0;
        ergebnis = (total/100)*part;

        return ergebnis;
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
