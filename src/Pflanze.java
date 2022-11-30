public class Pflanze {

    public String name;
    public String farbe;
    public boolean istStaude;
    public boolean kannBluehen;
    public int hoehe;



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
