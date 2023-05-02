package javasession;

public class Palindrome {

        public static String checkIsMaxPalindrome(String[] input){
            String maxLength=input[0];
            int maxPalindromeLength= input[0].length();

            for(int i=0; i<=input.length-1; i++){
                if(IsPalindrome(input[i])&&input[i].length()>maxLength.length()){
                    maxLength=input[i];
                    maxPalindromeLength=input[i].length();
                }
            }

            return maxLength+" & "+"length of the String is :"+maxPalindromeLength;

        }

        public static boolean IsPalindrome(String str){
            String rev="";
            for(int i=str.length()-1; i>=0; i--){
                rev=rev+str.charAt(i);
            }
            return rev.equals(str);
        }




        public static void main(String[] args) {
            String[] input= {"nitin", "jadeja", "mama", "madamimadam"};
            System.out.println(checkIsMaxPalindrome(input));

        }

}
