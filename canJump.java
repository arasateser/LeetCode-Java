class Solution {
    public boolean canJump(int[] nums) {
        int currentNum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            currentNum = nums[i];

            //if it can reach out of bounds it can reach end of the array as well 
            if(i + currentNum >= nums.length - 1){ 
                return true;
            }

            //jumping from the index until not reaching a 'zero'
            for(int j = 0 ; j < nums[i] ; j++){
                if(nums[i + currentNum] == 0){
                    currentNum--;
                }
                if(currentNum==0){
                    return false;
                }

                //if you can do not land on a 'zero' continue from that index
                continue;
            }

        }

        return true;
    }
}
