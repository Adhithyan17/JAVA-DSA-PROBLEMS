package array;

public class longestcommonsubstring {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "zcdemf";
        System.out.println("length:" + Findlongestsubstring(s1, s2));

    }

    public static int Findlongestsubstring(String s1, String s2) {
        int maxlen = 0;
        int n = s1.length();
        int[] dp = new int[n + 1];
        for (int i = 1; i < n; i++) {
            for (int j = n; j >= 1; j--) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[j] = dp[j - 1] + 1;
                    maxlen = Math.max(maxlen, dp[j]);
                } else {
                    dp[j] = 0;
                }
            }
        }

        return maxlen;

    }
}
