package practicejavaprogram;


public class MaxNumberInArray {
    public static void main(String[] args) {

        int[] arr = {5, 1, 2, 7, 6, 3, 4, 9};

/*        for (int i=0;i<=arr.length-1; i++) {
            for (int j=i+1;j<=arr.length-1; j++){
                if(arr[i]<arr[j]) {
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                    }
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Largest number is :"+" "+arr[0]);
        System.out.println("Smallest number is: "+" "+arr[arr.length-1]);*/

        for(int k=1;k<= arr.length-1;k++) {   //1
            if (arr[0]>arr[k]) { //(arr[0]<arr[k])
               int temp=arr[0];
                arr[0]=arr[k];
                arr[k]=temp;
            }
        }
        //System.out.println("Largest number is :" + arr[0]);
        System.out.println("Smallest number is :" + arr[0]);
    }
}
