public class Tier {

    public String futter;
    public String laut;

    public static void main(String[] args) {
        Tier t1 = new Tier("schwienpott", "grunzen");

        Tier t2 = new Katze("brekkies", "miau", true);

        Katze t3 = new Katze("maeuse", "fauch", false);

        Tier[] tiere = new Tier[3];

        tiere[0] = t1;

        tiere[1] = t2;

        tiere[2] = t3;

        for (int i = 0; i < tiere.length; i++) {

            System.out.println("Tier " + i + ":");

            System.out.println(tiere[i].fressen());

            System.out.println(tiere[i].lautGeben());

            if (tiere[i] instanceof Katze)

                System.out.println(((Katze) tiere[i]).spielen()); //cast zu Katze notwending, um die Methode zu erreichen

            System.out.println();

        }
    }


    public Tier(String futter, String laut){
        this.futter = futter;
        this.laut = laut;
    }


    protected String fressen(){
        return "frisst " + futter;
    }

    protected String lautGeben(){
        return "macht " + laut;
    }

}
