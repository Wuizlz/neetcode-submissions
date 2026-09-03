class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> entries = new HashSet<>();

        for(int value: nums)
        {
            if (entries.contains(value))
            {
                return true;
            }
            entries.add(value);
        }
        return false;
    }
}