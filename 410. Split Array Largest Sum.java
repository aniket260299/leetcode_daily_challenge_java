/**
 * @author Aniket
 */

class Solution {
    public int splitArray(int[] nums, int m) {
        int sum, max;
        sum = max = 0;
        for (int num : nums) {
            sum += num;
            max = Math.max(num, max);
        }

        return binarySearch(nums, m, max, sum, -1);
    }

    public int binarySearch(int[] nums, int m, int lb, int ub, int ans) {
        if (lb > ub) return ans;
        int mid = lb + (ub - lb) / 2;
        int curr = check(nums, m, mid);
        if (curr != -1) {
            ans = curr;
            return binarySearch(nums, m, lb, curr - 1, ans);
        } else {
            return binarySearch(nums, m, mid + 1, ub, ans);
        }
    }

    public int check(int[] nums, int m, int ub) {
        int sum = 0;
        int max = 0;
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > ub) return -1;

            if (sum + nums[i] > ub) {
                k++;
                if (k > m) return -1;
                sum = 0;
            }

            sum += nums[i];
            max = Math.max(sum, max);
        }
        return max;
    }
}
