public class Mage extends Player{


    public Mage(String name, int lvl){
        super(name, lvl);
        armorType = "cloth";
        weaponType = "magic spell";
        healUp();
    }

    public String whoAmI(){
        return this.getClass().getName() + " " + charName + " (" + lvl + "), " + armorType + " " + weaponType;
    }

    public int attack(){
        return lvl*randomMultiplier()*5;
    }

    public void healUp(){
        setHitpoints(40);
    }


}
