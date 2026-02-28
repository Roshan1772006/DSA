import java.util.Arrays;
public class dsa119 {
    // public static int missingNum(int[] arr){
    //     Arrays.sort(arr);
    //     int max = arr[arr.length - 1];
    //     for(int i = 1; i <= max; i++){
    //         boolean found = false;

    //         for(int j = 0; j < arr.length; j++){
    //             if(arr[j] == i){
    //                 found = true;
    //                 break;
    //             }
    //         }
    //         if(!found){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public static long missingNum(int[] arr){

    long n = arr.length + 1;

    long total = n * (n + 1) / 2;

    long sum = 0;
    for(int num : arr){
        sum += num;
    }

    return total - sum;
}
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println("Missing number = " + missingNum(arr));
    }
}