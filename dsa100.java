import java.util.Scanner;

public class dsa100{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the 5 element: ");
        for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }

        // display the array
        System.out.print("ARRAY Element : ");
        for(int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
    }
}