class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> resolvedAnagrams = new HashMap<>();

        for (String word : strs)
        {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String key = new String(letters);

            if(!resolvedAnagrams.containsKey(key))
            {
                resolvedAnagrams.put(key,new ArrayList<String>());
            }

            resolvedAnagrams.get(key).add(word);



        }

        return new ArrayList<List<String>>(resolvedAnagrams.values());

    }
}