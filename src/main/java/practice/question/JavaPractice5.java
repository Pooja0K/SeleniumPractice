package practice.question;

public class JavaPractice5 {
    //Write code to check if a String is a palindrome or not?
    //i/p  : nitin,  o/p : palindrome
    //i/p  : mamma,  o/p : not palindrome

    public static void IsPalindrome(String input){
        String output="";
        for (int i=input.length()-1;i>=0; i--){
            output=output+input.charAt(i);
        }
        if(output.equals(input)){
            System.out.println( output+" is palindrome");
        }
        else {
            System.out.println(output+" is not palindrome");
        }
    }

    public static void main(String[] args) {
        String input[]= {"nitin","mamma"};
        for (String s:input){
            IsPalindrome(s);
        }
    }
}
