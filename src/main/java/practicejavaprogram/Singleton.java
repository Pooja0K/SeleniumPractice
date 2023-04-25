package practicejavaprogram;
public class Singleton {
     private static Singleton singleton;

    private Singleton(){
        System.out.println("this is constructor of Singleton class");
    }

    public static Singleton getInstance(){
        if(singleton==null){
        singleton = new Singleton();}

        return singleton;
    }

    public boolean display(){
        System.out.println("this is display method of Singleton class");
        return false;
    }


}
