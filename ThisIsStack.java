import java.util.Stack;
public class ThisIsStack {
    public static void main(String[] args){
        Stack<String> st = new Stack<>();
        st.push("hi");
        st.push("hello");
        st.push("welcome");
        st.push("good morning");
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());

    }
}
