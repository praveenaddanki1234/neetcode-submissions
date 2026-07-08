class Solution {
    public boolean isValid(String str) {
        Stack<Character> s=new Stack();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==']'||c==')' ||c=='}'){
                if(s.size()==0)return false;
                char a=s.pop();
                if(c==']' && a!='['){
                    return false;
                }
                else if(c=='{' && a!='}'){
                    return false;
                }
                else if(c==')' && a!='('){
                    return false;
                }
            }
            else{
                s.push(c);
            }
        }
        if(s.size()!=0){
            return false;
        }
        return true;
    }
}
