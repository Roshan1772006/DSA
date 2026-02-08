import java.util.Scanner;

public class dsa77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the no. of columns: ");
        int c = sc.nextInt();
        
        for(int i=1; i<=r; i++){
            for(int n=0; n<i; n++) {
                System.out.print(1+(2*n)+" ");
            }
            System.out.println();
        }
    }
}
