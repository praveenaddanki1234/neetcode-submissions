class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxfreq=0;
        int maxlen=0;
        int[] a=new int[26];
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            a[c-'A']++;
            maxfreq=Math.max(maxfreq,a[c-'A']);
            int l=right-left-maxfreq+1;
            if(l>k){
                a[s.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}
