import java.util.Scanner;

public class dsa72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the no. of columns: ");
        int c = sc.nextInt();
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(
                    i == 0 || i == r-1 || j == 0 || j == c-1 ? "*" : " "
                );
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
