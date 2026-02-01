import java.util.Scanner;
public class dsa15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        // if(n >= 0) System.out.println(n);
        // else System.out.println("The absolute value enter : "+(-n));

        // use only if
        if(n < 0) n = -n;
        System.out.println(n);
        sc.close();
    }
}
