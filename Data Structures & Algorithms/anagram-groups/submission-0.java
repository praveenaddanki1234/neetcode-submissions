class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String st=strs[i];
            char[] chars = st.toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            if(m.containsKey(s)){
               m.get(s).add(strs[i]);
            }
            else{
                ArrayList<String> a=new ArrayList<>();
                a.add(strs[i]);
                m.put(s,a) ;
            }
        }
        List<List<String>> l=new ArrayList<>();
        for(Map.Entry<String,List<String>> e:m.entrySet()){
            l.add(e.getValue());
        }
        return l;
    }
}
