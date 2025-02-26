import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자 등록 (이름별 개수 저장)
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        // 완주한 사람 제거 (이름별 개수 감소)
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        // 값이 1인 (즉, 완주하지 못한) 참가자를 찾기
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                return key;
            }
        }
        
        return "";
    }
}
