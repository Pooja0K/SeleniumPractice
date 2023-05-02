package practice.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaPractice41 {
    public static void main(String[] args) {
        Integer[] input = {0,22,35,89,0,16,64,0,82,0,12,0};
        //o/p : {22,35,89,16,64,82,12}
        List<Integer> list= new ArrayList<>(Arrays.asList(input));
        List<Integer> newlist= new ArrayList<>();
        for(Integer i: list) {
         if(i!=0)  {
            newlist.add(i);
         }
        }
        System.out.println(newlist);
    }
}
