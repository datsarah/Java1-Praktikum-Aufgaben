public class CharacterSheet {

    //Felder

    public String firstName;
    public String lastName;
    public String story;
    public int type;
    public int level;


    public static void main(String[] args) {
        CharacterSheet udo = new CharacterSheet();

        udo.firstName = "Arnold";

        udo.lastName = "Strongarm";

        udo.type = 5;

        udo.level = 50;

        //udo.story = "jukgtfzusadftbouSAFI";


        CharacterSheet heini = new CharacterSheet();

        heini.firstName = "Jeebus";

        heini.lastName = "Holyhunt";

        heini.type = 2;

        heini.level = 48;



        CharacterSheet marie = new CharacterSheet();

        marie.firstName = "Clarissa";

        marie.lastName = "Amberstorm";

        marie.level = 53;



        marie.type = 6;



        System.out.println(CharacterSheet.createCharacterStats(heini));

        System.out.println(CharacterSheet.createCharacterStats(udo));

        System.out.println(CharacterSheet.createCharacterStats(marie));



    }

    public static String translateType(int type){
        switch (type){
            case 1:
                return "Bard";
            case 2:
                return "Cleric";
            case 3:
                return "Monk";
            case 4:
                return "Thief";
            case 5:
                return "Fighter";
            case 6:
                return "Magician";
            default:
                return "none";

        }
    }

    public static String createCharacterStats(CharacterSheet placeholder){

        return placeholder.firstName + " " + placeholder.lastName + " is a " + translateType(placeholder.type) + " (level " + placeholder.level + "). Character story: " + placeholder.story;
    }
}
