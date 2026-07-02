import java.util.PriorityQueue;

public class dsa143 {

    // Node class
    static class Node implements Comparable<Node> {
        int value;
        int row;
        int col;

        Node(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }

        @Override
        public int compareTo(Node other) {
            return this.value - other.value;
        }
    }

    // Function to merge K sorted arrays
    public static void mergeKSortedArrays(int[][] arr) {

        PriorityQueue<Node> minHeap = new PriorityQueue<>();

        // Add first element of each array to the heap
        for (int i = 0; i < arr.length; i++) {
            minHeap.add(new Node(arr[i][0], i, 0));
        }

        System.out.println("Merged Sorted Array:");

        while (!minHeap.isEmpty()) {

            Node current = minHeap.poll();
            System.out.print(current.value + " ");

            // Add the next element from the same array
            if (current.col + 1 < arr[current.row].length) {
                minHeap.add(new Node(
                        arr[current.row][current.col + 1],
                        current.row,
                        current.col + 1
                ));
            }
        }
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        mergeKSortedArrays(arr);
    }
}
