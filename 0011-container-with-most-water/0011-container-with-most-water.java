class Solution {
    public int maxArea(int[] height) {
        int j = height.length-1;
        int maxarea = 0;
        int i=0;
        while(i<j){
            int h = Math.min(height[i],height[j]);
            int width = j-i;
            int area = h * width;
            if(area>maxarea){
                maxarea = area;
            }
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxarea;
    }
}