import java.util.Scanner;
public  class dsa78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the no. of columns: ");
        int c = sc.nextInt();
        
        for(int i=1; i<=r; i++){
            
            for(int k=1; k<=r; k++){
                System.out.print(
                    i+k>r ? "*":" "
                );
                System.out.print(" ");
            }
            // for(int n=r; n>i; n--) {
            //     System.out.print(" ");
            // }
            
            System.out.println();
        }
    }
}
