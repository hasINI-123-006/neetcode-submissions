class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int lm = 0;
        int rm = 0;
        int tot = 0;
        while(l<r){
            lm = Math.max(lm,height[l]);
            rm = Math.max(rm,height[r]);
            if(lm <= rm){
                tot += Math.min(lm,rm) - height[l];
                l++;
            }
            else if(lm > rm){
                tot += Math.min(lm,rm) - height[r];
                r--;
            }
        }
        return tot;

    }
}
