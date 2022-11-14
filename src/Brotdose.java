public class Brotdose {

    public static String[] dose;

    public static void main(String[] args) {
        Brotdose.printDose();

        Brotdose.setDose(new String[]{"Apfelstuecke","Tomate","Kaesebrot","Schinkenbrot","Paprikaschnitzel","Wasser"});

        System.out.println("Anzahl Brote: "+Brotdose.anzahlBrote());

        Brotdose.printDose();

    }

    public static void setDose(String[] inhalt){
        dose = inhalt;
    }

    public static boolean doseLeer(){
        if((dose == null) || (dose.length == 0) ){
            return true;
        } else {
            return false;
        }
    }


    public static int anzahlBrote(){
        String gesuchtesWort = "brot";
        int count = 0;
        if(doseLeer() == true){
            return -1;
        } else {
            for(int i = 0; i < dose.length; i++){
                if(dose[i].contains("brot")){
                    count++;
                }
            }
            return count;
        }
    }

    public static String doseAnschauen(){
        StringBuilder sb = new StringBuilder();

        if(doseLeer() == true){
            return "leer";
        } else {

            for(int i = 0; i < dose.length; i++){
                sb.append(dose[i] + ",");
            }


            return "In der Brotdose sind: " + sb.toString();

        }


    }

    public static void printDose(){
        System.out.println(doseAnschauen());
    }

}