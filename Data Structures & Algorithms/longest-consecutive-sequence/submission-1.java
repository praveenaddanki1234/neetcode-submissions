class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            int prev=nums[i]-1;
            int next=nums[i]+1;
            if(s.contains(prev)){
                continue;
            }
            int c=1;
            
            while(s.contains(next)){
                c++;
                next=next+1;
            }
            max=Math.max(max,c);

        }
        return max;
    }
}
