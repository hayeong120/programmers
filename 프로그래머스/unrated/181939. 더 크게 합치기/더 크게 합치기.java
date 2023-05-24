class Solution {
    public int solution(int a, int b) {
        int answer, answer1, answer2 = 0;
        answer1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        answer2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        return answer1 >= answer2 ? answer1 : answer2;
    }
}