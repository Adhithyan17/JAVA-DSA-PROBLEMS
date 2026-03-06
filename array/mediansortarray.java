/*
Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5
 */
package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mediansortarray{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
List <Integer> l =new ArrayList<>();
for (int i: nums1){
    l.add(i);
}
for (int i: nums2){
    l.add(i);
}
int s=l.size();
Collections.sort(l);
if (s%2==0){
    return (l.get(s/2)+l.get(s/2-1))/2.0;
}
return l.get(s/2);

    }

 public static void main(String args []){
    int nums1 []={1,3};
    int nums2 []={2,4};
    System.out.println(findMedianSortedArrays(nums1, nums2));
 }


 }

