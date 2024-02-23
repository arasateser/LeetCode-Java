class Solution {
    public int[] sortedSquares(int[] nums) {
        int head = 0;
        int tail = nums.length - 1;
        int index = nums.length - 1;
        int[] array = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (Math.pow(nums[head], 2) > Math.pow(nums[tail], 2)) {
                array[index] = Math.abs(nums[head] * nums[head]);
                head++;
                index--;
            } else {
                array[index] = Math.abs(nums[tail] * nums[tail]);
                tail--;
                index--;
            }
        }
        return array;
    }
}
