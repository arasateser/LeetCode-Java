class Solution {
    public void moveZeroes(int[] nums) {
        int zeros = 0;
        int artis = 0;

        for (int n : nums) { // counting zeros
            if (n == 0)
                zeros++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) // If not zero, put back as number of zeros counted so far
                nums[i - artis] = nums[i];
            else
                artis++; // if zero count to shift the rest of the array
        }

        for (int j = 0; j < zeros; j++) { // put zeros after the non zero numbers
            nums[nums.length - zeros + j] = 0;
        }

    }
}
