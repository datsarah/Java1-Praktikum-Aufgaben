public class Garten {

    public static Pflanze[] beet;

    public static void main(String[] args) {
        Pflanze[] planten = new Pflanze[3];

        planten[0]= new Pflanze("Sonnenblume", "gelb", false, true, 180);

        planten[1]= new Pflanze("Busch", "gruen", true, true, 100);

        planten[2]= new Pflanze("Buschmalve", "rosa", true, true, 120);


        Garten.pflanzen(planten);

        Garten.alleBeschreiben();
    }

    public static void pflanzen(Pflanze[] pflanzen){
        beet = pflanzen;
    }

    public static void alleBeschreiben(){
        for (int i = 0; i < beet.length; i++){
            System.out.println(beet[i].selbstBeschreibung());
        }
    }

    public static Pflanze[] getBeet(){
        return beet;
    }


}
