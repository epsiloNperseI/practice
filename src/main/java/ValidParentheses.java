import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {


    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {

        Stack<Character> stc = new Stack<>();

        for(char e: s.toCharArray()){

            if(stc.empty()) stc.push(e);
            else if(stc.peek()=='{' && e=='}') stc.pop();
            else if(stc.peek()=='[' && e==']') stc.pop();
            else if(stc.peek()=='(' && e==')') stc.pop();
            else stc.push(e);

        }

        return stc.empty();
    }

}
