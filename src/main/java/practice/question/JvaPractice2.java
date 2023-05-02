package practice.question;

public class JvaPractice2 {
    public static void main(String[] args) {
        //Write a program that find max number from array
        //o/p : 9
        Integer [] input={5,1,2,7,6,3,4,9};
        Integer max=input[0];
        for(int i=0; i<input.length;i++){
            if(input[i]>max){
               max=input[i] ;
            }
        }
        System.out.println(max);
    }
}
