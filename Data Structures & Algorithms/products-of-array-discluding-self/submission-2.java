class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];

        int product = 1;

        for(int i = 0; i < nums.length; i++)
        {
            prefix[i] = product;
            product *= nums[i];
        }

        product = 1;

        for(int j = nums.length - 1; j >= 0; j--)
        {
            suffix[j] = product;
            product *= nums[j];
        }

        for(int k = 0; k < nums.length; k++)
        {
            ans[k] = prefix[k] * suffix[k];
        }

        return ans;
    }
}  
