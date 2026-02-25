import java.util.*;
public class Palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();  
        int flag = 0;
        for (char ch : s.toCharArray()) {
            flag = flag ^ (1 << (ch - 'a'));
        }
        if (flag == 0 || ((flag & (flag - 1)) == 0)) {
            System.out.println("y");
        } else {
            System.out.println("n");
        }
    }
}
