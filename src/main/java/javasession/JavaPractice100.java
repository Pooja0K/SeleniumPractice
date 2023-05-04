package javasession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaPractice100 {
   /* Problem 2:
    Given two lists or arrays of numbers
    Find numbers which are uncommon in both the list/array
    Example: A = [6,9,12,42,7,5] and B = [45,6,42,5,19,27]
    Result = [45,9,12,7,19,27]
}*/

    public static void main(String[] args) {
        Integer[] A= {6,9,12,42,7,5}; //common element 6,42,5
        Integer[] B = {45,6,42,5,19,27};

        List<Integer> list1= new ArrayList<>(Arrays.asList(A));//6,42,5
        List<Integer> list2= new ArrayList<>(Arrays.asList(B)); //{45,6,42,5,19,27};
        List<Integer> list3= new ArrayList<>(Arrays.asList(A)); //{6,9,12,42,7,5};
        list1.retainAll(list2); //common element 6,42,5
        //System.out.println(list1);

        for (Integer i:list1){
            list2.remove(i);
            list3.remove(i);
        }
        list2.addAll(list3);
        System.out.println(list2);
    }
}
