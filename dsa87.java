import java.util.Scanner;

public class dsa87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int n = sc.nextInt();
        
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                System.out.print(
                    i==0 || i==n || j==0 || j==n ? "1": i==1 || i==n-1 || j==1 || j==n-1 ? "2": i==2 || i==n-2 || j==2 || j==n-2 ? "3": i==3 || i==n-3 || j==3 || j==n-3 ? "4": " "
                );
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
