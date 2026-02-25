import java.util.Scanner;
import java.io.*;
public class dsa110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-2,-6,-1};
        // System.out.println("enter the element of array :");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]=sc.nextInt();
        // }
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        for (int i = 0; i < args.length; i++) {
            if(arr[i]> max) max = arr[i];
        }
        System.out.println(max);
    }
}
