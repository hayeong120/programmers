class Solution {
    public int[] solution(int n) {
        int len = n%2==0?(n/2):(n/2+1);
        int[] answer = new int[len];
        
        int num = 0;
        for(int i=1; i<=n; i++) {
            
            if(i%2!=0) {
                answer[num] = i;
                num++;
            }
        }
        
        return answer;
    }
}