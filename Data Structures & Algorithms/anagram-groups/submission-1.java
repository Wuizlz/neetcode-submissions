class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagramCluster = new HashMap<>();

        for(String word : strs)
        {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String key = new String(letters);

            if(!anagramCluster.containsKey(key))
            {
                anagramCluster.put(key, new ArrayList<>());
            }

            anagramCluster.get(key).add(word);
        }

        return new ArrayList<>(anagramCluster.values());
    }
}
