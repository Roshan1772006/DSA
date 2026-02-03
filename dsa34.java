public class dsa34 {
    public static void main(String[] args) {
        // table of 17 
        for(int i=0; i<=170; i++){
            if(i%17 == 0) System.out.print(i+" ");
        }

        System.out.println();
        System.out.println();

        // best way to use for loop 
        for(int i=0; i<=170; i+=17){
            System.out.print(i+" ");
        }
    }
}
