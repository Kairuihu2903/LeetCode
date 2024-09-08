import java.util.HashMap;
import java.util.Map;
class Solution {

    /*
    public int climbStairs(int n) {
        
        // there are (n-1) + (n-2) ways at all times
        // n is the number of ways to climb the stairs
        // 1 stair = 1 way
        // 2 stairs = 2 ways
        // 3 stairs = 3 ways
        // 4 stairs = 5 ways
        // 5 stairs = 8 ways
        // 6 stair = 13 ways
        // 7 stair = 21 ways
        // 8 stair = 34 ways

        //use recursion return climbStairs(int n, int total)
        return recall(n);
    }

    public int recall(int x) {
        if(x == 0){
            return 0;
        }
        if(x == 1){
            return 1;
        }
        if(x == 2){
            return 2;
        }
        if(x == 3){
            return 3;
        }
        int total1 = recall(x-1);
        int total2 = recall(x-2);
        return total1 + total2;
    }
    //correct but too slow as it is exponential as such must optimize 
    */

    // new code adds a hashmap
    private Map<Integer, Integer> memo = new HashMap<>();
    public int climbStairs(int n) {
        return recall(n);
    }
    // check if hashmap key exists, if it does return result, otherwise, go though the process and then add key and value to map, this lowers the big o to just O(n) instead of O(n^2)
    public int recall(int x){
        if (memo.containsKey(x)) {
            return memo.get(x);
        }
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        if (x == 2) {
            return 2;
        }
        int total1 = recall(x-1);
        int total2 = recall(x-2);
        memo.put(x, total1 + total2);
        return total1 + total2;
    }

}
