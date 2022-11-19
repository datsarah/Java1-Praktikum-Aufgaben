public class Item {

    private String name;
    private int type;
    private int value;
    private int quality;

    public static void main(String[] args) {
        Item i = new Item();

        i.setName("Ashkandir");

        i.setType(1);

        i.setQuality(3);

        i.setValue(2500);

        System.out.println(i.describe());



    }

    public void setName(String name){
        this.name = name;
    }

    public void setType(int type){
        this.type = type;
    }

    public void setValue(int value){
        this.value = value;
    }

    public void setQuality(int quality){
        this.quality = quality;
    }

    public String getName(){
        return this.name;
    }

    public int getType(){
        return this.type;
    }

    public int getQuality(){
        return this.quality;
    }

    public int getValue(){
        return this.value;
    }

    private String translateType(){
        switch (type){
            case 0:
                return "armor";
            case 1:
                return "weapon";
            case 2:
                return "potion";
            case 3:
                return "consumable";
            default:
                return " ";

        }
    }

    private String translateQuality(){
        switch (quality){
            case 0:
                return "average";
            case 1:
                return "unusual";
            case 2:
                return "rare";
            case 3:
                return "epic";
            case 4:
                return "legendary";
            default:
                return " ";
        }
    }

    public String describe(){
        return (this.name + "," + translateType() + " (" + translateQuality() + "), " + this.value);
    }

}