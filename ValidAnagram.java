https://neetcode.io/problems/is-anagram/question?list=blind75

class Solution {
    public boolean isAnagram(String s, String t) {
        int firstString = s.length();
        int secondString = t.length();

        if(firstString != secondString) return false;

        int[] res = new int[26];
        for(int i=0; i<s.length(); i++){
            res[s.charAt(i) - 'a']++;
            res[t.charAt(i) - 'a']--;
        }

        for(int count : res){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
