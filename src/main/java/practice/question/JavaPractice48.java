package practice.question;

public class JavaPractice48 {

    public static void printString (String input){
        for (int i = 0; i<input.length(); i++) {
            System.out.println(input.substring(0, input.length()-i));
        }
    }
    public static void main(String[] args) {
        String input = "EPAM";
        printString(input);
    }
}
