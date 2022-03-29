/**
 * @author Aniket
 */

class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (nums[num] < 0) {
                ans = num;
                break;
            } else {
                nums[num] *= -1;
            }
        }

        for (int i = 0; i < n; i++)
            nums[i] = Math.abs(nums[i]);

        return ans;
    }
}
