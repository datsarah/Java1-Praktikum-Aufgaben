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

        // Abruf Größe des Arrays arr
        sb.append("Number of values: " + arr.length + "\n");

        // Abruf von removeBelowZero
        int belowzero = (arr.length - removeBelowZero(arr).length);

        sb.append("Number of negative values removed: " + belowzero + "\n");


        // Abruf von highest
        //sb.append("Highest value in dataset: " + highest(arr) + "\n");
        sb.append("Highest value in dataset: "  + highest(removeBelowZero(arr)) + "\n");


        // Abruf von lowest
        //sb.append("Lowest value in dataset: " + lowest(arr) + "\n");
        sb.append("Lowest value in dataset: "  + lowest(removeBelowZero(arr)) + "\n");


        //percentof
        //int part = lowest(arr);
        //int total = highest(arr);
        int part = lowest(removeBelowZero(arr));
        int total = highest(removeBelowZero(arr));
        sb.append("Lowest is " + percentageOf(part, total)+ " of highest value \n ");



        return sb.toString();
    }


    public static int[] removeBelowZero(int[] arr) {
        int abovedzero = 0;
        int zaehler = 0;


        for (int zahl : arr) {
            if (zahl >= 0) {
                abovedzero++;
            }
        }

        int[] newuarr = new int[abovedzero];


        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                newuarr[zaehler] = arr[i];
                zaehler++;
            }
        }

        return newuarr;
    }

    public static double percentageOf(int part, int total){

        double partD = part;
        double totalD = total;
        double ergebnis = (partD/totalD)*100;


        return ergebnis;
    }


    public static int lowest(int[] arr){
        Arrays.sort(arr);
        int lowestNumber = arr[0];
        return lowestNumber;
    }

    public static int highest(int[] arr){
        Arrays.sort(arr);
        int highestNumber = (arr[arr.length - 1]);
        return highestNumber;
    }
}