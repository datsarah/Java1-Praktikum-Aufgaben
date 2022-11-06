public class SchachtelReloaded {
    public static short groesse = 50;

    public static void main(String[] args) {

        char unterstrich = '_';
        String space = " ";
        char strich = '|';

        System.out.print(space);
        for(int i = 0; i < groesse; i++) {
            System.out.print(unterstrich);
        }
        System.out.print(space);

        System.out.println();


        for(int y = 0; y < groesse; y++) {
            System.out.print(strich);
            for(int x = 0; x < groesse; x++) {
                System.out.print(space);
            }
            System.out.println(strich);
        }

        System.out.print(space);
        for(int i = 0; i < groesse; i++) {
            System.out.print(unterstrich);
        }
        System.out.print(space);


    }
}
