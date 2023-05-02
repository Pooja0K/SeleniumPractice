package practice.question;

public class JavaPractice20 {
    public static void main(String[] args) {
        //How do you reverse words in a given sentence without using any predefined method?
        // o/p : hcetnoiro
        String input= "oriontech";
        String rev="";
        for (int i=input.length()-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
        System.out.println(rev);
    }
}
