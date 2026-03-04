class Solution {
    public ArrayList<Integer> leafNodes(int[] preorder) {
        // code here
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int n = preorder.length-1;
        for(int i=0;i<n;i++){
            boolean foundGreater = false;
            if(preorder[i]>preorder[i+1]){
                stack.push(preorder[i]);
            }else{
                while(!stack.isEmpty() && preorder[i+1]>stack.peek()){
                    stack.pop();
                    foundGreater = true;
                }
                if(foundGreater){
                    arr.add(preorder[i]);
                }
            }
        }
        arr.add(preorder[n]);
        return arr;
    }
}