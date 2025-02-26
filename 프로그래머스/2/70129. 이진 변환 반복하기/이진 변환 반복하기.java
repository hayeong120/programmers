class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int remove = 0;
        int count = 0;
        
        while(!s.equals("1")) {
            int before = s.length();
            s = s.replace("0", "");
            int after = s.length();
            remove += before - after;
            s = Integer.toBinaryString(after);
            count++;
        }
        
        answer[0] = count;
        answer[1] = remove;
        
        return answer;
    }
}