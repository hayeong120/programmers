class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] split = s.split(" ", -1);
        
        for(int i = 0; i < split.length; i++) {
            char[] temp = split[i].toCharArray();
            for(int j = 0; j < temp.length; j++) {
                if(j%2 == 0) {
                    temp[j] = Character.toUpperCase(temp[j]);
                } else {
                    temp[j] = Character.toLowerCase(temp[j]);
                }
            }
            answer.append(new String(temp));
            
            if (i < split.length - 1) {
                answer.append(" ");
            }
        }
            
        return answer.toString();
    }
}