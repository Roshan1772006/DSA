import java.util.Scanner;

public class dsa62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the no. of columns: ");
        int c = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                System.out.print(i%2 == 0 ? (char)(i+64): (char)(i+96));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
