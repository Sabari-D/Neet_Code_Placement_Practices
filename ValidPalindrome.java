https://github.com/Sabari-D/Neet_Code_Placement_Practices/new/main

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-z0-9]","");
        s = s.trim();


        char[] ch = s.toCharArray();
        int left = 0, right = ch.length-1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
