class MinStack {
    Stack<int[]> s;

    public MinStack() {
        s=new Stack<>();
    }
    
    public void push(int val) {
        int max=val;
        if(!s.isEmpty()){
            int[] a=s.peek();
            max=Math.min(a[1],max);
        }
        s.push(new int[]{val,max});
    }
    
    public void pop() {
        if(!s.isEmpty())
        s.pop();
    }
    
    public int top() {
        int[] a=s.peek();
        return a[0];
    }
    
    public int getMin() {
        int[] a=s.peek();
        return a[1];
    }
}
