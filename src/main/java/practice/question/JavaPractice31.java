package practice.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaPractice31 {
    public static void main(String[] args) {
        //Write a program to find if a given number is present in the arrayList or not.
        //number to be check : 5
        //number to be check : 9
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        Integer num = scanner.nextInt();

        //Integer[] expected ={5,9};
        Integer[] input = {1, 6, 2, 9, 3, 0, 2, 4};
        List<Integer> list = new ArrayList<>(Arrays.asList(input));
/*        for (int i = 0; i < expected.length; i++) {
            if (list.contains(expected[i])) {
                System.out.println("number present " + expected[i]);
            }
        }*/

        if (list.contains(num)) {
            System.out.println("number is present");
        }
    }
}
