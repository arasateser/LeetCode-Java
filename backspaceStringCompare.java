class Solution {
public boolean backspaceCompare(String s, String t) {
        // ArrayLists to store characters after processing backspaces
        ArrayList<Character> first = new ArrayList<>();
        ArrayList<Character> second = new ArrayList<>();

        // Process backspaces for string s
        if (s.length() != 0) { //if not empty
            for (int i = 0; i < s.length(); i++) {
                // Add non-backspace characters to the first ArrayList
                if (s.charAt(i) != '#')
                    first.add(s.charAt(i));
                // Handle backspaces by removing the last character from the first ArrayList
                else if (s.charAt(i) == '#' && first.size() == 0)
                    continue; // Skip if the first ArrayList is empty and encounters, if not any character to remove continue
                else
                    first.remove(first.size() - 1); // Remove the last character for a backspace
            }
        }

        // Process backspaces for string t
        if (t.length() != 0) {
            for (int j = 0; j < t.length(); j++) {
                // Add non-backspace characters to the second ArrayList
                if (t.charAt(j) != '#')
                    second.add(t.charAt(j));
                // Handle backspaces by removing the last character from the second ArrayList
                else if (t.charAt(j) == '#' && second.size() == 0)
                    continue; // Skip if the first ArrayList is empty and encounters, if not any character to remove continue
                else
                    second.remove(second.size() - 1); // Remove the last character for a backspace
            }
        }

        // Check if the processed strings are of equal length if not there is no way to match these lists
        if (first.size() == second.size()) {
            // Compare characters of the two ArrayLists
            for (int k = 0; k < first.size(); k++) {
                if (first.get(k) != second.get(k))
                    return false; // Return false if characters are not equal
            }
        } else
            return false; // Return false if lengths are not equal

        return true; // Return true if the strings are equal after applying backspaces
    }
}
