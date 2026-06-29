class Solution {
    public int[] productExceptSelf(int[] nums) {
        long p=1;
        int c=0;
        int idx=0;
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
                idx=i;
            }
            else{
                p=p*nums[i];
            }
        }
        if(c>0){
            if(c==1){
                a[idx]=(int)p;
                return a;
            }
            else{
                return a;
            }
        }
        for(int i=0;i<nums.length;i++){
            a[i]=(int)p/(int)nums[i];
        }
        return a;
    }
}  
