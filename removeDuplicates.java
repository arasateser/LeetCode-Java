class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int visited = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] != visited){
            nums[index] = nums[i];
            index++;
            visited = nums[i];
            }
        }
        return index;
    }
}
