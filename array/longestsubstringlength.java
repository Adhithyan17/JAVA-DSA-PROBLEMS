package array;

import java.util.HashMap;
import java.util.Map;

/*
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class longestsubstringlength{
    public static void main(String[] args) {
          String s1="abcabcbb";
          String s2="bbbbb";
          String s3="pwwkew";

System.out.println("s1:"+Findlongestsubstring(s1));
System.out.println("s2:"+Findlongestsubstring(s2));
System.out.println("s3:"+Findlongestsubstring(s3));



    }

    public static int  Findlongestsubstring(String s){
Map<Character,Integer>m=new HashMap<>();
   int max=0;
   int left=0;
for(int i=0;i<s.length();i++){
  
  char c=s.charAt(i);
    if (m.containsKey(c)){
        left=Math.max(max,m.get(c)+1);
    }
     m.put(c, i);
   
    
    max=Math.max(max,i-left+1);

}







return max;
    }
}