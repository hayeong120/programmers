class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
             
        numer1 *= denom2;
        numer2 *= denom1;
        int cnum = numer1+numer2;
        int cden = denom1*denom2;
        
        int n = 1;
        for(int i=2; i<=cnum; i++) 
            if(cnum%i==0 && cden%i==0)
                n = i;
            
        answer[0] = cnum/n;
        answer[1] = cden/n;
        
        return answer;
    }
}