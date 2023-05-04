package practice.question;

public class JavaPractice14 {
    public static void main(String[] args) {
        //How to calculate the number of vowels and consonants in a string
        //o/p: vowels: 3, consonants : 3
        int vowelCount=0;
        int consonantCount=0;
        String input="Epam Systems";
        String input1=input.toLowerCase().replaceAll(" ","");
        for (int i=0; i<input1.length();i++){
            if(input1.charAt(i)=='a'||input1.charAt(i)=='e'||input1.charAt(i)=='i'||input1.charAt(i)=='o'||input1.charAt(i)=='u'){
                vowelCount++;
            }
            else {
                consonantCount++;
            }
        }
        System.out.println("vowels"+" "+vowelCount);
        System.out.println("consonant"+" "+consonantCount);
    }
}
