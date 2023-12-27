class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int l=0,r=0;
        while(r<n){
            if(nums[r]==0){
                r++;
            }
            else{
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r++;
            }
        }
    }
}