public class Katze extends Tier{

    public boolean indoor;


    public Katze(String futter, String laut, boolean indoor) {
        super(futter, laut);
        this.indoor = indoor;
    }

    /*
    Sollte die Instanzvariable indoor true sein, wird „kratzt an moebeln“ zurückgegeben.
    Sollte indoor false sein, wird „jagt maeuse“ zurückgegeben.
     */
    protected String spielen(){
        if(indoor == true){
            return "kratzt an moebeln";
        } else {
            return "jagt maeuse";
        }
    }
}
