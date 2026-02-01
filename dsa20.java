import java.util.Scanner;

public class dsa20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n<0) n= -n;
        if(n<69) System.out.println("smaller than 69");
        else System.out.println("not smaller than 69");
    }
}
