class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> frequencies = new HashMap<>();
        PriorityQueue<int[]> hierarchy = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        int[] ans = new int[k];

        for(int element : nums)
        {
            frequencies.put(element, frequencies.getOrDefault(element, 0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : frequencies.entrySet())
        {
            int num = entry.getKey();
            int freq = entry.getValue();

            hierarchy.offer(new int[]{num,freq});
            if(hierarchy.size() > k)
            {
                hierarchy.poll();
            } 
        }

        for (int i = 0; i < k; i++){
            int[] arr = hierarchy.poll();
            ans[i] = arr[0];
        }

        return ans;

    }
}
