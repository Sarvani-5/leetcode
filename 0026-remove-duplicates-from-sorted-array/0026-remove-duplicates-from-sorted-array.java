class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int r=1;
        int l=0;
        while(r<n){
            if(nums[l]==nums[r]){
                r++;
            }
            else{
                l++;
                nums[l]=nums[r];
                r++;
            }
        }
        return l+1;
    }
}