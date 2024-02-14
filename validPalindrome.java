class Solution {
    public boolean isPalindrome(String s) {

        if (s.isEmpty()) {
            return true;
        }

        int first = 0;
        int last = s.length() - 1;
        char charFirst, charLast;

        while (first <= last) {
            charFirst = s.charAt(first);
            charLast = s.charAt(last);

            if (!Character.isLetterOrDigit(charFirst)) {
                first++;
            } else if (!Character.isLetterOrDigit(charLast)) {
                last--;
            } else {
                if (Character.toLowerCase(charFirst) != Character.toLowerCase(charLast)) {
                    return false;
                }
                first++;
                last--;
            }

        }
        return true;

    }
}
