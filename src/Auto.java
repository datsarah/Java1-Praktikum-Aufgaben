public class Auto implements IAuto{

    private String marke;
    private String typ;
    private String farbe;
    private int baujahr;
    private int preis;
    private boolean gebraucht;
    private int ps;


    public Auto(String marke, String typ, String farbe,int baujahr, int ps, boolean gebraucht, int preis){
        this.marke = marke;
        this.typ = typ;
        this.farbe = farbe;
        this.baujahr = baujahr;
        this.ps = ps;
        this.gebraucht = gebraucht;
        this.preis = preis;
    }


    @Override
    public String getMarke() {
        return marke;
    }

    @Override
    public String getTyp() {
        return typ;
    }

    @Override
    public String getFarbe() {
        return farbe;
    }

    @Override
    public int getBaujahr() {
        return baujahr;
    }

    @Override
    public int getPreis() {
        return preis;
    }

    @Override
    public int getPs() {
        return ps;
    }

    //Getter Boolean -> Präfix ist statt get
    @Override
    public boolean istGebraucht() {
        return gebraucht;
    }

    @Override
    public String anzeige() {
        String status = "leer";
        if(gebraucht == true){
            status = "Gebrauchter ";
        } else {
            status = "Neuer ";
        }

        return status + getMarke() + " " + getTyp() + "(BJ: " + getBaujahr() + ", " + getPs() + " PS) - " + getFarbe() + ", " + getPreis() + " Euro";
    }
}
