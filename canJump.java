//in progress

class Solution {
    public boolean canJump(int[] nums) {
        boolean reached = false;
        int destIndex = nums[nums.length - 1];
        int howFar = 0;

        for (int i = 0; i < nums.length; i++) {
            howFar = nums[howFar];

            for (int j = 0; j < howFar; j++) {
                if (nums[i + howFar] == 0) {
                    howFar--;

                    if (howFar == 0)
                        return false;
                        break;
                } else
                    continue;
            }

            if (howFar == nums[nums.length - 1])
                return true;
        }
        return false;
    }
}
