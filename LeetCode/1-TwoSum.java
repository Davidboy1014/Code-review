/*
COMPLETED
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 10^4
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
/*
 * Thinking proccess:
 * Since there is always one answer in each array lets create a hashmap to first
 *  run a for loop and store all integer values along with their place in a a hashmap <int (Value), int (place)>
 *  then start from the beginning of the array and subtract it from the target number giving us the value to search for in the Hashmap
 *  10 | 5 | 4 | 7 | 8 | 2 Target 9 Therefore we can just do a simple hashlookup to recieve the place
 */
import java.util.HashMap;
import java.util.Map;

 class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num = new HashMap<>();
        //Checks to see if the target is in the map before adding it.
        for(int i = 0; i < nums.length; i++){
            int tar = target - nums[i];
            if (num.containsKey(tar)){
                //Create a new int array to return 
                return new int[]{num.get(tar),i};
            } 
            num.put(nums[i],i);
        }
        return nums;
    }
}

