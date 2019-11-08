import java.util.*;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> a=new Stack<>();
        for (int i = 0; i <n ; i++) {
            if(A.charAt(i)!='('&&A.charAt(i)!=')')
                return false;
            if(A.charAt(i)=='('){
                a.push(A.charAt(i));
            }
            if(A.charAt(i)==')'){
                if(a.isEmpty()){
                    return false;
                }
                a.pop();
            }
        }
        if(!a.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Parenthesis a=new Parenthesis();
        System.out.println(a.chkParenthesis("))",2));;
    }
}