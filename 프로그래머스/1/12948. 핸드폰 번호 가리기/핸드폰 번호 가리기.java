class Solution {
    public String solution(String phone_number) {
        char[] temp = phone_number.toCharArray();
        
        for(int i = 0; i < temp.length-4; i++) {
            temp[i] = '*';
        }
        
        return String.valueOf(temp);
    }
}