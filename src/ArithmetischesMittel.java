public class ArithmetischesMittel {
    public static void main(String[] args) {
        int start = (-49);
        int ende = 5000;
        int summe = 0;
        double durchlaeufe = 0;


        for(int i = start; i <= ende; i++){
            summe += i;
            durchlaeufe += 1;
        }

        System.out.println("Die Summe aller Zahlen von " + start + " bis " + ende + " ist " + summe + " und der Durchschnitt betraegt " + (summe/durchlaeufe));
    }
}
