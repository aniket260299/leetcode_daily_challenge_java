/**
 * @author Aniket
 */

class Solution {
    public int maxArea(int[] height) {
        int left, right, water;
        left = water = 0;
        right = height.length - 1;

        while (left <= right) {
            int currWater = Math.min(height[left], height[right]) * (right - left);
            water = Math.max(water, currWater);

            if (height[left] <= height[right]) left++;
            else right--;

        }
        
        return water;
    }
}
