class Solution {
    public int largestAltitude(int[] gain) {
        int pos=0;
        int max=0;
        int n=gain.length;
        for(int i=0;i<n;i++){
            pos=pos+gain[i];
            if(pos>max){
                max=pos;
            }
        }
        return max;
    }
}
