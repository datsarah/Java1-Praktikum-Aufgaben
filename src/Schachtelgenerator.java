public class Schachtelgenerator {

    private int hoehe;
    private int breite;

    public static void main(String[] args) {
        Schachtelgenerator schachtel1 = new Schachtelgenerator();

        schachtel1.setHoehe(5);

        schachtel1.setBreite(7);

        System.out.println(schachtel1.schachtelGenerieren());

    }

    public void setHoehe(int hoehe){
        this.hoehe = hoehe;
    }

    public void setBreite(int breite){
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
