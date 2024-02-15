class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        int polCount = 0; //longest polindrome
        int largestOdd = 0; //largest odd number of characters

        for (char c : s.toCharArray()) { //counting every character
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) { //iterate through each character

            if (entry.getValue() % 2 == 0) { //if even include the number of characters to the polindrome count
                polCount += entry.getValue();
            } else{ //find the largest odd number of characters
                if (largestOdd < entry.getValue()) {
                    largestOdd = entry.getValue();
                }
            }          

        }

        //if all the characters are even add '0'
        //if not add the largest odd number of characters
        polCount += largestOdd; 
        return polCount;
    }
}
