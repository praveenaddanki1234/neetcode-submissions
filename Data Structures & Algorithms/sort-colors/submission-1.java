class Solution {
    public void sortColors(int[] nums) {
        int j=0;
        int k=nums.length-1;
        int i=0;
        while(i<=k){
            if(nums[i]==0){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
                j++;
            }
            else if(nums[i]==2){
                int t=nums[i];
                nums[i]=nums[k];
                nums[k]=t;
                k--;
            }
            else{
                i++;
            }
        }
    }
}