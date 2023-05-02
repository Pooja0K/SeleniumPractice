package practice.question;

public class JavaPractice29 {
    public static void main(String[] args) {
        //Write a program which do sum of numbers present in the string
        //o/p : 15
        String input= "h2n9fpn23qk2";
        int sum=0;

        for (int i=0; i<input.length();i++){
            if(Character.isDigit(input.charAt(i))){
              //sum=sum+(input.charAt(i)-'0');
                sum=sum+Character.getNumericValue(input.charAt(i));
            }
        }
        System.out.print(sum);

        }
    }

