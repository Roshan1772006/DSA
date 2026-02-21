public class dsa104 {
    public static void main(String[] args) {
        int x[] = {10,3,29,38};
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] x) {
        x[2] = 99;
    }
}
