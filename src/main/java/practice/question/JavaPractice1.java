package practice.question;

public class JavaPractice1 {
    public static void main(String[] args) {
        //Write a program that finds duplicate characters in strings
        //o/p : elc
        String input="electrical";

        char[] ch= input.toCharArray();
        for (int i=0;i<ch.length;i++){
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    System.out.print(ch[i]);
                }
            }
        }

    }
}
