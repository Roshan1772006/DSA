import java.util.Scanner;

public class dsa37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int a=99; a>103-4*n; a-=4 ){
            System.out.println(a);
        }
    }
}
