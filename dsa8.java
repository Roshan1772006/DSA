import java.util.Scanner;
public class dsa8 {
    public static void main(String[] args) {
        // simple interset 

        // input principle , rate ,time and find simple interset

        // formula P * R * T * 100

        java.util.Scanner sc = new Scanner(System.in);
        double p , r , t , SI;
        System.out.println("Enter the principle : ");
        p = sc.nextDouble();
        System.out.println("Enter the rate of interset : ");
        r = sc.nextDouble();
        System.out.println("Enter the time : ");
        t = sc.nextDouble();
        SI = (p*r*t)/100;
        sc.close();
        System.out.println("simple Interset of given data : "+SI);
    }
}
