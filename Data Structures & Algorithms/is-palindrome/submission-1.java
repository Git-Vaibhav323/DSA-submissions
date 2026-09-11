class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        
        String clean = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                clean += s.charAt(i);
            }
        }

        int len = clean.length();

        for (int i = 0; i < len / 2; i++) {
            if (clean.charAt(i) != clean.charAt(len - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}