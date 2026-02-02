import java.util.Scanner;

public class dsa28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        System.out.println("Enter the number : ");
        int b = sc.nextInt();
        System.out.println("Enter the number : ");
        int c = sc.nextInt();

        System.out.println((a>b) ? ((a>c)? a : c) : b);
    }
}
