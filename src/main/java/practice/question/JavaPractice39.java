package practice.question;
import javasession.A;

import java.util.*;

public class JavaPractice39 {
    public static void main(String[] args) {
        //Write a program to return Union of two ArrayList without duplicates
        //o/p : {‘A’, ‘M’, ‘B’, ‘K’, ‘H’, ‘T’, ‘S’}
        Character[] input= {'A', 'M', 'B', 'K', 'A'};
        Character[] input1= {'A','H', 'T', 'K', 'S'};

        List<Character> list=new ArrayList<Character>(Arrays.asList(input));
        List<Character> list1 = new ArrayList<Character>(Arrays.asList(input1));
        list.addAll(list1);
        List<Character>newlist= new ArrayList<Character>();
        for(Character c: list){
            if (!newlist.contains(c)) {
                newlist.add(c);
            }
        }
        System.out.println(newlist);
    }
}
