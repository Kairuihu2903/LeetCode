class Solution {
    public int search(int[] nums, int target) {
        int position = binarysearch(nums, target);
        return position;
    }
    public int binarysearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right){
            int middle = left + (right-left) / 2;
            //System.out.println(middle);
            if (target == nums[middle]){
                return middle;
            }
            //if target is greater than middle ignore left
            if(target > nums[middle]){
                left = middle+1;
            }
            else{
                right = middle-1;
            }
        }
        return -1;
    }
}