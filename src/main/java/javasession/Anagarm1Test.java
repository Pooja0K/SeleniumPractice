package javasession;
import java.util.Arrays;

public class Anagarm1Test {

        public static void main(String[] args) {
            String s1="eat";
            String s2= "tea";
            char [] ch1=s1.toCharArray();
            char [] ch2=s2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if(Arrays.equals(ch1,ch2)){
                System.out.println("Strings are anagram");
            }
            else{
                System.out.println("Strings are not anagram");
            }

        }
    }


