package practice.question;

public class JavaPractice12 {
    public static void main(String[] args) {
        //WAP to print a single occurrence element from the array in Java?
        //o/p : {5,8,4,3}
        Integer[] input= {5,8,1,2,4,3,2,1};

          for (int i=0; i<input.length; i++) {
              for (int j=i+1; j<input.length; j++) {
                 if(input[i]==input[j]){
                     input[i]=0;
                     input[j]=0;
                 }
              }
           }
        /*  for (int i=0; i<input.length;i++)
          if(input[i]!=0){
              System.out.print(input[i]+" ");
          }*/
         }
      }


