package practice.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaPractice44 {
    public static void main(String[] args) {

        String[] input = {"cars" , "dues", "scar" , "used" , "paired" , "ones" , "grab" , "brag"};
        List<String> list= new ArrayList<String>(Arrays.asList(input));
        System.out.println(list);
    }
}
