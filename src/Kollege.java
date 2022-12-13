import java.util.*;
public class Kollege implements Comparable<Kollege>, IKollege{

    public int personalNummer;
    public int einstellungsJahr;
    public String name;


    public static void main(String[] args) {
        Kollege[] kollegen = new Kollege[5];

        kollegen[0] = new Kollege(123, 1985, "Heini Meyer");

        kollegen[1] = new Kollege(223, 1987, "Elfi Mueller");

        kollegen[2] = new Kollege(143, 1991, "Maria Manslagt");

        kollegen[3] = new Kollege(155, 2000, "Joerni Art");

        kollegen[4] = new Kollege(001, 1965, "Winnie Horst");




        Arrays.sort(kollegen);





        for (int i = 0; i < kollegen.length; i++) {

            System.out.println(kollegen[i]);

        }

        /*
        --Test Compare und Dienstjahre
        obj1.compareTo (obj2);
        System.out.println(kollegen[1].compareTo(kollegen[2]));
        System.out.println("Dienstjahre Kollege 1: " + kollegen[1].dienstjahre() );
         */


    }

    public Kollege(int personalNummer, int einstellungsJahr, String name){
        this.personalNummer = personalNummer;
        this.einstellungsJahr = einstellungsJahr;
        this.name = name;
    }


    @Override
    public String toString(){
        return (personalNummer + ": " + name + ", " + einstellungsJahr);
    }


    //Laut Aufgabenstellung eigentlich vergleich der Einstellungsjahre
    @Override
    public int compareTo(Kollege b) {
        int result = 0;
        //int tEinstellungsJahr = this.einstellungsJahr;
        //int bEinstellungsJahr = b.einstellungsJahr;
        int tDienstjahre = this.dienstjahre();
        int bDienstjahre = b.dienstjahre();

        if(tDienstjahre < bDienstjahre){
            result = 1;
        } else if (tDienstjahre > bDienstjahre) {
            result = -1;
        } else {
            result =  0;
        }


        return result;
    }


    @Override
    public void nameAendern(String neuerName) {
        this.name = neuerName;
    }

    @Override
    public int dienstjahre() {
        int aktuellesJahr = 2022;
        int dienstjahre = (aktuellesJahr - einstellungsJahr);
        return dienstjahre;
    }




}
