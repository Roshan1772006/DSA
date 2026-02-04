import java.util.Scanner;

public class dsa41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a number: ");
        int n = sc.nextInt();
        
        for(int i=2; i<=n-1; i++){
            if(n%i == 0){
                System.out.println("Compsite Number");
            break;
            }
            else{
                System.out.println("Prime Number");
                break;
            }
            
        }
}
}
