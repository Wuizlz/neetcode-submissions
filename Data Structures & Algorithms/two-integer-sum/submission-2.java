class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> holder = new HashMap<>();
        int ans[] = new int[2];

        for (int i = 0; i < nums.length ; i++)
        {
            holder.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++)
        {
            int value = target - nums[i];
            if(holder.containsKey(value) && holder.get(value) != i)
            {
                ans[0] = i;
                ans[1] = holder.get(value);
            }

        }
        Arrays.sort(ans);
        return ans;
    }
}
