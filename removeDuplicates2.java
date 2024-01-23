class Solution {
    public int removeDuplicates(int[] nums) {

        int previous = 1;
        int current = 2;

        while (current < nums.length) {
            if (nums[previous] == nums[current] &&
                    nums[current] == nums[previous -1]) {
                current++;
            } else {
                previous++;
                nums[previous] = nums[current];
                current++;
            }
        }
    return previous + 1;
    }
}
