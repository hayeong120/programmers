import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int halfN = nums.length / 2;
        if (halfN <= map.size()) {
            return halfN;
        } else {
            return map.size();
        }
    }
}