public class AutoSchachtelgenerator {

    private int hoehe;
    private int breite;

    public static void main(String[] args) {

        //vergleichen Sie mal das Testbeispiel aus Schachtelgenerator mit diesem hier

        AutoSchachtelgenerator schachtel1 = new AutoSchachtelgenerator(5,7);


        System.out.println(schachtel1.schachtelGenerieren());

        //was faellt auf?



    }

    public AutoSchachtelgenerator(int hoehe, int breite){
        this.hoehe = hoehe;
        this.breite = breite;

    }



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



}