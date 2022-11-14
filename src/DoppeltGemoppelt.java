
public class DoppeltGemoppelt {


    public static void main(String[] args) {
        say(new String[] { "Hallo", "ihr", "da!" });

        say(new char[] { 'A', 'B', 'C' });

        System.out.println(add(new int[] { 3, 4, 5 }));

        System.out.println(add(new double[] { 4.5, 5.5 }));

        System.out.println(paint("*.*.*.",10));

        System.out.println(paint(5,"#"));



    }

    public static void say(String[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void say(char[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static int add(int[] arr){
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            counter += arr[i];
        }
        return counter;
    }

    public static double add(double[] arr){
        double count = 0.0;
        for(int i = 0; i < arr.length; i++){
            count += arr[i];
        }
        return count;
    }

    public static String paint(String item, int times){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < times; i++){
            sb.append(item);
        }
        return sb.toString();
    }

    public static String paint(int times, String item){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < times; i++){
            sb.append(item + "\n");
        }
        return sb.toString();
    }

}