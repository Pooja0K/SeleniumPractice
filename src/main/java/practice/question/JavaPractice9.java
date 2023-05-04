package practice.question;

public class JavaPractice9 {
    public static void main(String[] args) {
        //How to count the occurrence of a given character in a String
        //o/p :   ch : ‘e’- 2
        String input="electrical";
        int count=1;
        for (int i=0; i<input.length();i++){
            for (int j=i+1; j<input.length();j++){
                if(input.charAt(i)==input.charAt(j)){
                   count++;
                   }
            }
            System.out.println(input.charAt(i)+" "+count);
        }

    }
}
