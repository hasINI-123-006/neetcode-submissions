class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int mf = 0;
        int wl = 0;
        int rn = 0;
        int l = 0;
        int count = 0;
        for(int r=0;r < s.length();r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            mf = Math.max(mf,map.get(s.charAt(r)));
            wl = r - l+1;
            rn = wl - mf;
            if(rn <= k){
                count = Math.max(count,wl);
            }
            else{
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
        }
        return count;
    }
}
