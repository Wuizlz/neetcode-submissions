class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> holder = new HashSet<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(holder.contains(nums[i]))
            {
                return true;
            }
            else{
                holder.add(nums[i]);
            }
        }
        return false;



    }
}