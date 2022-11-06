public class KleinesEinmalEins {
    /*
     * for(...){ Zeilen } for(...){ Spalten }
     */

    public static void main(String[] args) {

        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {

                System.out.print(b * a + " " + '\t');
//              System.out.print("a:" + a + " ");
//				System.out.print("b:" + b + " ");
//				System.out.print("b*2:" + b*2 + " b*b:" + (b*b) + " " + "b*a:" + (b*a) + " ");
//				System.out.print("b*4:" + b*4 + " b*b:" + (b*b) + " " + "b*a:" + (b*a) + " ");
//				System.out.print("b*8:" + b*8 + " b*b:" + (b*b) + " " + "b*a:" + (b*a) + " ");
            }
            System.out.println(" ");
        }
    }
}
