package practice.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaPractice33 {
    public static void main(String[] args) {
        //Write a program to remove duplicates from ArrayLists (without using set).
        //o/o: {1,6,2,3,0,4}
       Integer[] input= {1,6,2,1,3,0,6,4};

       List<Integer> list= new ArrayList<>(Arrays.asList(input));
       List<Integer> newlist= new ArrayList<Integer>();

       for(Integer i: list){
           if(!newlist.contains(i)){
               newlist.add(i);
           }
       }
        System.out.println(newlist);
    }
}
