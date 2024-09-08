class Solution {
    public boolean isPalindrome(int x) {
        String hold = "";
        String s = Integer.toString(x);

        for(int i = s.length() - 1; i >= 0; i--){
            String parse = s.substring(i, i+1);
            hold += parse;
        }
        if(s.equals(hold)){
            return true;
        }
        else{
            return false;
        }
    }
}