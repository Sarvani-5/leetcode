class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l =0;
        int mid=0;
        int r = n-1;
        while(mid<=r){
            switch(nums[mid]){
                case 0:
                int temp = nums[l];
                nums[l] = nums[mid];
                nums[mid] = temp;
                l++;
                mid++;
                break;
                case 1:
                mid++;
                break;
                case 2:
                int t = nums[r];
                nums[r] = nums[mid];
                nums[mid] = t;
                r--;
                break;
                default:
                break;
            }
        }
    }
}