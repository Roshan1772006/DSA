import java.util.Scanner;

public class dsa36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        int a = 4, d=6;
        for(int i=1; i<=n; i++){
            System.out.println(a+" ");
            a += d;
        }
    }
}
