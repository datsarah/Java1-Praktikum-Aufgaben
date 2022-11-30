public class User {


    public static void main(String[] args) {

        new User("Captain Hero", 40);
        new User("Ling Ling","kaboom");
        new User("Princess Clara",20,"singing with birds");

    }


    public User(String name, int lvl){
        System.out.println("player " + name + " " + "(" + lvl + ")" + " was created successfully");
    }

    public User(String name, String action){
        System.out.println("player " + name + " did " + action);
    }

    public User(String name, int lvl, String action){
        System.out.println("player " + name + " (" + lvl + ") was created successfully while " + action);
    }
}