class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long ip = Long.parseLong(p);
        int len = p.length();
        
        for(int i = 0; i<=t.length()-len; i++) {
            long a = Long.parseLong(t.substring(i, i + len));
            if(a <= ip) answer++;
        }
        
        return answer;
    }
}