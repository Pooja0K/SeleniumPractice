package practice.question;

import java.util.Arrays;

public class AnagramJavaPractice47 {
    public static void main(String[] args) {
        String[] input = {"cars" , "dues", "scar" , "used" , "paired" , "ones" , "grab" , "brag"};

        for(int i=0; i<input.length;i++){
            char ch []= input[i].toCharArray();
            String [] outpout;
            Arrays.sort(ch);   }

        for (int j=0; j<input.length; j++){
            if(input[j].equals(input[j+1])){
                System.out.println(input[j]+"--->"+input[j+1]);
            }
        }
    }
}



