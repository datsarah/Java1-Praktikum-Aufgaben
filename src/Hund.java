public class Hund implements Tierable{


    public String name;
    public String futter;
    public String laut;

    public static void main(String[] args) {
        Tierable pfiffi = new Hund("Bello","Fleisch","wuff");

        System.out.println("Gibt laut: "+pfiffi.lautGeben());
    }

    public Hund(String name, String futter, String laut){
        this.name = name;
        this.futter = futter;
        this.laut = laut;
    }





    @Override
    public String fressen() {
        return "frisst " + futter;
    }

    @Override
    public String lautGeben() {
        return "macht " + laut;
    }

    public void umbenennen(String name){
        this.name = name;
    }
}
