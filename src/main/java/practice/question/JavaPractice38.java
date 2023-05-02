package practice.question;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class JavaPractice38 {
    public static void main(String[] args) {
        //Return all negative numbers (remove duplicates if any and maintain insertion order) from the given array.
        //Hint: parameter - Array, return type - LinkedHashSet.
        //o/p : [-11, -19, -99]
        Integer[] input={10, -11, 13, -11, 14, -19, -99, -11, -19, 33};

        Set<Integer> hashset= new LinkedHashSet<Integer>(Arrays.asList(input));
        Set<Integer> newhashset = new LinkedHashSet<Integer>();

        for(Integer i:hashset){
            if(i<0){
              newhashset.add(i);
            }
        }
        System.out.println(newhashset);
    }
}
