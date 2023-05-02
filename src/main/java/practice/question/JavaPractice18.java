package practice.question;

public class JavaPractice18 {
    //Write a program that swaps two strings without using a third variable.
    public static void main(String[] args) {
       String input1= "selenium";
       String input2="automation";

       input2= input1+input2;

       input1=input2.substring(input1.length());
       System.out.println(input1);
       input2=input2.substring(0,(input2.length()-input1.length()));
       System.out.println(input2);
    }
}
