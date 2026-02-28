public class dsa120 {
    public static void main(String[] args) 
    {
        int[] arr = {0,0,1,0,1,0};
    //     for (int j = 0; j < arr.length-1; j++) {
            
        
    //     for (int i = 0; i < arr.length-1; i++) {
            
    //         if(arr[i]==1 && arr[i+1]==0 ){
    //             int temp = arr[i];
    //             arr[i]=arr[i+1];
    //             arr[i+1]=temp;
    //         }
    //     }
    // }
    //     for (int i : arr) {
    //         System.out.print(i+" ");
    //     }
    // }

    int c0 = 0;
    int c1 = 0;
    for(int i : arr){
        if(i==0) c0+=1;
        else c1+=1;
    }
    for(int i=0; i<c0; i++){
        arr[i]=0;
    }
    for(int j=c0; j<c0+c1; j++) {arr[j]=1;}

    for(int k:arr){
       System.out.print(k+" "); 
    }
}
}
