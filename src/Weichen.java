public class Weichen {
    public static void main(String[] args) {
        /*
        Bei jeder geraden Zahl soll die Zahl und „ist gerade“,
        bei jeder ungeraden Zahl „ist ungerade“ in einer eigenen Zeile in der Konsole ausgegeben werden.
        Zusätzlich soll „Halbzeit!“ ausgegeben werden, wenn 500 erreicht wurde.
        Nach der Schleife soll des Weiteren das Schlüsselwort „fertig“ auf der Konsole ausgegeben werden.
         */

        for(int i = 1000; i >= 0; i--){

            if((i%2) == 0){
                System.out.println("ist gerade");
            } else {
                System.out.println("ist ungerade");
            }

            if(i == 500){
                System.out.println("Halbzeit!");
            }
        }
        System.out.println("fertig");
    }
}
