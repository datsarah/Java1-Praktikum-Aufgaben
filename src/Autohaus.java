public class Autohaus implements IAutohaus{

    public String autohausName;
    public Auto[] platz;

    public static void main(String[] args) {
        Auto a = new Auto("VW", "Golf", "silber", 2015, 110, true, 15100);

        Auto b = new Auto("Ford", "Ka", "schwarz", 2011, 69, true, 3500);

        Auto c = new Auto("Honda", "Civic", "weiss", 2015, 99, true, 11990);

        Auto d = new Auto("VW", "Up", "rot", 2017, 69, true, 9500);

        Auto e = new Auto("VW", "Tiguan", "grau", 2009, 170, true, 9900);

        Auto f = new Auto("VW", "Golf", "blau", 2020, 150, false, 25500);

        Auto g = new Auto("VW", "Up", "weiss", 2019, 69, false, 13900);



        Autohaus gbr = new Autohaus("Mega Seller", 6);



        gbr.aufDenPlatzStellen(a);

        gbr.aufDenPlatzStellen(d);

        gbr.aufDenPlatzStellen(e);

        gbr.aufDenPlatzStellen(f);

        gbr.aufDenPlatzStellen(g);

        gbr.aufDenPlatzStellen(c);

        gbr.aufDenPlatzStellen(b);

        System.out.println("1");//debug points fuer Orientierung

        gbr.anzeigeDrucken();

        System.out.println("2");

        System.out.println("3");

        System.out.println(gbr.kundenanfrage("VW", "Up", 2019));

        System.out.println("4");

        System.out.println(gbr.kundenanfrage("VW", "Golf", 2015));

        System.out.println("5");

        System.out.println(gbr.kundenanfrage("VW", "Tiguan", 2009));
    }


    public Autohaus(String autohausName, int platzGroesse){
        this.autohausName = autohausName;

        platz = new Auto[platzGroesse];
    }


    /*
            Die Methode soll ein neues Auto-Objekt namens ankauf im platz Array speichern, wenn möglich.
            Hierfür muss ein freier Speicherplatz gefunden werden,

            d.h. einer an dem sich noch kein Objekt befindet und daher java-null ist.

            Sollte ein Platz gefunden werden, soll eine Meldung auf der Konsole ausgegeben werden,
            die das Schlüsselwort „neu“ enthält und die Rückgabe der anzeige()-Methode des Auto-Objekts.

            Sollte kein freier Speicherplatz gefunden werden,
            soll eine Zeile auf der Konsole ausgegeben werden,
            die das Schlüsselwort „nicht“ enthält und auch wieder die Rückgabe der anzeige()-Methode.
     */
    @Override
    public void aufDenPlatzStellen(Auto ankauf) {

        int anzahlBelegterPlaetze = 0;

        for (int i = 0; i < platz.length; i++){
            if (platz[i] == null){
                platz[i] = ankauf;
                System.out.println("Neues Angebot bei " + autohausName + "!  "+ ankauf.anzeige());
                break;
            } else {
                anzahlBelegterPlaetze += 1;
            }
        }

        if(anzahlBelegterPlaetze == platz.length){
            System.out.println("Ankauf von " + ankauf.anzeige() + " nicht moeglich");
        }

    }


    /*
            Diese Methode soll eine Kundenanfrage simulieren Sie als Verkäufer werden
            Ihre Kartei nach einem passenden Auto durchgehen.

            Alle in der Instanzvariablen platz gespeicherten Auto-Objekte sollen angeschaut
            werden, ob sie die von der passenden Marke und Typ sind und jünger sind als das übergebene baujahr.

            Alle möglichen Treffer müssen ermittelt werden.

            Wenn ein Auto passt, soll die Rückgabe der anzeige()-Methode verwendet werden und zu einem String
            zusammen gesetzt werden mit allen anderen anzeige()-Rückgaben der anderen Treffer.

            Wenn tatsächlich passende Autos gefunden wurden, soll die Rückgabe das
            Schlüsselwort „angebot“ enthalten und die zusammengebauten anzeige()-Strings.

            Sollte nichts gefunden werden, soll die Rückgabe das Schlüsselwort „kein“ enthalten.
            Hinweis: Denken Sie daran leere Speicherplätz zu überspringen.
     */

    @Override
    public String kundenanfrage(String marke, String typ, int baujahr) {
        int counter = 0;
        String satz = "";
        for (int i = 0; i < platz.length; i++){
            if (platz[i] != null){
                //Laut Aufgabenstellung soll das Baujahr eigentlich < sein und nicht >= (siehe ....und jünger sind als das übergebene baujahr)
                if((this.platz[i].getMarke() == marke) && (this.platz[i].getTyp() == typ) && (this.platz[i].getBaujahr() >= baujahr)){
                    satz += platz[i].anzeige();
                } else {
                    counter += 1;
                }
            }
        }
        if(counter == platz.length){
            satz = "Wir haben kein Angebot für Sie";
        }

        return "Wir haben folgende Angebote für Sie: \n " + satz;
    }

    @Override
    public void anzeigeDrucken() {
        System.out.println("Alle Angebote bei " + autohausName);
        for (int i = 0; i < platz.length; i++){
            if(platz[i] != null){
                System.out.println(autohausName + "!  " + platz[i].anzeige());
            }
        }

    }
}
