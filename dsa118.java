// rotate an array
public class dsa118 {

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;   // handle k > n

        swap(arr, 0, n - 1);
        swap(arr, 0, k - 1);
        swap(arr, k, n - 1);
    }

    public static void swap(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rotate(arr, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}