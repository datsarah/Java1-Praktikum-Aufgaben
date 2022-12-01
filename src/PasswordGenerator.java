import java.util.Random;

public class PasswordGenerator {

   private Random rand;
   private char[] password;

   //Potentielle PW-Zeichen
   private final static char[] OPTIONS = new char[] { '!', '_', '-', '?', '*',
           'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
           'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'Y', 'X', 'Y', 'Z', 'a',
           'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'o', 'p',
           'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z','1','2','3','4','5',
           '6','7','8','9','0' };

   public static void main(String[] args) {

      new PasswordGenerator(8);
      new PasswordGenerator(12);
      new PasswordGenerator(16);


   }

   public PasswordGenerator(int length){
      password = initializeArray(length);
      rand = new Random();
      createPassword();
      printPassword();

   }

   private char[] initializeArray(int value){
      char[] neuArr;
      if(value <= 0){
         return neuArr = new char[8];
      } else {
         return neuArr = new char[value];
      }
   }


   //Zufallswert aus dem Wertebereich (Anzahl der Speicherplätze) der Konstante OPTIONS
   private int generateRandom(){

      int nxt = rand.nextInt(OPTIONS.length);

      return nxt;
   }


   private char getChar(){
      char einzel = OPTIONS[generateRandom()];
      return einzel;
   }

   private void createPassword(){
      for(int i = 0; i < password.length; i++){
         password[i] = getChar();
      }
   }

   private void printPassword(){
      StringBuilder sb = new StringBuilder();

      for (int i = 0; i < password.length; i++){
         sb.append(password[i]);
      }
      System.out.println(sb.toString());
   }

   //Nur für die JUnit-Tests
   public Random getRand(){
      return rand;
   }

   //Nur für die JUnit TEsts
   public char[] getPassword(){
      return password;
   }

}
