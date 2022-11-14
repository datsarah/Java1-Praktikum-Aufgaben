public class VariableArgumente {


    public static void main(String[] args) {
        System.out.println("Summe: "+sum(4,7,98,100));

        System.out.println("Durchschnitt: "+average(3.6,7.9,22.1,99));

        System.out.println("Vorwaerts:");

        printTexts(true, "aloha","hawaii","fun","sun","good times","beach");

        System.out.println("Rueckwaerts:");

        printTexts(false, "aloha","hawaii","fun","sun","good times","beach");

        printSchachteln(3,4,5,6,7,8,9,10);



    }

    //Die Summe aller Werte von numbers wird ermittelt
    public static int sum(int... numbers){
        int summe = 0;
        for (int i = 0; i < numbers.length; i++){
            summe += numbers[i];
        }
        return summe;
    }


    //Durchschnittswert aller Zahlen in numbers wird berechnet
    public static double average(double... numbers){
        double summe = 0.0;
        double durchschnitt = 0.0;
        for (int i = 0; i < numbers.length; i++){
            summe += numbers[i];
        }
        return durchschnitt = summe/ numbers.length;
    }


    //Die Methode berechnet base hoch exponents[i]
    public static void powers(int base, double... exponents){
        for (int i = 0; i < exponents.length; i++){
            System.out.println(Math.pow( base,exponents[i]));
        }
    }



    //True -> Elemente werden der Reihe nach ausgegeben
    //False -> Elemente werden Rueckwaerts ausgegeben
    public static void printTexts(boolean order, String... sentences){

        if(order == true){
            for (int i = 0; i < sentences.length; i++){
                System.out.println(sentences[i]);
            }
        } else {
            for(int i = sentences.length - 1; i >= 0; i--){
                System.out.println(sentences[i]);
            }
        }
    }


    //Schachteln ausgeben: so viele wie in sizes entahlten, groesse = siehe Wert
    public static void printSchachteln(int... sizes){
        for (int i = 0; i < sizes.length; i++){
            System.out.println(generateSchachtel(sizes[i]));
        }

    }

    //verschieden grosse Schachteln werden erstellt
    public static String generateSchachtel(int size) {
        StringBuilder sb = new StringBuilder();

       String unterstrich = "_";
       String pipe = "|";
       String space = " ";

       sb.append(" ");

       for(int i = 0; i < size; i++){
           sb.append(unterstrich);
       }

       sb.append(" " + "\n");

        for(int y = 0; y < size; y++) {
            sb.append(pipe);
            for(int x = 0; x < size; x++) {
                sb.append(space);
            }
            sb.append(pipe + "\n");
        }

        sb.append(" ");
        for(int i = 0; i < size; i++) {
            sb.append(unterstrich);
        }
        sb.append(" ");

        return sb.toString();
    }
}