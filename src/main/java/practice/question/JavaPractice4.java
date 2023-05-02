package practice.question;

public class JavaPractice4 {
    public static void main(String[] args) {
        //Write a program that finds maximum repeating character from the string
        // o/p : e
        String input = "selenium";
        char[] output = input.toCharArray();
        Integer[] expected = new Integer[input.length()];

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i))==(input.charAt(i + 1)))
            {
                input.replace(input.charAt(i + 1), '0');
                expected[i] = count++;
            }
            System.out.println(expected);
        }
    }
}
