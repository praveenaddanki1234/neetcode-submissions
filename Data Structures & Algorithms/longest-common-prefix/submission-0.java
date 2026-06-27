class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder b=new StringBuilder();
        int n=strs[0].length();
        for(int i=1;i<strs.length;i++){
            n=Math.min(n,strs[i].length());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<strs.length-1;j++){
                if(strs[j].charAt(i)!=strs[j+1].charAt(i)){
                    return b.toString();
                }
            }
            b.append(strs[0].charAt(i));
        }
        return b.toString();
    }
}