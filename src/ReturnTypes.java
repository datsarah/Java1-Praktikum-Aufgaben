import java.lang.StringBuilder;
public class ReturnTypes {
    public static void main(String[] args) {


        int[] values = new int[]{3, 1, 7, 99, -78, 22, 100, 5, -6};

        System.out.println("Dataset 1:");

        System.out.println(ReturnTypes.statistics(values));

        System.out.println("\nDataset 2:");

        //System.out.println(ReturnTypes.statistics(new int[] { -9,-5,6,7,8,9,10,11,99,200,-99,-33,-55,1000,2500,-88 }));
    }


    public static String statistics(int[] arr) {
        //removeBelowZero
        int belowzero = arr.length - removeBelowZero(arr).length;
        StringBuilder sb = new StringBuilder();
        sb.append("Wert ist " + belowzero);
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
        int hundert = 100;
        total = part*(hundert/1);
        return total;
    }
}
