package practice.question;

public class JavaPractice3 {
    public static void main(String[] args) {
        //Write a program to find the second max from an array
        //o/p : 15
        Integer[] input= { 2, 25, 2, 9, 6, 20, 15, 4 };
        Integer max = input[0];
        Integer secondmax=input[0];

        for(int i=0; i<input.length;i++){
            if(input[i]>max){
                max=input[i];
            }
        }
        System.out.println(max);

        for (int j=0;j<input.length;j++){
            if((input[j]<max) && (input[j]>secondmax) &&(input[j]!=max)){
                secondmax=input[j];
            }
        }
        System.out.println(secondmax);
    }
}
