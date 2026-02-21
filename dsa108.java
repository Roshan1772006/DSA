public class dsa108 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for(int i=0; i<arr.length; i++){
            // if(i%2 != 0) System.out.print((arr[i]*2)+" ");
            // else System.out.print((arr[i]+10)+" ");
        
        System.out.print(i%2 != 0 ? arr[i]*2:arr[i]+10);
        System.out.print(" ");
    }
    }
}
