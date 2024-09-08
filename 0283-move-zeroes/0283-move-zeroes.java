class Solution {
    public void moveZeroes(int[] nums) {
        int zerobefore = 0;
        for (int i = 0; i <= nums.length-1; i++){
            if(nums[i] == 0){
                zerobefore += 1;
            }
            else{
                if(zerobefore != 0){
                    nums[i-zerobefore] = nums[i];
                    nums[i] = 0;
                }
            }
        }
    }
}