import java.util.Scanner;

public class dsa26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        // condition ? sach : jhoot
        System.out.println((n%2 == 0) ? "Even" : "Odd");
    }
}
