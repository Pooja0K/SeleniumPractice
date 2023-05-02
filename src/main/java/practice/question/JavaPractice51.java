package practice.question;

import java.util.*;

public class JavaPractice51 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("meet");
        list.add("meet-me");
        list.add("implement");
        list.add("mango");

        Iterator<String> itr = list.iterator();
        int count =0;
        while (itr.hasNext()){
            String str= itr.next();
            if (str.contains("-")) {
               String [] str1 =str.split("-");
                for (String s: str1){
                    s.contains("me");
                    count++;
                }
            }
            else if ((!str.contains("-")) && (str.contains("me"))){
                count++;
            }
            else {
                System.out.println(str);
            }
        }
        System.out.print(count);
        }
    }