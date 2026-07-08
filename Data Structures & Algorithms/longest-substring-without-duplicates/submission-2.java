class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> m=new HashMap<>();
        if(s.length()==0)return 0;
        int max=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(m.containsKey(c))
            {
                if(l<=m.get(c)){
                l=m.get(c)+1;
                
                }
                m.put(c,i);
            }
            else{
                m.put(c,i);
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}
