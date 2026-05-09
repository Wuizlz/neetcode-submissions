class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> check = new HashMap<>();
        Map<Character,Integer> check2 = new HashMap<>();

        for(char letter : s.toCharArray())
        {
            check.put(letter, check.getOrDefault(letter,0)+ 1);
        }

        for(char letter : t.toCharArray())
        {
            check2.put(letter, check2.getOrDefault(letter,0) + 1);
        }

        //how to compare two hashmaps??
        //we received the freq of letter in check and check2, 
        //if those freq and letter match up
        //this consist of an anagram?

        if(check.equals(check2)) {
            return true;
        }

        return false; 
    






    }
}
