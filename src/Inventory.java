public class Inventory{

    private Item[] bag = null;

    public static void main(String[] args) {


        Item one = new Item();

        one.setName("Ashkandir");

        one.setType(1);

        one.setQuality(3);

        one.setValue(2500);



        Item two= new Item();

        two.setName("Nature's Grace");

        two.setType(1);

        two.setQuality(2);

        two.setValue(500);



        Item three= new Item();

        three.setName("Cloak of Disguise");

        three.setType(0);

        three.setQuality(1);

        three.setValue(200);



        Item four = new Item();

        four.setName("Magic Plates of Awesome");

        four.setType(0);

        four.setQuality(4);

        four.setValue(4000);





        Item five = new Item();

        five.setName("Bread and Butter");

        five.setType(3);

        five.setQuality(0);

        five.setValue(20);



        Item six = new Item();

        six.setName("Dark Brew of Awakening");

        six.setType(3);

        six.setQuality(1);

        six.setValue(50);



        Item seven = new Item();

        seven.setName("Health pot");

        seven.setType(2);

        seven.setQuality(1);

        seven.setValue(60);



        Item eight = new Item();

        eight.setName("Energy pot");

        eight.setType(2);

        eight.setQuality(0);

        eight.setValue(30);





        Inventory inventory = new Inventory();

        inventory.setBagSize(10);

        inventory.addItem(one);

        inventory.addItem(two);

        inventory.addItem(three);

        inventory.addItem(four);

        inventory.addItem(five);

        inventory.addItem(six);

        inventory.addItem(seven);

        inventory.addItem(eight);

        inventory.listAllItemsOfQuality(2);

        inventory.listAllItemsOfType(1);

        inventory.lookAtInventory();





    }

    public void setBagSize(int size){
        if(size <= 0){
            bag = new Item[1];
        } else {
            bag = new Item[size];
        }
    }


    public boolean addItem(Item item){
        if(bag != null){
            for (int i = 0; i < bag.length; i++){
                if(bag[i] == null){
                    bag[i] = item;
                    System.out.println(item.describe() + " was added successfully in slot " + i);
                    return true;
                }
            }
        }

        System.out.println("no free");
        return false;
    }

    /*
    Fragt bei allen Objekten im bag Array nach,
    ob der gespeicherte Typ dem übergebenen Parameter typ entspricht.
    Sollte das der Fall sein, wird die Methode describe des Objektes verwendet,
    um eine informative Zeile auf der Konsole auszugeben.
    Achten Sie darauf, dass das bag Array
    Speicherplätze haben kann, die noch null sind und deswegen übersprungen werden müssen.
     */

    // bag = vom Typ item -> vergleichen mit int
    public void listAllItemsOfType(int type){
        if(bag != null) {
            for (int i = 0; i < bag.length; i++) {
                if ((bag[i] != null) && (bag[i].getType() == type)) {
                    System.out.println(bag[i].describe());
                }

            }
        }
    }


    /*
    Fragt bei allen Objekten im bag Array nach,
    ob die gespeicherte Qualität dem übergebenen Parameter quality entspricht.
    Sollte das der Fall sein, wird die Methode
    describe des Objektes verwendet,
    um eine informative Zeile auf der Konsole auszugeben.
    Achten Sie darauf, dass das bag Array
    Speicherplätze haben kann, die noch null sind und deswegen übersprungen werden müssen.
     */
    public void listAllItemsOfQuality(int quality){
        if(bag != null) {

            for (int i = 0; i < bag.length; i++) {
                if ((bag[i] != null) && (bag[i].getQuality() == quality)) {
                    System.out.println(bag[i].describe());
                }
            }
        }

    }



    /*
    Die Methode soll für jeden Speicherplatz im Array bag
    eine neue Zeile auf der Konsole ausgeben,
    die das Wort „slot“, die Nummer des Speicherplatzes und den
    Inhalt der describe-Methode des Objektes enthält. Sollte sich
    kein Objekt an dem Speicherplatz befinden, soll anstatt der
    describe-Methode der String „free“ ausgegeben werden.
    Des Weiteren soll der Gesamtwert des Inventars
    kalkuliert und ausgegeben werden am Schluss.
    Sehen Sie sich den Beispieloutput für diese Methode an.
     */
    public void lookAtInventory(){
        int gold = 0;
        if(bag != null) {
            for (int i = 0; i < bag.length; i++) {
                if ((bag[i] == null)){
                    System.out.println("slot " + i + ": free");
                } else {
                    gold += bag[i].getValue();
                    System.out.println("slot " + i + ": " + bag[i].describe() + " gold");
                }


            }

            System.out.println("total value: " + gold);

        }



    }

    public Item[] getBag(){
        return bag;
    }
}
