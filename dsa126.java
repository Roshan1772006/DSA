public class dsa126 {
    public static void main(String[] args) {
        // check if the array is sorted;
        int[] arr= {1,2,3,4,5,6,7,8,9};
        sorted(arr);
    }

    private static void sorted(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] >= arr[i+1]) System.out.print("false");
                
            
        }
        System.out.println("true");
        
    }
}
