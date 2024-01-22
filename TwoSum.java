//Solution one, iteration one by one each number to see if they add up to target number

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}

//Solution two, hashMap

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            int comp = target - nums[i];

            if(numMap.containsKey(comp)){
                return new int[]{numMap.get(comp), i};
            }
            
            numMap.put(nums[i], i);
        }

        return new int[]{};

    }
}
