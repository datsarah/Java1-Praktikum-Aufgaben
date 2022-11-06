public class Schachtel {
    public static void main(String[] args) {

        System.out.print(" ");
        for(int i = 0; i < 50; i++) {
            System.out.print("_");
        }

        System.out.println(" ");


        for(int y = 0; y < 50; y++) {
            System.out.print("|");
            for(int x = 0; x < 50; x++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        System.out.print(" ");
        for(int i = 0; i < 50; i++) {
            System.out.print("_");
        }


    }
}
