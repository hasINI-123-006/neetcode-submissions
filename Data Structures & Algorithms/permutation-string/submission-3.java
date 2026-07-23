class Solution {
    public boolean matches(int[] a ,int[] b){
        for(int i=0;i<26;i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int[] s1a = new int[26];
        int[] winl = new int[26];
        if(s1.length()>s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            s1a[s1.charAt(i)-'a']++;
            winl[s2.charAt(i)-'a']++;
        }
        if(matches(s1a,winl)) return true;
        for(int r =s1.length();r<s2.length();r++){
            winl[s2.charAt(r)-'a']++;
            winl[s2.charAt(r-s1.length())-'a']--;
            if(matches(s1a,winl)) return true;
        }
        return false;

    }
}
