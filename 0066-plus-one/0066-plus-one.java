class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        digits[size-1] += 1;

        for(int i = size-1; i >= 0; i--){
            if(digits[i] == 10){
                digits[i] = 0;
                if(i>0){
                    digits[i-1] += 1;
                }
            }
        }
    

        if(digits[0] == 0){
            int[] newarr = new int[size + 1];
            newarr[0] = 1;
            digits[0] = 0;
            for(int i = 1; i < size; i++){
                newarr[i] = digits[i-1];
            }
            return newarr;
        }
        return digits;
        
    }
}