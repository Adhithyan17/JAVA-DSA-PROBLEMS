package array;

/*
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR" */ 

/* 

Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"

*/
public class zigzagconversion {
    public static void main(String[] args) {
        String s1 = "PAYPALISHIRING";
        int numRows = 4;
        System.out.println("Result:1"+processZigZagConversion(s1, 3));

        System.out.println("Result:" + processZigZagConversion(s1, numRows));
    }

    public static String processZigZagConversion(String s1, int numrow) {
        if (s1.length()<numrow||numrow==1){
            return s1;
        }
        StringBuilder[] row = new StringBuilder[numrow];
        String res = "";
        int step = 1;
        int c = 0;
        for (int i = 0; i < numrow; i++) {
            row[i] = new StringBuilder();
        }

        char[] s = s1.toCharArray();
        for (char i : s) {
            row[c].append(i);

            if (c == 0) {
                step = 1;

            }
            if (c == numrow - 1) {
                step =- 1;
            }
            c += step;
        }

        for (StringBuilder str : row) {
            res += str;
        }

        return res;

    }

}
