package practice.question;

import java.util.Arrays;

public class JavaPractice17 {
    //Write a program that sort array without using any predefined methods
    //o/p : {1,2,3,4,5,6,7,9}
    public static void main(String[] args) {
        int temp=0;
        int[] input ={5,1,2,7,6,3,4,9};
        for (int i=0; i<input.length;i++){
            for(int j=i+1; j<input.length;j++){
                if (input[i]>input[j]){
                   temp=input[i];
                   input[i]=input[j];
                   input[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(input));
    }
}
