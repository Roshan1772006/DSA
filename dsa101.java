import java.util.Scanner;

public class dsa101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the element: ");
        for(int i=0; i<n; i++) arr[i]= sc.nextInt();

        //print array value
        System.out.print("the negative value of array: ");
        for(int i=0; i<n; i++){
            if(arr[i] < 0) System.out.print(arr[i]+" ");
        }


    }
}
