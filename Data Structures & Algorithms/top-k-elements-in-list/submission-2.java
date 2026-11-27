class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();

        PriorityQueue<int[]> comparator = new PriorityQueue<>((a,b) -> a[1] - b[1]);

        for (int element : nums)
        {
            map.put(element, map.getOrDefault(element,0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int key = entry.getKey();
            int value = entry.getValue();

            comparator.add(new int[]{key,value});
            if(comparator.size() > k)
            {
                comparator.poll();
            }
        }

        for (int i = 0; i < k; i++)
        {
            int[] ds = comparator.poll();

            
            ans[i] = ds[0];
        }

        return ans;
        
    }
}
