class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = (total - (num * (num - 1) / 2)) / num; // 시작 값 계산
        
        for (int i = 0; i < num; i++) {
            answer[i] = start + i; // 연속된 수 채우기
        }
        
        return answer;
    }
}
