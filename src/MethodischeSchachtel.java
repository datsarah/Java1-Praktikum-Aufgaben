public class MethodischeSchachtel {

    //Array
    public static int x = 20;
    public static int y = 20;
    public static char[][] schachtel = new char[y][x];

    //Schachtel-Aussehen
    public static char underline = '_';
    public static char space = ' ';
    public static char pipe = '|';

    public static void main(String[] args) {
       setSchachtel(schachtel);
       printSchachtel();

    }

    public static void setSchachtel(char[][] schachtel) {
        for (int y = 0; y < schachtel.length; y++) {
            for (int x = 0; x < schachtel[y].length; x++) {
                if((y == 0) || (y == schachtel.length - 1)) {
                    if((x == 0) || (x == schachtel[y].length - 1)){
                        schachtel[y][x] = space;
                    } else {
                        schachtel[y][x] = underline;
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
    }

    public static void printSchachtel(){
        for (int y = 0; y < schachtel.length; y++) {
            for (int x = 0; x < schachtel[y].length; x++) {
                System.out.print(schachtel[y][x]);
            }
            System.out.print("\n");
        }
    }

}


