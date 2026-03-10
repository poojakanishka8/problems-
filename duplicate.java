class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isduplicate=false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
          if(nums[i]==nums[i+1]){
             isduplicate=true;
             break;
          }
        }
        return isduplicate;

    }
}