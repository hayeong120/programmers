class Solution {
    public long solution(int price, long money, int count) {
        long answer = money;
        
        for(int i=1; i<=count; i++)
            money -= price*i;

        return money<0 ? -money : 0;
    }
}