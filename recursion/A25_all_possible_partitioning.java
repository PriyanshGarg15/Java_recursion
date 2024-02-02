import java.util.*;

public class A25_all_possible_partitioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        fun(s, ans);
    }

    public static void fun(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            String sb = s.substring(0, i + 1);
            fun(s.substring(i + 1), ans + sb + "|");
        }
    }
}