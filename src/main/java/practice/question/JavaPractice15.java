package practice.question;

import java.util.Arrays;

public class JavaPractice15 {
    //Write a program on array which perform left shift element by 1 position
    //o/p : {1,2,7,6,3,4,9,5}
    public static void main(String[] args) {
        int pos=0; int i=0;
        int[] input={5,1,2,7,6,3,4,9};
        while (i<input.length-1){
                pos=input[i]; //5
                input[i]=input[i+1]; //2
                input[i+1]=pos; //5
            i++;
        }
        System.out.println(Arrays.toString(input));
    }
}
