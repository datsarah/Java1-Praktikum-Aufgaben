public class Warrior extends Player {

    public Warrior(String name, int lvl){
        super(name, lvl);

    }

    /*
    Gibt einen String zurück, der den Namen der Klasse (Warrior),
    die Instanzvariablen charName, lvl, armor und weapon verbindet .
    Schema à Warrior dude (lvl 40), wears plates and a sword
     */
    public String whoAmI(){
        return this.getClass().getName() + " " + charName + " (" + lvl + "), " + armorType + " " + weaponType;
    }

    public int attack(){
        return lvl*randomMultiplier()*2;
    }

    public void healUp(){
        setHitpoints(50);
    }
}
