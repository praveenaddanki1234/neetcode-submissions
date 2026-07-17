class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.equals("")){
            return new ArrayList<>();
        }
        Map<Character,String> m=new HashMap<>();
        m.put('2',"abc");
        m.put('3',"def");
        m.put('4',"ghi");
        m.put('5',"jkl");
        m.put('6',"mno");
        m.put('7',"pqrs");
        m.put('8',"tuv");
        m.put('9',"wxyz");
        List<String> a=new ArrayList<>();
        String s=m.get(digits.charAt(0));
        for(int i=0;i<s.length();i++){
            a.add(String.valueOf(s.charAt(i)));
        }
        for(int i=1;i<digits.length();i++){
            String str=m.get(digits.charAt(i));
            List<String> ans=new ArrayList<>();
            for(int k=0;k<a.size();k++){
                for(int j=0;j<str.length();j++){
                    ans.add(a.get(k)+str.charAt(j));
                }
            }
            a=ans;
        }
        return a;
    }
}
