import java.util.Scanner;
public class dsa7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x , y , z ,sum = 0;
        System.out.println("Enter the First number");
        x = sc.nextInt();
        System.out.println("Enter the Second number");
        y = sc.nextInt();
        System.out.println("Enter the Third number");
        z = sc.nextInt();
        sum = x + y +z;
        System.out.println("Sum of two number is : "+sum);
    }
}
