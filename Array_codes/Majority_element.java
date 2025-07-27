//https://leetcode.com/problems/majority-element/description/


public class Solution {

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};  // New input
        int result = majorityElement(nums);
        System.out.println("Majority element is: " + result);
    }
}
