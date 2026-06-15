class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> comList = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int target = -nums[i];
            int left = i+1;
            int rit = nums.length-1;
            while(left < rit){
                if((nums[left]+nums[rit]) > target) rit--;
                else if((nums[left]+nums[rit]) < target) left++;
                else{
                   List<Integer> triplet = Arrays.asList(nums[i],nums[left],nums[rit]);
                   if(!comList.contains(triplet)){
                     comList.add(triplet);
                   }
                   left++;
                   rit--;
                }
            }
            
        }
        return comList;
    }
}
