import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] original = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[][] queries = new int[q][4];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 4; j++) {
                queries[i][j] = sc.nextInt();
            }
        }
        int leftMost = n;
        int rightMost = -1;
        for (int i = q - 1; i >= 0; i--) {
            int left = queries[i][0];
            int right = queries[i][1];
            int start = queries[i][2];
            int diff = queries[i][3];
            if (left < leftMost) {
                int end = Math.min(leftMost - 1, rightMost);
                for (int j = left; j <= end; j++) {
                    result[j] = start + (j - left) * diff;
                }
                leftMost = left;
            }
            if (right > rightMost) {
                int begin = Math.max(rightMost + 1, left);
                for (int j = begin; j <= right; j++) {
                    result[j] = start + (j - left) * diff;
                }
                rightMost = right;
            }
        }
        for (int i = 0; i < leftMost; i++) {
            result[i] = original[i];
        }
        for (int i = rightMost + 1; i < n; i++) {
            result[i] = original[i];
        }
        long MOD = 1e7L;
        long sum = 0;
        for (int value : result) {
            sum = (sum + value) % MOD;
        }
        System.out.println(sum);
    }
}
