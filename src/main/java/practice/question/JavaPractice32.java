package practice.question;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaPractice32 {
    public static void main(String[] args) {
        //Find out if a given number occurs more than once in an arrayList.
        //o/p : multiple occurrences in Array List
        //Hint: number to check : 3
       Integer[] input= {1,6,2,9,3,10,62,49,3,13,2,12,93,3};
        List<Integer>list=new ArrayList<Integer>(Arrays.asList(input));
        List<Integer> newlist= new ArrayList<Integer>();
        for(Integer i: list){
            if(!newlist.contains(i)){
                newlist.add(i);
            }
            else {
                System.out.println("multiple occurrences in Array List "+i);
                break;
            }
        }
    }
}
