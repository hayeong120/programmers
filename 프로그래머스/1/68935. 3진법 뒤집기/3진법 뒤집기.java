class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String three = Integer.toString(n, 3);
        StringBuffer sb = new StringBuffer(three);
        String reverse = sb.reverse().toString();
        answer = Integer.parseInt(reverse, 3);
        
        return answer;
    }
}