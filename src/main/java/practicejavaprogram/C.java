package practicejavaprogram;

public class C extends B{

    int y=50;
    int z=60;
    int k=70;

       void m2() {
           System.out.println("m3 method of parent class C");
       }

        void m3() {
            System.out.println("m3 method of parent class C");
           }

          void m4(){
              System.out.println("m4 method of parent class C");
           }

    public static void main(String[] args) {
        B b = new C();
        //System.out.println(b.x);//a
        System.out.println(b.y);//b
        System.out.println(b.z);//b
        //System.out.println(b.k);//c
        //b.m1();//a
        b.m2();//c
        b.m3();//c
        //b.m4();

    }
    }


