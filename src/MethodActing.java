public class MethodActing {
    public static String line;

    public static void main(String[] args) {

        MethodActing.tellLine("Oh, the things you can find, if you don’t stay behind.");

        MethodActing.speak();

        MethodActing.whisper();

        MethodActing.shout();



        MethodActing.tellLine("Yesterday you said tomorrow. Just do it.");

        MethodActing.shout();


    }
    public static void tellLine(String words){
        line = words;
    }

    public static void speak(){
        System.out.println(line);
    }

    public static void shout(){
        System.out.println("!!" + line + "!!");
    }

    public static void whisper(){
        System.out.println("**" + line + "**");
    }
}
