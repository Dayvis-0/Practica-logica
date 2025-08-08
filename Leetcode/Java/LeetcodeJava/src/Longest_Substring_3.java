import java.util.Map;
import java.util.HashMap;


/* Longest Substring Without Repating  Characters
Given a string s, find the length of the longest substring without duplicate characters
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3

Example 2:
Input: s = "b"
Output: 1

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring*/
public class Longest_Substring_3 {
    public static int lengthOfLongestSubstring(String s) {
            int maxLength = 0;
            int left = 0;
            Map<Character, Integer> count = new HashMap<>();

            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);
                count.put(c, count.getOrDefault(c, 0) + 1);

                while (count.get(c) > 1) {
                    char leftChar = s.charAt(left);
                    count.put(leftChar, count.get(leftChar) - 1);
                    left++;
                }

                maxLength = Math.max(maxLength, right - left + 1);
            }

            return maxLength;     
    }
    public static void main(String[] args) {
        String ch = "pwwkew";
        
        System.out.println("El numero de caracteres no repetidos es: " + lengthOfLongestSubstring(ch));
    }
}
