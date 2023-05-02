package javasession;

public class A {

     public void display(int a){
         System.out.println(" int ");
     }
     public void display(int a, int b){
         System.out.println("int a b");

     }

    public void display(float a, float b){
        System.out.println(" float a b");

    }

    public void display(float a){
        System.out.println("float");
    }

    public void display(double a){
        System.out.println("double");
    }

    public static void main(String[] args) {
        A a = new  A();
        a.display(11.0);



    }
}
