import java.util.Scanner;
public class dsa115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target: ");
        int target = sc.nextInt();
        int[] arr = {10,20,3,0,80};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println("two sum are: "+arr[i]+" " +arr[j]);
                    
                }
                
            }
        }
        sc.close();
    }
}
