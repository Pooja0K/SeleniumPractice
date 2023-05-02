package practice.question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaPractice42 {
    public static void main(String[] args) {
        Integer[] input= {23, 4, 7, 45, 41, 43, 27, 12, 59, 89, 67, 71, 73, 34, 83, 90, 96};


        int a1[] = {1, 2, 3, 4, 5, 6, 15, 25, 49, 11};
        for (int i = 0; i < a1.length; i++) {
            boolean flag = true;
            for (int j = 2; j < a1[i]; j++) { // i=1 a[i]=2 j=3
                if (a1[i] % j == 0) {  //2%3
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("prime numbers are:" + " " + a1[i]);

        }
    }
}

