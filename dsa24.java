import java.util.Scanner;

public class dsa24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        System.out.println("Enter the number : ");
        int b = sc.nextInt();
        System.out.println("Enter the number : ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+" is the greater number");
        }
        else if(b>a && b>c){
            System.out.println(b+" is the greater number");
        }
        else{
            System.out.println(c+" is the greater number");
        }
    }
}