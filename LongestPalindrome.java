class Solution {
    public String longestPalindrome(String s) {
        
        int l = s.length();
        StringBuilder str = new StringBuilder();
        String longestPalindrome = "";
        
        
        for (int left = 0; left < l; left++) {
            int right = l - 1; // 
            
            
            while (left <= right) {
                if (s.charAt(left) != s.charAt(right)) {
                    right--;
                } else {
                    
                    int tempstart = left;
                    int tempend = right;
                    boolean isPalindrome = true;

                    while (tempstart <= tempend) {
                        if (s.charAt(tempstart) != s.charAt(tempend)) {
                            isPalindrome = false;
                            break;
                        }
                        tempstart++;
                        tempend--;
                    }

                    
                    if (isPalindrome) {
                        if (right - left + 1 > longestPalindrome.length()) {
                            longestPalindrome = s.substring(left, right + 1);
                        }
                        break;
                    } else {
                        right--; 
                    }
                }
            }
        }
        
        return longestPalindrome;
    }
}
