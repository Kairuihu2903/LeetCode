import java.util.HashMap;
import java.util.Map;
class Solution {

    public int findJudge(int n, int[][] trust) {
        //make a dict from 1 to n
        //and then iterate though each value of the trust array, with each trustee as the key and amount of trust as the value, then we iterate though the dict until we find someone with a trust value of n, otherwise return -1

    //catch case if there are only 2 people in the 
    //if (n == 2){
    //    return trust[0][1];
    //}
        if (trust.length == 0 && n == 1) {
            return 1;
        }

        int[] hold = new int[n];

        for (int i = 0; i < trust.length; i++) {
            int element = trust[i][0];
            hold[element - 1] += 1;
        }

        // Find the potential judge who has 0 outgoing trust
        Integer potentialJudge = null;
        for (int i = 0; i < hold.length; i++) {
            if (hold[i] == 0) {
                if (potentialJudge != null) {
                    return -1; // More than one person with 0 outgoing trust
                }
                potentialJudge = i + 1;
            }
        }

        if (potentialJudge == null) {
            return -1; // No person with 0 outgoing trust
        }
    
    Map<Integer, Integer> dictionary = new HashMap<>();

        for (int i = 0; i < trust.length; i++) {
                int element = trust[i][1];
                if (dictionary.containsKey(element) == true){
                    dictionary.put(element,dictionary.get(element)+1);
                }else{
                    dictionary.put(element,1);
                }
        }

        for (Map.Entry<Integer, Integer> entry : dictionary.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
        }
        if (dictionary.size() == 1){
            return trust[0][1];
        }
        //iterate though the dict if value is equal to n - 1 then the judge exists otherwise they do not
                for (Map.Entry<Integer, Integer> entry : dictionary.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value == n - 1){
                return key;
            }
                }
                return -1;
        }
        
}