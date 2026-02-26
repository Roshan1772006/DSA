public class dsa116 {
    public static void main(String[] args) {
        int[] arr = {10,2,0,9,1,80,0};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }   
            }
        }
        System.out.println("Second maximum element in array: "+arr[1]);
        
    }
}
