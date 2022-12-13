public class Arena {
    public Player[] players;
    public String zoneName;
    public int minLvl;
    public int maxLvl;


    public static void main(String[] args) {
        Warrior warrior = new Warrior("dude", 40);

        Mage mage = new Mage("merlin", 40);

        Rogue rogue = new Rogue("shady", 42);

        Arena gZone = new Arena("alterac", 3, 35, 45);

        gZone.identifyPlayerClass(rogue, mage);

        gZone.addPlayer(warrior);

        gZone.addPlayer(mage);

        gZone.addPlayer(rogue);

        gZone.printAllPlayers();

        System.out.println("\nFight 1:");

        gZone.fight(0, 1);

        System.out.println("\nFight 2:");

        gZone.fight(2, 0);

        System.out.println("\nFight 3:");

        gZone.fight(1, 2);

    }

    public Arena(String name, int maxPlayers, int minLvl, int maxLvl){
        this.zoneName = name;
        this.minLvl = minLvl;
        this.maxLvl = maxLvl;

        players = new Player[maxPlayers];
    }


    public boolean addPlayer(Player p) {
        boolean value = false;
        if((p.lvl > minLvl ) && ( p.lvl < maxLvl)){
            //suche nach freiem Platz im Array
            for(int i = 0; i < players.length; i++){
                if(players[i] == null){
                    //Platz im Array mit p belegen
                    players[i] = p;
                    value = true;
                } else {
                    //wenn kein Platz mehr -> error
                    System.out.println("fehler");
                    value = false;
                }
            }
        } else {
            //Fehler
            System.out.println("error");
            value = false;
        }
        return value;
    }



    public void printAllPlayers(){
        for (int i = 0; i < players.length; i++){
            System.out.println(players[i]);
        }
    }


    //TBD
    /*
    Instanzmethode.
    Die Methode soll alle Playerklassen identifizieren, die
    sich im übergebenen Parameter players befinden.

    Es soll immer das Level, die Klasse und „is
    approaching“ ausgegeben werden pro Objekt.

    Schauen Sie sich hierfür „Wie kann ich
    herausfinden, ob ein Objekt zu einer Klasse
    gehört?“ im Text oberhalb der Aufgabentabelle an.
     */
    public void identifyPlayerClass(Player ...players){
        for(int i = 0; i < players.length; i++){
            if (players[i] instanceof Player){
                System.out.println(players[i].lvl + " " + this.getClass().getName() + " is approaching" );
            }
        }

    }



    //TBD -> schöner machen... schleife?

    public void fight(int player1, int player2){
        player1 = 0;
        player2 = 0;

        int hit = players[player1].attack();
        System.out.println(fightLine(players[player1], players[player2], hit));
        players[2].hitpoints -= hit;





    }


    //TBD -> Waffe mit der angegriffen wird
    /*
    Instanzmethode.
    Gibt einen String zurück, der den Namen des
    attackers zuerst, dann den Namen des targets, die
    Waffe mit der angegriffen und der Schaden, der
    verursacht wurde, enthält.
    Schema: dude hits merlin with a sword for 80 dmg
     */
    public String fightLine(Player attacker, Player target, int value){
        return (attacker + " hits " + target + " Waffe " + " for " + value + "dmg");

    }
}