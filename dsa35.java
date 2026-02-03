import java.util.Scanner;

public class dsa35 {
    public static void main(String[] args) {
        // print the ap series 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of term : ");
        int n = sc.nextInt();
        for(int i=2; i<=3*n-1 ; i+=3){
            System.out.println(i+" ");
        }

        System.out.println();
        for(int i=2; i<=3*n-1 ; i+=3){
            System.out.println(i+" ");
        }
    }
}
 
