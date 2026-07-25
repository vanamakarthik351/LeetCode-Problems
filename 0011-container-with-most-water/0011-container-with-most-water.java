class Solution {
    public int maxArea(int[] height) {
        int first=0;
        int last=height.length-1;
        int max=0;
        while(first<last){
            int width=last-first;
            int h=Math.min(height[first],height[last]);
            int area=width*h;
            if(area>max){
                max=area;
            }
            if(height[first]>height[last]){
                last--;
            }else{
                first++;
            }
        }
        return max;
    }
}