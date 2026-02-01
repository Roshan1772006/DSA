import java.util.Scanner;
public class dsa17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price : ");
        double cp = sc.nextDouble();
        System.out.println("Enter the selling price : ");
        double sp = sc.nextDouble();
        double t = 0;
        t = sp - cp;
        double p = (t/cp)*100;
        if(sp > cp) System.out.println("the Profit of : "+t+ " and profit precentage : "+p+"%");
        if(sp < cp) System.out.println("lose of : "+(-t)+ " and lose precentage : "+p+"%");
        if(sp == cp) System.out.println("No Profit or Lose");
        sc.close();
    }
}
