class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();

        for (int i : nums) {
            if (unique.contains(i))
                return true;
            else
                unique.add(i);
        }

        return false;
    }
}
