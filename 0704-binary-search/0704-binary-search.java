class Solution {
    public int binarySearch(int[] nums,int target,int left,int right){
        boolean flag = true;
        while(left<=right){
        int mid = (left+right) / 2;
        if(nums[mid]==target){
            flag = false;
            return mid;
        }
        else if(nums[mid]<target){
            left = mid+1;
        }
        else{
            right = mid-1;
        }
        }
        return -1;
        
    }
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int index = binarySearch(nums,target,left,right);
        return index;
    }
}