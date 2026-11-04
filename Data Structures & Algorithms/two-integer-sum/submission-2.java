class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int k=0;k< nums.length-1; k++){
            for (int j=k+1;j< nums.length; j++){
                if(nums[k]+nums[j] == target){
                return new int[] {k,j};
                }
            }       
        }

        return new int[] {-1,-1};
        
    }
}
