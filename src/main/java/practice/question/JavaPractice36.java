package practice.question;

import java.util.*;

public class JavaPractice36 {
    public static void main(String[] args) {
        //Find the second-largest number from Given Array.
        //o/p : 87
        Integer[] input= {15,16,52,89,93,20,87,42};
        Set<Integer> treeset= new TreeSet<Integer>(Arrays.asList(input));
        List<Integer> list= new ArrayList<Integer>();
        for (Integer i: treeset){
            list.add(i);
        }
        System.out.println(list);
        System.out.println("Second largest number: "+list.get(list.size()-2));
    }
}
