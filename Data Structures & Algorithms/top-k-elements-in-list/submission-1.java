class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.merge(nums[i],1,(oldValue,newValue)->oldValue+newValue);
        }
        int[][] a=new int[m.size()][2];
        int i=0;
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            a[i][0]=e.getKey();
            a[i][1]=e.getValue();
            i++;
        }
        Arrays.sort(a, (l, j) -> Integer.compare(j[1], l[1]));


        int[] ans=new int[k];
        for(int j=0;j<k;j++){
            ans[j]=a[j][0];
        }
        return ans;
    }
}
