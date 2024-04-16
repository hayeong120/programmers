class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int num1 = n>m?n:m;
        int num2 = n<m?n:m;
            
        while(true) {
            int temp = num2;
            num2 = num1%num2;
            num1 = temp;
            if(num2 == 0)  break;
        }   
        answer[0] = num1;
        answer[1] = n*m/num1;
        
        return answer;
    }
}