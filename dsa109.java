import java.util.Scanner;

public class dsa109 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n ){
                flag = true;
                break;
            }
        flag = false;
            
        }
        System.out.println(flag == true? "found":"not found");
    }
}
