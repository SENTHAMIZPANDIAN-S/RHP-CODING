import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> one=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> zero=new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            one.add(sc.nextInt());
        }
        for (int i=0; i<n; i++) {
            zero.add(sc.nextInt());
        }
        long ans=0;
        int mod=1e7;
        for (int i = 0; i < n; i++) {
            int a=one.poll();
            int b=zero.poll();
            while (a-- > 0) {
                ans = (ans*2+1)%mod;
            }
            while (b-->0) {
                ans = (ans*2)%mod;
            }
        }
        System.out.println(ans);
    }
}
