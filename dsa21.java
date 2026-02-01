import java.util.Scanner;

public class dsa21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number : ");
        int a = sc.nextInt();
        System.out.println("Enter a second number : ");
        int b = sc.nextInt();
        System.out.println("Enter a third number : ");
        int c = sc.nextInt();

        if((a+b)>c && (b+c)>a && (c+a)>b) System.out.println("this 3 number are slide of triangle");
        
        else System.out.println("this 3 number are  not slide of triangle");
    }
}
