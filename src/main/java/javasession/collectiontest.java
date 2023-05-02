package javasession;

import java.util.*;

public class collectiontest {
    public static void main(String[] args) {

        Set<String> list = new HashSet<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        /*ListIterator<String> listIterator= list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }*/

                 System.out.println(list);


        /*while (listIterator.hasPrevious()){
            System.out.println(" "+listIterator.previous());
        }*/
    }
}


