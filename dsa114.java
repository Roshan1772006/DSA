import java.util.Arrays;

public class dsa114 {
    public static void main(String[] args) {
        int[] arr = {10,2,45,60};
        int[] x = arr;
        x[0] = 50;
        int[] deep = Arrays.copyOf(arr,4);
        deep[0]=100;
        System.out.println(arr[0]);
        System.out.println(deep[0]);

    }   
}
