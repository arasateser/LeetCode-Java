class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
		//if (ransomNote.length() > magazine.length()) return false;
        int[] letterCount = new int[26];
        
        for (char c : ransomNote.toCharArray())
            letterCount[c-'a']++;

        for (char c : magazine.toCharArray()){
            letterCount[c-'a']--;
        }

        for(int value : letterCount)
            if (value > 0) return false;
            
        return true;
    }
}
