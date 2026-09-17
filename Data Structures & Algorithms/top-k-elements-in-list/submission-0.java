class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> collections = new HashMap<>();
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        int[] result = new int [k];

        for (int val : nums)
        {
            collections.put(val, collections.getOrDefault(val, 0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : collections.entrySet())
        {
            int number = entry.getKey();
            int frequency = entry.getValue();

            heap.offer(new int[]{number,frequency});
            if (heap.size() > k)
            {
              heap.poll();
            }
        } 

        for (int i = 0; i < k; i++)
        {
            int[] pair = heap.poll();
            result[i] = pair[0];
        }

        return result;

    }
}
