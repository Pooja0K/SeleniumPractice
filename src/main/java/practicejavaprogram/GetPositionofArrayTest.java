package practicejavaprogram;
import java.util.Arrays;
import java.util.List;

public class GetPositionofArrayTest {
    public static void main(String[] args) {
        Integer[] arr={1,4,5,6,7,8,9};
        List<Integer> list= Arrays.asList(arr);
        System.out.println(list.indexOf(7));
        /*for (int i=0; i<= arr.length-1; i++){
            if(arr[i]==7){
                System.out.println(i);
            }*/
        }
    }

