class Solution {
    public String solution(String X, String Y) {
         StringBuilder answer = new StringBuilder();
        int[] xCntArr = new int[10];
        int[] yCntArr = new int[10];
        
        for (String x : X.split("")) {
            xCntArr[Integer.parseInt(x)]++;
        }
        for (String y : Y.split("")) {
            yCntArr[Integer.parseInt(y)]++;
        }
        
        for (int i = 9; i >= 0; i--) {
            while (xCntArr[i] > 0 && yCntArr[i] > 0) {
                answer.append(i);
                
                xCntArr[i]--;
                yCntArr[i]--;
            }
        }
        
        // 짝꿍이 없다면 "-1" 출력
        if ("".equals(answer.toString())) {
            return "-1";
        }
        // 값이 0이라면 "0" 출력
        if ("0".equals(answer.toString().substring(0, 1))) {
            return "0";
        }
        
        return answer.toString();
    }
}