class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int l=1;
        int r=max;
        int ans=Integer.MAX_VALUE;
        while(l<=r){
            int mid=(l+r)/2;
            if(isPossible(mid,piles,h)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int mid,int[] piles,int h){
        long sum=0;
        for(int i=0;i<piles.length;i++){
            sum+=(long)Math.ceil((double)piles[i]/(double)mid);
        }
        if(sum<=h){
            return true;
        }
        return false;
    }
}
