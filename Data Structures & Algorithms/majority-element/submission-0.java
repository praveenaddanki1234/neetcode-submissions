class Solution {
    public int majorityElement(int[] nums) {
        int n=nums[0];
        int c=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n){
                c++;
            }
            else{
                c--;
            }
            if(c==0){
                n=nums[i];
                c++;
            }
        }
        return n;
    }
}