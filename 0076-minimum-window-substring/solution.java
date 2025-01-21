class Solution {
public String minWindow(String s, String t) {
    if (s == null || t == null || s.length() < t.length()) return "";
    
    Map<Character, Integer> countT = new HashMap<>();
    for (char c : t.toCharArray()) {
        countT.put(c, countT.getOrDefault(c, 0) + 1);
    }
    
    int l = 0, have = 0, need = countT.size();
    int[] res = {-1, 0, 0};
    Map<Character, Integer> window = new HashMap<>();
    
    for (int r = 0; r < s.length(); r++) {
        char c = s.charAt(r);
        window.put(c, window.getOrDefault(c, 0) + 1);
        
        if (countT.containsKey(c) && window.get(c).intValue() == countT.get(c).intValue()) {
            have++;
        }
        
        while (have == need) {
            if (res[0] == -1 || r - l + 1 < res[0]) {
                res[0] = r - l + 1;
                res[1] = l;
                res[2] = r;
            }
            
            char leftChar = s.charAt(l);
            window.put(leftChar, window.get(leftChar) - 1);
            if (countT.containsKey(leftChar) && window.get(leftChar).intValue() < countT.get(leftChar).intValue()) {
                have--;
            }
            l++;
        }
    }
    
    return res[0] == -1 ? "" : s.substring(res[1], res[2] + 1);
}

}
