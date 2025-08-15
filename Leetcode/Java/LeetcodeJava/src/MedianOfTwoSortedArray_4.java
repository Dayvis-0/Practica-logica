/*Given two sorted arrays nums1 and nums2 of size m and n repsectively, return the median of the two sorted arrays.
The overwall run time complexity should be O(log (m+n))

Example 1:
Input: num1 = [1,3], num2 = [2]
Explanation: merged array = [1,2,3] and median is 2

Example 2:
Input: num1 = [1,2], num2 = [3,4]
Explanation: merged array = [1,2,3,4] and median is (2+3)/2 = 2.5*/
public class MedianOfTwoSortedArray_4 {
    
    public static double findMedianSortedArrays (int[] nums1, int[] nums2) {
        return (double) 2.2;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2}, arr2[] = {3,4};
        
        System.out.println("La mediana es: " + findMedianSortedArrays(arr1, arr2));
    }
}
