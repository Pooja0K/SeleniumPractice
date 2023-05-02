package practice.question;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaPractice45 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Mango");
        set.add("Apple");
        set.add("Grapes");
        set.add("Papaya");

        Iterator<String> itr= set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for (String s: set){
            System.out.println(s);
            System.out.println(set.contains(s));
        }
    }
}
