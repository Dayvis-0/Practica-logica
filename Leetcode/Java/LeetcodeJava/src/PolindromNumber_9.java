/*Given an integer x, return true if x is a polindrome, and false otherwise

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-, therefore it is not a polindrome

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left, Therefore is not a polindrome

Follow up: Could you solve it without converting the integer to string*/

public class PolindromNumber_9 {
    public static boolean isPolindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        if (x % 10 == 0) return x == 0;
        
        int revHalf = 0;

        while (x > revHalf) {
            revHalf = revHalf * 10 + x % 10;
            x /= 10;
        }

        return x == revHalf || x == revHalf / 10;
    }
    
    public static void main(String[] args) {
        System.out.println("The number is polindrome? " + isPolindrome(121));
    }
}
