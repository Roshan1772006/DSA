import java.util.Scanner;

public class dsa23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x co-ordinate : ");
        int x = sc.nextInt();
        System.out.println("Enter the y co-ordinates : ");
        int y = sc.nextInt();
        if (x == 0 ){System.out.println("Origin");}
        if(x > 0){
            if(y > 0) {
                System.out.println("1st Quadrant");
            }
            else {
                System.out.println("4th Quadrant");
            }
        }
        else{
            if(y > 0) {
                System.out.println("2nd Quadrant");
            }
            else {
                System.out.println("3rd Quadrant");
            }
        }
    }
}

