public class Rogue extends Player {

    public Rogue(String name, int lvl){
        super(name, lvl);
        armorType = "leather";
        weaponType = "dagger";
        healUp();
    }

    public String whoAmI(){
        return this.getClass().getName() + " " + charName + " (" + lvl + "), " + armorType + " " + weaponType;
    }

    public int attack(){
        return (int) (lvl*randomMultiplier()*3.5);
    }

    public void healUp(){
        setHitpoints(45);
    }
}
