public class dsa128 {
     public static void main(String[] args) {
        // bubble sort in descending order;
        int[] arr = {3,5,1,4,2,0};
        int[] arr2 = {3,5,1,4,2,0};
        sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        sort(arr2);
        for (int i : arr2) {
            System.out.print(i+" ");
        }
    }
    // public static void sort(int[] arr){
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr.length-1; j++) {
    //             if(arr[j]>arr[j+1]) swap(arr,j ,j+1);
    //         }
    //     }
    // }
     public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int sort=0;
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]<arr[j+1]) swap(arr,j ,j+1);
                sort++;
            }
        if(sort == 0)break;}
    }
    //  public static void sort(int[] arr){
    //     for (int i = 0; i < arr.length; i++) {
    //         boolean flag =true;
    //         for (int j = 0; j < arr.length-1; j++) {
    //             if(arr[j]<arr[j+1]) {
    //                 flag = false;
    //                 break;
    //             }
    //         }
    //         if(flag== true) break;
    //         for (int j = 0; j < arr.length-1; j++) {
    //             if(arr[j]<arr[j+1]) swap(arr,j ,j+1);
    //         }
    //     }
    // }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}
