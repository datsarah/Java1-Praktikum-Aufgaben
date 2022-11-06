public class Regenbogen {
    public static void main(String[] args) {
        // (rot, orange, gelb, gruen, blau, indigo und violett)

        String rot = "rot";
        String orange = "orange";
        String gelb = "gelb";
        String gruen = "gruen";
        String blau = "blau";
        String indigo = "indigo";
        String violett = "violett";

        String[] regenbogen = new String[7];
        regenbogen[0] = "rot";
        regenbogen[1] = "orange";
        regenbogen[2] = "gelb";
        regenbogen[3] = "gruen";
        regenbogen[4] = "blau";
        regenbogen[5] = "indigo";
        regenbogen[6] = "violett";

        //String[] regenbogen2 = {"rot", "orange", "gelb", "gruen", "blau", "indigo", "violett"};

        System.out.println("Die Farben des Regenbogens sind (variable):");
        System.out.println(rot);
        System.out.println(orange);
        System.out.println(gelb);
        System.out.println(gruen);
        System.out.println(blau);
        System.out.println(indigo);
        System.out.println(violett);


        System.out.println("Die Farben des Regenbogens sind (array):");
        for(int i = 0; i < regenbogen.length; i++){
            System.out.println(regenbogen[i]);
        }


    }
}
