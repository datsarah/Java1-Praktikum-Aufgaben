import java.util.Arrays;
public class MatheHelfer {
    public static void main(String[] args) {
        // Zeilen Testbeispiel
        MatheHelfer.subtrahiere(5, 3);
        MatheHelfer.dividiere(9, 4);
        MatheHelfer.berechneFlaecheRechteck(9, 99);
        MatheHelfer.berechneVolumenRechteck(9, 99, 11);
        MatheHelfer.addiere(new int[]{1,2,3,4,5,6,7,8,9});
        MatheHelfer.median (new int[]{9,6,5,10,8,9,22});

    }

    //Parameter wert2 soll von wert1 abgezogen werden
    public static void subtrahiere(int wert1, int wert2) {
        int ergebnis = (wert1 - wert2);
        System.out.println(wert1 + "-" + wert2 + "=" + ergebnis);
    }

    //Parameter wert1 soll geteilt werden durch wert2
    public static void dividiere(int wert1, int wert2){
        double ergebnis = (wert1/wert2);
        System.out.println(wert1 + "/" + wert2 + "=" + ergebnis);

    }

    //Fläche Rechteck: a*b
    public static void berechneFlaecheRechteck(int seite1, int seite2){
        int ergebnis = (seite1*seite2);
        System.out.println("Flaeche Rechteck mit Seiten " + seite1 + "," + seite2 + ": " + ergebnis);

    }

    // Volumen Rechteck = a*b*c
    public static void berechneVolumenRechteck(int seite1, int seite2, int hoehe){
        int ergebnis = (seite1*seite2*hoehe);
        System.out.println("Volumen Rechteck mit Seiten " + seite1 + "," + seite2 + " und Hoehe " + hoehe + ": " + ergebnis);

    }


    // Zahlen Array addieren
    public static void addiere(int[] zahlen){
        int ergebnis = 0;
        for(int i = 0; i < zahlen.length; i++){
            ergebnis += zahlen[i];
        }
        System.out.println("Summe der Zahlen " + ergebnis);

    }


    //Median = Wert der genau in der Mitte einer Datenverteilung liegt
    public static void median(int[] zahlen){

        System.out.print("Zahlen: ");
        for(int i = 0; i < zahlen.length; i++){
            System.out.print(zahlen[i] + ", ");
        }

        Arrays.sort(zahlen);
        int stelle = (zahlen.length/2)+1;
        System.out.println("Median: " + zahlen[stelle]);

    }

}
