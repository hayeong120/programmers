import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int tmp = 0;
        
        Arrays.sort(d);
        
        for(int a : d) {
            tmp += a;
            if(budget < tmp) break;
            answer++;            
        }
        
        return answer;
    }
}