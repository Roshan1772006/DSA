import java.util.Scanner;
public class dsa46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int x= sc.nextInt();
        
        for(int i=1; i<=Math.sqrt(x); i++){
            if(x%i == 0){
                System.out.print(i);
                if(i != x/i){
                    System.out.println(x/i);
                }
            }
        }
    }
}
