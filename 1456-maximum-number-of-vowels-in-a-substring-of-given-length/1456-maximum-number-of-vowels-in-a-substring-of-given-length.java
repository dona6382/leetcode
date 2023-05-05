class Solution {
    public int maxVowels(String s, int k) {
    
    
        int maxVowels = 0;
   
        int currentVowels = 0;
    
        for (int i = 0; i < s.length(); i++) {
        
            if (i >= k) {
            char leftChar = s.charAt(i - k);
           
                if (isVowel(leftChar)) {
               
                    currentVowels--;
            }
        }
        char rightChar = s.charAt(i);
        if (isVowel(rightChar)) {
            currentVowels++;
        }
        if (i >= k - 1 && currentVowels > maxVowels) {
            maxVowels = currentVowels;
        }
    }
    return maxVowels;
}

private boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
}

}