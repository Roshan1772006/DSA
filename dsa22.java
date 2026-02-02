import java.util.Scanner;

public class dsa22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght");
        int l = sc.nextInt();
        System.out.println("Enter the Breadth");
        int b = sc.nextInt();
        int perimeter = 2*(l+b);
        int area = (l*b);
        if(area > perimeter) {
            System.out.println("area is greater than perimeter");
        }
        else{
            System.out.println("perimeter is greater than area");
        }
    }
}
