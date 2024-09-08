class Solution {
    public int missingNumber(int[] nums) {
        // make a new array that is one size larger than nums
    int[] hold = new int[nums.length + 1]; // Create a new array with size nums.length + 1

    for (int i = 0; i < nums.length; i++) {
        hold[nums[i]] = nums[i]+1; // Assign nums[i] to hold at index nums[i]
    }
    for(int i = 0; i < hold.length; i++){
        if(hold[i] == 0){
            return i;
        }
    }
    return hold.length;
    }
}