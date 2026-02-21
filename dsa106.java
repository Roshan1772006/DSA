import java.util.Arrays;

public class dsa106 {
    public static void main(String[] args) {

        //deep copy
        int[] arr = {10,20,30,40};
        int[] deep = Arrays.copyOf(arr,arr.length);
        deep[0]= 100;
        System.out.println(arr[0]);
        System.out.println(deep[0]);
    }
}
