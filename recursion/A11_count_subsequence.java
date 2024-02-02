public class A11_count_subsequence {
    public static void main(String[] args) {
        String s = "abc";
        int c = count_sub(s, "", 0);
        System.out.println(c);
    }

    public static int count_sub(String s, String ans, int i) {
        if (i == s.length()) {
            return 1;
        }
        int a=count_sub(s, ans + s.charAt(i), i + 1);
        int b=count_sub(s, ans, i + 1);
        return a+b;
    }
}