import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

/*Given an array of intengers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the mismo elemento twice.
You can return the answer in any order
Example 1: 
Input: nums = [2,7,11,15] target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0,1]*/
public class TwoSum_1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<nums.length; i++) {
            int cur = nums[i];
            int x = target - cur;
            // constainsKey -> Devuelve true si el atributo especificado existe; de lo contrario devuelve false
            if (map.containsKey(x)) {
               return new int[] {map.get(x), i}; 
            }
            map.put(cur, i);
        }
        return null;
    }
    
    public static void main(String[] args) {
        int myArray[] = {2,7,11,15};
        
        System.out.println("Los indices son: " + Arrays.toString(twoSum(myArray, 9)));
    }
}