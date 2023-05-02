package practice.question;

public class JavaPractice24 {
    public static void main(String[] args) {
        //Write a program that converts words with the first letter capitalized.
        //o/p : I Love My India
           String input= "i love my india";
           String expected="";
           String[] words =input.split(" ");
        for(String w:words){

            expected = expected+w.substring(0,1).toUpperCase()+w.substring(1)+" ";

        }
        System.out.println(expected);
    }
}
