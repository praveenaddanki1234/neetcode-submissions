class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") &&!tokens[i].equals("/")){
                s.push(Integer.parseInt(tokens[i]));
                
            }
            else{
                if(tokens[i].equals("+")){
                    int a=s.pop();
                    int b=s.pop();
                    int ans=a+b;
                    s.push(ans);
                }
                if(tokens[i].equals("-")){
                    int a=s.pop();
                    int b=s.pop();
                    int ans=b-a;
                    s.push(ans);
                }
                if(tokens[i].equals("*")){
                    int a=s.pop();
                    int b=s.pop();
                    int ans=b*a;
                    s.push(ans);
                }
                if(tokens[i].equals("/")){
                    int a=s.pop();
                    int b=s.pop();
                    int ans=b/a;
                    s.push(ans);
                }
            }
        }
        return s.pop();
    }
}
