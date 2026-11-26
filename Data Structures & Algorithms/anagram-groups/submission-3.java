class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> container = new HashMap<>();

        for (int i = 0; i < strs.length; i++)
        {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            if(!container.containsKey(str))
            {
                container.put(str, new ArrayList<>(List.of(strs[i])));
            }
            else
            {
                container.get(str).add(strs[i]);
            }
        }

        return new ArrayList<>(container.values());
        
    }
}
