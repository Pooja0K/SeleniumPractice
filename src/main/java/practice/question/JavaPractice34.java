package practice.question;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaPractice34 {
    public static void main(String[] args) {
        //Make a program that removes duplicates from an ArrayList using Sets, but maintains the order.
        //o/p: {1,6,2,3,0,4}
        Integer[] input={1,6,2,1,3,0,6,4};
        Set<Integer> set=new LinkedHashSet<Integer>(Arrays.asList(input));
        System.out.println(set);
    }
}
