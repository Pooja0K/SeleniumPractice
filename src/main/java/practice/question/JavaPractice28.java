package practice.question;

public class JavaPractice28 {
    public static void main(String[] args) {
        //Write a program which separate numbers and letters from string
        //o/p : hnfpnqk2922
        String input="h2n9fpn2qk2";
        String letter ="";
        String digit="";
        for (int i=0;i<input.length();i++){
            if(Character.isLetter(input.charAt(i))){
               letter=letter+input.charAt(i);
            }
            else {
                digit=digit+input.charAt(i);
            }
        }
        System.out.println(letter+digit);
    }
}
