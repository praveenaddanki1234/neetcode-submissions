class Solution {
    public int trap(int[] height) {
        int[] lmax=new int[height.length];
        int[] rmax=new int[height.length];
        int max=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            max=Math.max(max,height[i]);
            rmax[i]=max;

        }
        max=height[0];
        for(int i=0;i<height.length;i++){
            max=Math.max(max,height[i]);
            lmax[i]=max;
        }
        int sum=0;
        for(int i=0;i<height.length;i++){
            int a=Math.min(lmax[i],rmax[i])-height[i];
            if(a>=0){
                sum+=a;
            }
        }
        return sum;
        
    }
}
