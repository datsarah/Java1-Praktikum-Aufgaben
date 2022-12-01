public class Pflanze {

    public String name;
    public String farbe;
    public boolean istStaude;
    public boolean kannBluehen;
    public int hoehe;

    public static void main(String[] args) {
        Pflanze[] planten = new Pflanze[3];



        planten[0]= new Pflanze("Sonnenblume", "gelb", false, true, 180);

        planten[1]= new Pflanze("Busch", "gruen", true, true, 100);

        planten[2]= new Pflanze("Buschmalve", "rosa", true, true, 120);

        Garten.pflanzen(planten);

        Garten.alleBeschreiben();
    }



    public Pflanze(String name, String farbe, boolean istStaude, boolean kannBluehen, int hoehe){
        this.name = name;
        this.farbe = farbe;
        this.istStaude = istStaude;
        this.kannBluehen = kannBluehen;
        this.hoehe = hoehe;
    }

    public String selbstBeschreibung() {

        String statusBluete = (kannBluehen ? "bluehend" : "nicht bluehend");
        String statusStaude = (istStaude ? "Staude" : "Einjaehrig");

        return (name + " (" + statusStaude + "), " + farbe + ", " + hoehe + " hoch, " + statusBluete);

    }

}