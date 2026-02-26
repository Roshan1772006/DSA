public class dsa117 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,4,5};
        int temp = 0;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]= temp;
        }
        
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");   
        }
    }
}
