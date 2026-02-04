import java.util.Scanner;

public class dsa43{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a number: ");
        int n = sc.nextInt();
        boolean flag = false;
        for(int i=2; i<=n-1; i++){
            if(n%i == 0){
                flag= true;
            }
        }
        if( n == 0) System.out.println("niether a Compsite nor Prime ");
        if(flag==true) System.out.println("Composite Number");
        else System.out.println("Prime Number");
    }
}
