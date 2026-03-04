class dsa129{
    
    void pushZerosToEnd(int[] arr) {
        
        int count = 0;  // position for next non-zero
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        
        while (count < arr.length) {
            arr[count++] = 0;
        }
    }
}