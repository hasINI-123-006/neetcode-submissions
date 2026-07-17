class Solution {
    public int trap(int[] height) {
        int[] leftmax = new int[height.length];
        leftmax[0] = 0;
        for(int i=0;i<height.length-1;i++){
            leftmax[i+1] = Math.max(leftmax[i],height[i]);
        }
        int[] ritmax = new int[height.length];
        ritmax[height.length-1] = 0;
        for(int i=height.length-1;i>0;i--){
            ritmax[i-1] = Math.max(ritmax[i],height[i]);
        }
        int tot = 0;
        for(int i=0;i<height.length;i++){
                if(Math.min(leftmax[i],ritmax[i]) > height[i]){
                   tot = tot + (Math.min(leftmax[i],ritmax[i])-height[i]);
                
            }
        }
        return tot;
    }
}
