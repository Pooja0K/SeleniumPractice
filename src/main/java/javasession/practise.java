package javasession;

public class practise {
    public static void main(String[] args) {
           /* 1.	Write a program that finds duplicate characters in strings
    i/p  : electrical
    o/p : elc*/
        String input="electrical";
        char[] ch = input.toCharArray();
        for (int i=0; i<=input.length()-1;i++){ //e 9
            for (int j=i+1; j<=input.length()-1; j++){ //l 9
                if (ch[i]==ch[j]){
                    System.out.println(ch[i]);
                }
            }
        }

    }


}
