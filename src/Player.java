import java.util.Random;

public abstract class Player {

    public String charName;
    public int lvl;
    public String armorType;
    public String weaponType;
    public static Random ran = new Random();
    public int hitpoints;


    public Player(String name, int lvl){
        this.charName = name;
        this.lvl = lvl;
    }


    /*
    Weist der Instanzvariablen hitpoints einen Wert zu,
    der der Instanzvariablen lvl
    multipliziert dem Parameter multiplier entspricht.
     */
    public void setHitpoints(int multiplier){
        this.hitpoints = (lvl * multiplier);

    }

    public static int randomMultiplier(){
        return ran.nextInt(3)+1;
    }

    public String getWeapon(){
        return this.weaponType;
    }

    public String getArmor(){
        return this.armorType;
    }

    public abstract void healUp();

    public abstract int attack();

    public abstract String whoAmI();



}
