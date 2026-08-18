
import java.util.Stack;

class pr1 {

    static class Queue {
        Stack<Integer> s1;
        Stack<Integer> s2;
        public Queue(){
            this.s1 = new Stack<>();
            this.s2 = new Stack<>();
        }

        public void push(int x){

            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(x);

            while(!s2.isEmpty()){
                s2.push(s2.pop());
            }
        }

        public int pop(){
            return s1.pop();
        }

        public int peek(){
            return s1.peek();
        }

        public boolean isEmpty(){
            return s1.isEmpty();
        }
    
    }




    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.push(6);
        q.push(7);
        q.push(8);

        System.out.println(q.peek());
        
    }
}