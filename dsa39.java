import java.util.Scanner;

public class dsa39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a number: ");
        int n = sc.nextInt();
        int t = 1;
        int x = n;
        for(int i=0; i<=5; i++){
            if(i%2 == 0){
                System.out.println(t);
                t++;
            }
            else{
                System.out.println(x);
              x--;  
            }
        }
    }
}