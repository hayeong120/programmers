class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int cnt[] = new int[1000];
        int max = Integer.MIN_VALUE;    // 초깃값은 정수형의 최소값으로 지정
        
        for(int i=0; i<array.length; i++) {
            cnt[array[i]]++;
        }
        
        for(int i=0; i<cnt.length; i++) {
            if(cnt[i]>max){
                max = cnt[i];
                answer = i;
            } else if(cnt[i]==max)
                answer = -1;
        }
            
        return answer;
    }
}