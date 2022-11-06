import java.util.Arrays;
public class NotAnotherSchachtel {
     /* [Reihe][Position in der Reihe]

     x x x x x x x x x x x x x
     x
     x
     x
     x
     x
     x
     x
     x
     x
     x

    */

    public static char[][] schachtel = new char[10][12];


    public static void main(String[] args) {

        char space = ' ';
        char unterstrich = '_';
        char pipe = '|';


        // System.out.println();



        //
        for (int y = 0; y < schachtel.length; y++) {
            //System.out.println(y + " == " + schachtel.length);
            for (int x = 0; x < schachtel[y].length; x++) {
                // System.out.println(x + " == " + schachtel[y].length);
                if((y == 0) || (y == schachtel.length - 1)) {
                    if((x == 0) || (x == schachtel[y].length - 1)){
                        schachtel[y][x] = space;
                    } else {
                        schachtel[y][x] = unterstrich;
                    }

                } else {
                    if((x == 0) || (x == schachtel[y].length - 1)){
                        schachtel[y][x] = pipe;
                    } else {
                        schachtel[y][x] = space;
                    }

                }
            }
        }

        for (int y = 0; y < schachtel.length; y++) {

            for (int x = 0; x < schachtel[y].length; x++) {

                System.out.print(schachtel[y][x]);

            }

            System.out.print("\n");

        }


    }
}
