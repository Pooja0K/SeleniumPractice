package practice.question;

public class JavaPractice142nd {
    //How to calculate the number of vowels and consonants in a string
    //o/p: vowels: 3, consonants : 3
    int vowelCount=0;
    int consonantCount=0;

    public static String removeDuplicateFromString(String input){
        String nonrepeatedinput="";
        String actualInput=input.toLowerCase().replaceAll(" ","");
        for(int i=0; i<actualInput.length();i++) {
            if(!(nonrepeatedinput.contains(String.valueOf(actualInput.charAt(i))))){
                nonrepeatedinput=nonrepeatedinput+actualInput.charAt(i);
            }
        }
        return nonrepeatedinput;
    }

    public void checkConsonantAndVowelCount(String output){
        for (int i=0; i<output.length();i++){
            if((output.charAt(i)=='a')||(output.charAt(i)=='e')||(output.charAt(i)=='i')||(output.charAt(i)=='o')||(output.charAt(i)=='u')){
                vowelCount++;
            }
            else {
                consonantCount++;
            }
        }
        System.out.println("vowels-->"+vowelCount);
        System.out.println("consonants-->"+consonantCount);
    }
    public static void main(String[] args) {
        String input="Epam Systems";
         String output=removeDuplicateFromString(input);
        System.out.println(output);
         JavaPractice142nd jv= new JavaPractice142nd();
         jv.checkConsonantAndVowelCount(output);
        }
    }

