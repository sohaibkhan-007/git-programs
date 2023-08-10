import java.util.*;

public class stackClass {
    public static void main(String[] args) {
        public static void pushAtBottom( int data,Stack<Integer> s){
            if(s.isEmpty){
                s.push(data);
            }
            int top=s.pop();
            pushAtBottom(data,s);
            s.push();


        }  

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(4,s); 

        while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
        }
        

    }
}