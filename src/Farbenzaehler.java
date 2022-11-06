import java.util.Arrays;
public class Farbenzaehler {
    //vorkommen jeder Farbe zählen
    //Farben alphabetisch sortieren und mit Anzahl ausgeben
    //Arrays.sort(farben)
    //farben[i].equals(farben[i+1])

    public static String[] farben = {

            "Cornsilk","Desire","Cornsilk","Cadet","Cyan","Bistre","Fandango","Coffee","Coffee","Corn",
            "Dirt","Blond","Fuchsia","Cardinal","Amber","Deer","Coconut","Claret","Blue-Gray","Bluebonnet",
            "Dandelion","Firebrick","Ceil","Blush","Charcoal","Blue-Violet",
            "Brown-Nose","Folly","Bazaar","Fandango","Carnelian","Denim","Desert","Carmine","Avocado",
            "Emerald","Black","Eucalyptus","Amazon","Capri","Feldspar","Cerise","Champagne","Bone",
            "Artichoke","Catawba","Aureolin","Cinnabar","Copper","Feldgrau","Amber","Bisque","Byzantium",
            "Blue","Cream","Bubbles","Ceil","Bittersweet","Coquelicot","Fawn","Brass","Coral","Cinereous",
            "Eminence","Bronze","Fandango","Buff","Aureolin","Flax","Eggshell","Cordovan","Ceil",
            "Amethyst","Byzantine","Auburn","Aqua","Diamond","Amaranth","Ecru","Citrine","Fallow",
            "Chestnut","Eggplant","Camel","Ceil","Amber","Flattery","Flavescent","Aquamarine",
            "Beige","Beaver","Blue-Green","Almond","Aero","Azure","Fulvous","Burgundy","Cherry","Ceil","Burlywood","Arsenic",
            "AuroMetalSaurus","Celadon","Aureolin","Citron","Bole","Asparagus","Daffodil","Flirt","Drab","Cerulean",
            "Crimson","Blueberry","Celeste","Fandango","Ceil","Boysenberry","Chamoisee","Ebony","Amber","Flame","Apricot"
    };


    public static void main(String[] args) {


        Arrays.sort(farben);

        /*
        for(int i = 0; i < farben.length; i++){
            System.out.println(farben[i]);
        }
         */


        int zaehler = 1;
        int i;


        for(i = 0; i < farben.length; i++) {
            if ((i+1) >= farben.length){
                System.out.println(farben[i] + ": " + zaehler);
                break;
            }
            if (farben[i].equals(farben[i+1])) {
                zaehler += 1;
            } else {
                System.out.println(farben[i] + ": " + zaehler);
                zaehler = 1;
            }

        }

    }
}
