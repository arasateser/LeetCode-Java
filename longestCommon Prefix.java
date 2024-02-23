class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = Integer.MAX_VALUE;
        String prefix = "";
        char letter;

        if (strs[0].length() == 0) // if first word is not empty get the firs letter fo the fiorst word to compare
                                   // to the rest of the list
            return prefix;
        else
            letter = strs[0].charAt(0);

        for (int k = 0; k < strs.length; k++) { // finding the length of shortest word to avoid overflow
            if (strs[k].length() < length)
                length = strs[k].length();
        }

        for (int i = 0; i < length; i++) {// get the i.th letter of the word
            letter = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {// check the i.th letter of the j.th word
                if (letter != strs[j].charAt(i)) // if not match return the current prefix
                    return prefix;
            }
            prefix += letter; // if i.th letter of the every word matches mark it

        }

        return prefix;
    }
}
