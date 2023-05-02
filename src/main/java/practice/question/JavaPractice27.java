package practice.question;

public class JavaPractice27 {
    public static void main(String[] args) {
        //Write a program that prints "java" when three consecutive numbers appear
        //o/p : java
        Integer[] input = {12, 13, 15, 14, 17, 18, 19, 20};

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                for (int k = j + 1; k < input.length; k++) {
                    if (((input[i] - input[j]) == -1) && ((input[j] - input[k]) == -1)) {
                        System.out.println("consecutive numbers are: "+ input[i]+" "+input[j]+" "+input[k]);
                        System.out.println("java");
                    }
                    break;
                }
                break;
            }
        }
    }
}

