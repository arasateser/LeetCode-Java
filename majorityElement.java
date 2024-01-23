class Solution {
    public int majorityElement(int[] nums) {
        int half = nums.length / 2;

        // Create a map to store the count of each element
        Map<Integer, Integer> map = new HashMap<>();

        // Count the occurrences of each element in the array
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        // Iterate through the map entries to find the majority element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > half)
                return entry.getKey();
        }
        return 0;
    }
}
