import java.util.Stack;

class P2 {
    public static Stack<Integer> sortStack(Stack<Integer> st) {
        // code here
        Stack<Integer> st2 = new Stack<>();
        
        while(!st.isEmpty()){
            int curr = st.pop();
            while(!st2.isEmpty() && st2.peek() > curr){
                st.push(st2.pop());
            }
            st2.push(curr);
        }
        return st2;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(41);
        st.push(3);
        st.push(32);
        st.push(2);
        st.push(11);

        System.out.println(sortStack(st).toString());
    }
}