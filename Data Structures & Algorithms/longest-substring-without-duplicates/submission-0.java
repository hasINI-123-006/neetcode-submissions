class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int count = 0;
        int length = 0;
        while(r < s.length()){
            if(!set.contains(s.charAt(r))){
               set.add(s.charAt(r));
               count++;
               r++;
            }
            else{
                set.remove(s.charAt(l));
                l++;
                count--;
            }
            length = Math.max(length,count);  
        }
        return length;
    }
}
