public class SchachtelOverride {

    private int hoehe;
    private int breite;

    public static void main(String[] args) {
        SchachtelOverride so1 = new SchachtelOverride(0, 0);

        SchachtelOverride so2 = new SchachtelOverride(5, 10);

        SchachtelOverride so3 = new SchachtelOverride(10, 5);

        SchachtelOverride so4 = new SchachtelOverride(5, 10);

        System.out.println("so1 == so2: "+so1.equals(so2));

        System.out.println("so2 == so3: "+so2.equals(so3));

        System.out.println("so2 == so4: "+so2.equals(so4));



        System.out.println(so1);

        System.out.println(so2);

        System.out.println(so3.toString());

        System.out.println(so4.toString());
    }

    /*
            Die übergebenen Parameter hoehe und breite werden den entsprechenden Instanzvariablen zugewiesen.
     */
    public SchachtelOverride(int hoehe, int breite){
        //ist das hier quasi die Setter-Methode?
        this.hoehe = hoehe;
        this.breite = breite;
    }



    /*
            Kopieren Sie Ihren (funktionalen) Code aus Schachtelgenerator.java.
     */
    public String schachtelGenerieren(){
        StringBuilder builder = new StringBuilder();

        String space = " ";
        String pipe = "|";
        String underLinde = "_";

        builder.append(space);

        for(int i = 0; i < breite; i++) {
            builder.append(underLinde);
        }

        builder.append(space + "\n");


        for(int y = 0; y < hoehe; y++) {
            builder.append(pipe);
            for(int x = 0; x < breite; x++) {
                builder.append(space);
            }
            builder.append(pipe + "\n");
        }

        builder.append(space);
        for(int i = 0; i < breite; i++) {
            builder.append(underLinde);
        }
        builder.append(space);

        return builder.toString();

    }




    @Override
    public String toString(){
        return "Schachtel (" + hoehe + ", " + breite + ")";
    }




    /* TBD - welches Objekt?
            Die Methode soll den übergebenen Parameter obj vergleichen mit dem aktuellen Objekt (this).
            Sollte obj null sein, wird false zurückgegeben.
            Sollte this obj entsprechen, wird true zurückgegeben.
            Ansonsten sollen die Rückgaben der hashCode()-Methode von this und obj miteinander verglichen werden.
            Sollten sie gleich sein -> true, ansonsten false.
     */
    @Override
    public boolean equals(Object obj){

        SchachtelOverride s = (SchachtelOverride) obj;

        if(s == null){
            return false;
        } else if (s.breite == this.breite && s.hoehe == this.hoehe) {
            return true;
        } else if (s.breite == hashCode() && s.hoehe == hashCode()){
            return true;
        } else {
            return false;
        }

    }




    /*
            Sie werden hier einen neuen Algorithmus zur Ermittlung
            des hashCodes für jedes Objekt dieser Klasse erstellen.
            Die Basis für diesen Hash ist 42.
            Die Basis wird multipliziert mit 9 und die Instanzvariable höhe dazu addiert.
            Dies ist die neue Basis.
            Die Basis wird wieder multipliziert mit 9 und die Instanzvariable breite hinzuaddiert.
            Das Ergebnis wird zurück gegeben.
     */

    @Override
    public int hashCode(){
        int basis = 42;
        int neueBasis = ((basis * 9) + this.hoehe);
        int neueNeueBasis = ((neueBasis * 9) + this.breite);

        return neueNeueBasis;

    }

}
