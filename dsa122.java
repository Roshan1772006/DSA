import java.util.ArrayList;
import java.util.Collections;

public class dsa122 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(5);
        arr.add(15);
        arr.add(95);
        arr.add(2);
        arr.add(13);
        arr.add(46);
        System.out.println(arr.get(2));  //System.out.println(arr[2])
        arr.set(3, 50); // arr[3]=50

        System.out.println(arr); //print entire array
        int n =arr.size();
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i)+" ");
        }
System.out.println();
        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }

        arr.add(1, 500);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
int j = arr.size()-1;
        for(int i=0; i<j; i++){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
         // Collections.reverse(arr);
        System.out.println(arr);

    }
}
