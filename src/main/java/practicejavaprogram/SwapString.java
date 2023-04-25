package practicejavaprogram;

public class SwapString {
    public static void main(String[] args) {
        /*String s1="selenium";//8
        String s2="java"; //4
        s1= s1.concat(s2); //seleniumjava 12-4
        s2=s1.substring(0,(s1.length()-s2.length())); //s2=selenium
        s1=s1.substring(s2.length());//java
        System.out.println(s1);
        System.out.println(s2);*/

                String s ="i love my india";
                System.out.println(s);
                String ss[]=s.split(" ");
                for(int i=0;i<ss.length;i++){
                    String a= ss[i].substring(0,1).toUpperCase()+ss[i].substring(1);
                    System.out.print(a+" ");

                }
            }
        }






