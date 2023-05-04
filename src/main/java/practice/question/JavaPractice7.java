package practice.question;

public class JavaPractice7 {


    public static void main(String[] args) {
        //Write a function to find out the longest palindrome in a given string
        //o/p : madamimadam
        String[] input= {"nitin", "jadeja", "mama", "madamimadam"};

        String max=input[0];
        int maxlength= input[0].length();

       for (int i=0; i<input.length;i++){
           if(input[i].length()>maxlength){
               max=input[i];
               maxlength=input[i].length();
           }
       }
        System.out.println(max);
        System.out.println(maxlength);
    }

}
