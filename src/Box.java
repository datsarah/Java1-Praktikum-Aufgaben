import java.util.Arrays;
import java.util.Random;

public class Box implements Comparable<Box> {

    public int hoehe;
    public int breite;
    public int tiefe;



    public static void main(String[] args) {
        Random rand = new Random();

        Box[] arr= new Box[10];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = new Box(rand.nextInt(100), rand.nextInt(100), rand.nextInt(100));

        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }

        //Vergleich Objekt arr 1 mit Objekt arr 2
        //obj1.compareTo (obj2);
        System.out.println(arr[1].compareTo(arr[2]));



    }


    public Box(int hoehe, int breite, int tiefe){
        this.hoehe = hoehe;
        this.breite = breite;
        this.tiefe = tiefe;
    }


    /*
            Gibt einen String zurück, der alle Instanzvariablen und das daraus berechnete Volumen, enthält.
            (Sie überschreiben die Methode, damit der Output später komfortabler wird,
            denn toString() wird automatisch aufgerufen, sobald man versucht ein Objekt auszugeben.)
     */
    @Override
    public String toString(){
        // V = a*b*c

        int volumen = hoehe * breite * tiefe;

        return "Hoehe: " + hoehe + ", Breite: " + breite + ", Tiefe: " + tiefe + ", Volumen: " + volumen;
    }



    @Override
    public int compareTo(Box b) {
        int tVolumen = this.hoehe * this.breite * this.tiefe;
        int bVolumen = b.hoehe * b.breite * b.tiefe;

        int result = 0;

        if(tVolumen > bVolumen){
            result = 1;
        } else if (tVolumen < bVolumen) {
            result = -1;
        } else {
            result =  0;
        }


        return result;
    }
}
