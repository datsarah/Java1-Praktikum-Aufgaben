public class Falls {
    public static void main(String[] args) {
        int i = 50;

        if(i < 100){
            System.out.println("Wert ist unterhalb von 100");
            if((i / 5) == 10){
                System.out.println("Wert geteilt durch 5 ergibt 10");
            }
        } else {
            System.out.println("Wert ist mindestens 100");
        }
    }
}
