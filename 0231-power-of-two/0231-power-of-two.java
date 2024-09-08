class Solution {
    public boolean isPowerOfTwo(int n) {
        return helper(n);
    }
    public boolean helper(double n){
        System.out.println(n);
        if (n == 1){
            return true;
        }
        else if (n < 1){
            return false;
        }
        return helper(n/2);
    }
}