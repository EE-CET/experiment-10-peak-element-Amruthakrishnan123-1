import java.util.*;

public class PeakElement {

    public static int findPeak(int[] arr, int n) {
        // Edge case: only one element
        if (n == 1) return 0;

        for (int i = 0; i < n; i++) {
            // First element
            if (i == 0) {
                if (arr[i] >= arr[i + 1]) {
                    return i;
                }
            }
            // Last element
            else if (i == n - 1) {
                if (arr[i] >= arr[i - 1]) {
                    return i;
                }
            }
            // Middle elements
            else {
                if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findPeak(arr, n));

        sc.close();
    }
}