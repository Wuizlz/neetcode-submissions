class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> collectedAnagrams = new HashMap<>();

        for(String word : strs)
        {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);

            String key = new String(letters);

            if(!collectedAnagrams.containsKey(key))
            {
                collectedAnagrams.put(key, new ArrayList<>());
            }

            collectedAnagrams.get(key).add(word);
        }

        return new ArrayList<>(collectedAnagrams.values());
    }
}
