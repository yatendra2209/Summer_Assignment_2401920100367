class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        for (int i=n-1;i>0;i--){
            for (int j=0;j<i;j++){
                if(nums[j]==0){
                    
                    nums[j]=nums[j+1];
                    nums[j+1]=0;
                }
            }
        }
    }
}