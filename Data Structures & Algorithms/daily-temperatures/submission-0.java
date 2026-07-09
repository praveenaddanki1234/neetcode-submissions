class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int[] result=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            if(s.size()==0 ){
                s.push(i);
            }
            else{
                while(!s.isEmpty()){
                    int a=s.pop();
                    if(temperatures[a]>temperatures[i]){
                        result[i]=a-i;
                        s.push(a);
                        break;
                    }
                }
                s.push(i);
            }
        }
        return result;
    }
}
