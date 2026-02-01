import java.util.Scanner;
public class dsa18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n%5 == 0) System.out.println("divisible by 5");
        if(n%3 == 0) System.out.println("divisible by 3");
        if(n%5 == 0 && n%3 == 0) System.out.println("divisible by 5 and 3");
        if(n%5 != 0 || n%3 != 0) System.out.println(" Not divisible by 5 or 3");
        
    }
}
