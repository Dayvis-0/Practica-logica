import java.util.HashMap;

/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol      Value
I             1
V             5
X             10
L             50  
C             100 
D             500  
M             1000
For example, 2 is writtenas II in Roman numeral, just two ones added together, 12 is written as XVII, which is 
simply x + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usuallyy written largest to smallest from left to right. However, the numeral for four is not
IIII. Inserted, the number four is IV. Because the one is before the five we subtractit making four. The same 
principle applies to the number nine, whichis written as IX. There are six instances where subtraction is used:

- I can be placed before V(5) and X(10) to make 4 and 9.
- X can be placed before L(50) and C(100) to make 40 and 90.
- C can be placed before D(500) and M(1000) to make 400 and 900.

Given a roman numeral, convert it to an integer

Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3

Example 2: 
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V = 5, III = 3.

Example 3:
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4*/
public class RomanToINteger_13 {
    public static int romanToInteger(String s) {
        HashMap<String, Integer>  sRomaValue = Map.of(
            "I", 1,
            "V", 5,
            "X", 10,
            "L", 50,
            "C", 100,
            "D", 500,
            "M", 1000
        );
        int resu = s.charAt(0);
        
        for (int i=0; i<s.length() - 1; i++) {
            if (s.charAt(i) >= s.charAt(i+1)) {
               resu = resu + s.charAt(i+1).
            } 
        }
        
        return 0;
    }
    public static void main(String[] args) {
        
    }
}
