class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6) {
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i)>='A') {
                    answer = false;
                    break;
                }
            }
        } else return false;
        
        return answer;
    }
}