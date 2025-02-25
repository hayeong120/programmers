class Solution {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split(" ");
        int[] temp = new int[split.length];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<split.length; i++) {
            temp[i] = Integer.parseInt(split[i]);
        }
        for (int i : temp) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        
        return min + " " + max;
    }
}