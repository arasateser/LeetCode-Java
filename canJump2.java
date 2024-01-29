class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) { //iterate through each element in the array
            if (i > reachable) //checking if it is possible to advance this far in the array
                return false;
            if (i + nums[i] >= nums.length - 1) { //checking if we reached the end of the array
                return true;
            }
            reachable = Math.max(reachable, i + nums[i]); //check if the reached element or the current index is bigger
        }
        return true;
    }
