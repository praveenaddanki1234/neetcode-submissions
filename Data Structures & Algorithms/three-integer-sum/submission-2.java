class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int sum=nums[l]+nums[r]+nums[i];
                if(sum==0){
                    List<Integer> a=new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[l]);
                    a.add(nums[r]);
                    ans.add(a);
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(l<r && nums[r]==nums[r+1]){
                        r--;
                    }
                }
                else if(sum<0){
                    l++;
                }
                else{
                    r--;
                }
                
            }
        }
        return ans;
    }
}
