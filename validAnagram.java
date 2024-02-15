class validAnagram {
    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> letterCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) { // en son don
            letterCount.put(c, letterCount.getOrDefault(c, 0) -1);
        }

        for (int val : letterCount.values()) {
            if (val != 0)
                return false;
        }

    return true;
    }
}
