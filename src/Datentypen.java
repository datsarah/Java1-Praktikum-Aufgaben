public class Datentypen {
    public static void main(String[] args) {

        //Double: Teilen Sie 11215.8 durch 153.4
        double zahl1 = 11215.8, zahl2 = 153.4;
        System.out.println(zahl1/zahl2);

        //Char: Geben Sie das Unicodezeichen „A“ aus
        char buchstabe = 'A';
        System.out.println(buchstabe);

        //Char: Geben sie den Wert für 97 und 97+11 aus (siehe ASCII Tabelle)
        char zeichen = 97;
        char zeichen2 = 97+11;
        System.out.println(zeichen);
        System.out.println(zeichen2);

        //Boolean: Erstellen Sie eine beliebig benannte Variable vom Typ boolean,
        //initialisieren Sie diese mit dem Wert false und geben Sie diese aus.
        //Erstellen Sie auch eine mit dem Wert true und geben Sie diese aus.
        boolean wert1 = false, wert2 = true;
        System.out.println(wert1);
        System.out.println(wert2);

        //String: Erstellen Sie eine Variable mit dem Wert „java“ und geben Sie diese auf der Konsole aus.
        String wort = "java";
        System.out.println(wort);

        //Ganze Zahlen: Sie sollen 2212 und 4414 auf der Konsole ausgeben,
        //sowie auch deren Multiplikationsergebnis.
        //Suchen Sie selbst sinnvolle Datentypen, die groß genug, aber auch platzsparend sind.
        short number1 = 2212, number2 = 4414;
        int ergebnis = (number1 * number2);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(ergebnis);

    }
}
