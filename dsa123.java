// import java.util.ArrayList;
// public class dsa123{
//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         // 1234  == 1235 how ? 1234+1 = 1235

//         arr.add(0);
//         arr.add(9);
//         arr.add(9);
//         arr.add(9);
//         int n = arr.size();
//         if(arr.get(n-1) != 9){

//             arr.set(n-1 ,arr.get(n-1)+1);
//         }
//         else{
//             if(arr.get(n-2) != 9){
//                 arr.set(n-2,arr.get(n-2)+1);
//                 arr.set(n-1 ,0);
//             }
//             else{
//                 if(arr.get(n-3) != 9){
//                 arr.set(n-3,arr.get(n-3)+1);
//                 arr.set(n-2,0);
//                 arr.set(n-1 ,0);
//                 }
//                 else{

//                 arr.set(n-4,1);
//                 arr.set(n-3,0);
//                 arr.set(n-2,0);
//                 arr.set(n-1 ,0); 
//                 }
//             }
//         }
//         System.out.println(arr);
        
//     }
// }


import java.util.ArrayList;

public class dsa123 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(9);
        arr.add(9);
        arr.add(9);

        plusOne(arr);

        System.out.println(arr);
    }

    public static void plusOne(ArrayList<Integer> arr) {

        for(int i = arr.size() - 1; i >= 0; i--) {

            if(arr.get(i) < 9) {
                arr.set(i, arr.get(i) + 1);
                return; // done, no carry needed
            }

            arr.set(i, 0); // carry forward
        }

        // If all digits were 9 (like 999 → 1000)
        arr.add(0, 1);
    }
}