class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
        // Create a HashMap to act as a dictionary
        Map<Character,Character> dict = new HashMap<>();
        //bool used to start and stop loop
        
        String current ="";
        
        int position = 0;
        
        while (dict.get(s.charAt(position)) == null && position != s.length() - 1){
            dict.put(s.charAt(position), s.charAt(position));
            current = current + s.charAt(position);
            position += 1;
    }
        return(position);
    }
    */
        int holdval = 0;
        int currentlargest = 0;
        int position = 0;
        String current = "";
        // iterate though the entire string
        if (s.length() == 0){
            return 0;
        }
        if (s.length() == 1){
            return 1;
        }
        for(int count = 0; count < s.length(); count ++){
            
            //if the current string has the character 
            if (current.contains(String.valueOf(s.charAt(count)))){
                
                //if hold is larger than currentlargest
                if(holdval > currentlargest)
                {
                    // replace current largest
                    currentlargest = holdval;
                }
                current = "";
                position += 1;
                count = position-1;
                holdval = 0;
            }
            else{
                current += s.charAt(count);
                holdval += 1;
            }
        }        
        if(holdval > currentlargest) {
            currentlargest = holdval;
        }
        return currentlargest;
    }
}