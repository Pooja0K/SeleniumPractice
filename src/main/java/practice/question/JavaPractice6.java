package practice.question;

public class JavaPractice6 {
    //Write code to check if a number is palindrome or not?
    //o/p : not palindrome
    // o/p : palindrome
    public static void checkPalindrome(String[] input) {
        int count = 0;
        while (count < input.length) {
            String expected = "";
            for (int i = input[count].length() - 1; i >= 0; i--) {
                expected = expected + input[count].charAt(i);
            }
            if (expected.equals(input[count])) {
                System.out.println(expected + " is palindrome");
            } else {
                System.out.println(expected + " is not palindrome");
            }
            count++;
        }
    }
    public static void main(String[] args) {
        String[] input ={"12345","12321"};
        checkPalindrome(input);
    }
}
