
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> letterCount = new HashMap<>();

        for (char c : ransomNote.toCharArray()) {
            letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
        }

        for (char k : magazine.toCharArray()) {
            letterCount.put(k, letterCount.getOrDefault(k, 0) - 1);
        }
//Map.Entry<Character, Integer> entry : letterCount.entrySet()
        for (Integer value: letterCount.values() ) {
            if (value > 0)
                return false;
        }
        return true;

    }
}
