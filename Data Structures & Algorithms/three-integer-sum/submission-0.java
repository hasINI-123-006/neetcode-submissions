class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> comList = new ArrayList<>();
        
        for(int i=0;i<nums.length-2;i++){
            int cur = nums[i];
            for(int j = i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if((nums[j]+nums[k]) == -cur){
                        List<Integer> triplet = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(triplet);
                        if(!comList.contains(triplet)){
                            comList.add(triplet);
                        }
                        
                    }
                }
            }
        }
        return comList;
        
    }
}
