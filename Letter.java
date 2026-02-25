import java.util.*;
public class Letter
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int flag = 0;
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                flag = flag | (1 << (ch - 'a'));
            }
        }
        if (flag == (1 << 26) - 1) {
            System.out.println("y");
        } else {
            System.out.println("n");
        }
    }
}
