class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> indicies = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            indicies.put(nums[i], i);
        }

        for(int i = 0; i< nums.length; i++)
        {
            int diff = target - nums[i];
            if(indicies.containsKey(diff) && i != indicies.get(diff))
            {
                return new int[]{i,indicies.get(diff)};
            }
        }
        return null;
    }
}
