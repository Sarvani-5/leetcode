class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        int n = nums.length;
        int i=0;
        Arrays.sort(nums);
        while(i<n){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> triplets = new ArrayList<>();
                    triplets.add(nums[i]);
                    triplets.add(nums[j]);
                    triplets.add(nums[k]);
                    l.add(triplets);
                    int x = nums[j];
                    while(j<k && x==nums[j]){
                        j++;
                    }
                     int y = nums[k];
                    while(j<k && y==nums[k]){
                        k--;
                    }
                }
            }
                while(i+1<n && nums[i]==nums[i+1]){
                    i++;
                }
                i++;
            }
            return l;
    }
    }