import java.util.*;

public class ValidParentheses {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(solution(s));
    }

    public static boolean solution(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') st.push(ch);
            else{
                if(st.empty()) return false;
                else if(ch == ')' && st.peek() != '(') return false;
                else if(ch == '}' && st.peek() != '{') return false;
                else if(ch == ']' && st.peek() != '[') return false;

                st.pop();
            }

        }

        if(st.empty()) return true;
        return false;
    }
}
