class Solution {
    public int searchInsert(int[] nums, int target) {
        //binary search with extra steps
        if(nums[0] > target){
            return 0;
        }
        if(nums[nums.length-1] < target){
            return nums.length;
        }
        return binarysearch(nums, target);
    }
    public int binarysearch(int[]nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int middle = left + (right - left)/2;
            //check if target is in the middle
            if (nums[middle] == target){
                return middle;
            }
            //if target is larger, ignore the left
            if(nums[middle] < target){
                left = middle + 1;
            }
            //if target is smaller, ignore the right
            else{
                right = middle - 1;
            }
    }
    // always return the left because the program terminates if let exceeds the right in that case left is always the closest position
    return left;
    }
}