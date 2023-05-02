package practice.question;

import java.util.*;

public class JavaPractice43 {
    public static void main(String[] args) {

        String[] input = {"cars" , "dues", "scar" , "used" , "paired" , "ones" , "grab" , "brag"};
        List<String> list= new ArrayList<String>(Arrays.asList(input));
        //System.out.println(list);

        Iterator<String> itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("******************iterator***********");
        ListIterator<String> iterator=list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("************listIterator***************");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println("************listIterator*finished**************");

        for (String s: list){
            System.out.println(s);
        }
        System.out.println("************endOfForLoop*************");

        list.forEach(i-> System.out.println(i));

        System.out.println("************endOfForeach*************");
    }
}


