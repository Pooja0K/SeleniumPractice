package practice.question;

public class JavaPractice23 {
    public static void main(String[] args) {
        //How to remove Whitespaces from String without using replace or replaceAll.
        //o/p : ilovemyindia
        String input= " I love my india ";
        String output="";
        //System.out.println(input.replaceAll("\\s",""));
        char[] ch =input.toCharArray();
        for (int  i=0;i<ch.length;i++){
            if (Character.isLetter(ch[i])){
               output=output+ch[i];
            }
        }
        System.out.println(output);
    }
}
