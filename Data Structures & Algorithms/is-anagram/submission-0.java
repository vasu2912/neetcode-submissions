class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> str1 = new HashMap<>();
        Map<Character, Integer> str2 = new HashMap<>();
        for (int i=0; i < s.length();i++){
            str1.put(s.charAt(i),str1.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i=0; i < t.length();i++){
            str2.put(t.charAt(i),str2.getOrDefault(t.charAt(i),0)+1);
        }

        return str1.equals(str2);

    }
}
