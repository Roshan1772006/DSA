import java.util.Scanner;

public class dsa76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the no. of columns: ");
        int c = sc.nextInt();
       
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                
                 
                
                System.out.print((i+j)%2 == 0 ? 1:0);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
