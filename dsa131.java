import java.util.ArrayList;

public class dsa131 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3, 4, 5, 6};

        int[] c = new int[a.length + b.length];
        merge(a, b, c);
        for (int i : c) {
            System.out.print(i + " ");
        }
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < a.length) {
            c[k++] = a[i++];
        }

        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
  }