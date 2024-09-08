class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        String prefix = "";
        int current = 0;
        boolean same = true;
        // for each item in the list
        while (same){
            if (current >= strs[0].length()) {
                break;
            }
            
            char currentChar = strs[0].charAt(current);
            
            // Compare current character with all strings
            for (int item = 1; item < strs.length; item++) {
                if (current >= strs[item].length() || strs[item].charAt(current) != currentChar) {
                    same = false;
                    break;
                }
            }
            
            if (same) {
                prefix += currentChar;
                current++;
            }
        }
        return prefix;
    }
}