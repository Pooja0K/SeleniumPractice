package practice.question;

import java.util.Arrays;

public class JavaPractice21 {
    public static void main(String[] args) {
        //Write a program to check if the two arrays are identical
        //o/p : true
        int[] input1 = {5, 1, 3, 9};
        int[] input2 = {5, 1, 3, 9};
        //System.out.println(Arrays.equals(input1,input2));
        int i = 0;
        boolean flag = false;
        if (input1.length == input2.length) {
            while (i < input1.length) {
                if (input1[i] == input2[i]) {
                    flag = true;
                    i++;
                } else {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag);
        }
        else {
            System.out.println("both array is not identical");
        }
    }
}
