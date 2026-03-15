package array;

public class longestcommonsubstring2 {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "zcdemf";

        System.out.println("common string:" + Findlongestsubstring(s1, s2));
    }

    public static String Findlongestsubstring(String s1, String s2) {

        int n = s2.length();

        int[] dp = new int[n + 1];
        int max = 0;
        int e = 0;
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = n; j >= 1; j--) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[j] = dp[j - 1] + 1;

                    if (dp[j] > max) {
                        max = dp[j];
                        e = i;
                    }
                }
            }
        }

        return s1.substring(e - max, e);

    }
}
