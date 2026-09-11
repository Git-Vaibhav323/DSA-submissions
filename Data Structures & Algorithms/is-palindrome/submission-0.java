class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();

        for (int i = 0; i <= len; i++) {
            if (s.charAt(i) == s.charAt(len - 1 - i)) {
                i++;
                return true;
            }
        
        }
      return false;  
    }  
    
}