class Solution {
    public int majorityElement(int[] nums) {
        int currmax = nums[0];
        int inc = 1;
        for (int i = 1; i <= nums.length-1; i++){
            //System.out.println(nums[i]);
            
            if(nums[i] == currmax){
                inc++;
                System.out.println(inc + "1");
            }
            else{
                inc--;
                System.out.println(inc + "2");
                if(inc == 0)
                {
                    currmax = nums[i];
                    inc = 1;
                }
            }
        }
        return(currmax);
    }
}