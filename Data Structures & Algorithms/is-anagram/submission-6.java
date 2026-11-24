class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        String word = "";
        if(s.length() > t.length()){
            for(char c : s.toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            word = t;
        } else{
            for(char c : t.toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            word = s;
        }

        for(char c : word.toCharArray()){
            if(!map.containsKey(c)){
                continue;
            }
            if(map.get(c) == 1){
                map.remove(c);
            } else {
                map.put(c, map.get(c) - 1);
            }
        }
        return map.isEmpty();
    }
}
