package array;


/*Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:

Input: s = "cbbd"
Output: "bb" */

public class longestpalindrome {
    public static void main(String[] args) {
        String s1="babad";
        String s2="cbbd";
        System.out.println("S1:"+findLongestElement(s1));
        System.out.println("S2:"+findLongestElement(s2));

    }

    public static String findLongestElement(String s){
        if (s==null||s.length()==0){
            return s;
        }
    String Result="";
    for (int i=0;i<s.length();i++){
 String odd=ExpandAround(s, i, i);
    String Even=ExpandAround(s,i, i+1);

    if (odd.length()>Result.length()){
        Result=odd;
    }
    if(Even.length()>Result.length()){
        Result=Even;

    }
    }
   
        return  Result;

    }

    public static String ExpandAround(String s,int left,int right){

        while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
   left --;
   right++;
        }
        return  s.substring(left+1,right);
    }


    
}


