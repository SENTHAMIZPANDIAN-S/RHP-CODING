import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        int[] required = new int[n];
        required[0] = heights[0];
        for (int i = 1; i < n; i++) {
            required[i] = required[i - 1] - 1;
        }
        PriorityQueue<Integer> extraDigNee = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int diff = heights[i] - required[i];
            if (diff > 0) {
                extraDigNee.offer(diff);
            }
        }
        int days = 0;
        int maxDigPossible = 0;
        while (!extraDigNee.isEmpty()) {
            int currentNeed = extraDigNee.poll();
            if (maxDigPossible < currentNeed) {
                days++;
                maxDigPossible = 2 * days - 1;
            }
        }
        System.out.println(days);
    }
}
