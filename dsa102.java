import java.util.Scanner;

public class dsa102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the element: ");
        for(int i=0; i<n; i++) arr[i]= sc.nextInt();

        int sum = 0;
        int neg = 0;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i]<0) neg -=arr[i];
            else sum+=arr[i] ;           
        }
        System.out.println("Sum of the array value : "+(sum - neg));

    }
}
