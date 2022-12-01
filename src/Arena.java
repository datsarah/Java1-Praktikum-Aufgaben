public class Arena {
    public Player[] players;
    public String zoneName;
    public int minLvl;
    public int maxLvl;


    public static void main(String[] args) {

    }

    public Arena(String name, int maxPlayers, int minLvl, int maxLvl){
        this.zoneName = name;
        this.minLvl = minLvl;
        this.maxLvl = maxLvl;

        players = new Player[maxPlayers];
    }


    /*
    Diese Methode soll einen freien Platz im players-Array finden
    und den übergebenen Player p dort speichern, unter der Vorraussetzung,
    dass p’s Level in die Reichweite zwischen minLvl und maxLvl passt.

    Sollte p einen zu niedrigen oder zu hohen Level haben,
    wird eine Fehlermeldung auf der Konsole ausgegeben,
    die das Schlüsselwort „error“ enthält und false zurückgegeben.

    Sollte die Voraussetzung für das Level erfüllt
    und ein freier Platz vorhanden sein, wird true zurückgegeben.

    Sollte kein Platz gefunden werden, wird eine Fehlermeldung
    auf der Konsole ausgegeben, die das Schlüsselwort „error“ enthält und false zurückgegeben.
     */
    public boolean addPlayer(Player p){
        boolean full = false;
        if((p.lvl < minLvl) || (p.lvl > maxLvl)){
            System.out.println("error");
            return false;
        } else {
            for(int i = 0; i < players.length; i++){
                if(players[i] != null){
                    full = true;
                } else {
                    players[i] = p;
                    return true;
                    break;
                }
            }
        }
        

    }
}
