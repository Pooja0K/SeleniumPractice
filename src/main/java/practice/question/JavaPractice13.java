package practice.question;

import java.util.Arrays;

public class JavaPractice13 {
    //How to find the largest and smallest number in an array
    //o/p : small: 1 & highest: 9
    public static void main(String[] args) {
        Integer[] input= {5,1,2,7,6,3,4,9};
        Integer largestNumber=input[0];
        Integer secondLargestNumber=input[0];
        /*Arrays.sort(input);
        System.out.println("Largest array is: "+input[input.length-1]);
        System.out.println("Smallest array is: "+input[input.length-2]);*/

        for (int i=0;i<input.length;i++){
           if(input[i]>largestNumber) {
               largestNumber=input[i];
           }
        }
        System.out.println(largestNumber);
        for (int j=0; j<input.length;j++) {
            if ((largestNumber > input[j]) && (largestNumber != input[j]) && (secondLargestNumber<input[j])) {
                secondLargestNumber=input[j];
            }
        }
        System.out.println(secondLargestNumber);
    }
}
