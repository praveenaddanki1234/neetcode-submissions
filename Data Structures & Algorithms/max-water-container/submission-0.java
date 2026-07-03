class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int lmax=heights[l];
        int rmax=heights[r];
        int max=0;
        
        while(l<r){
            int c=0;
            if(heights[l]>=heights[r]){
                c=heights[r]*(r-l);
                r--;
            }
            else{
                c=heights[l]*(r-l);
                l++;;
            }
            max=Math.max(c,max);
        }
        return max;
    }
}
