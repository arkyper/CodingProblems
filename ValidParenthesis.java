import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {

        String brackets = ")(}{][";
        Stack<Character> charStack = new Stack<>();
        for (char ch : brackets.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                charStack.push(ch);
            else if (ch == ')' && !charStack.isEmpty() && charStack.peek() == '(')
                charStack.pop();
            else if (ch == '}' && !charStack.isEmpty() && charStack.peek() == '{')
                charStack.pop();
            else if (ch == ']' && !charStack.isEmpty() && charStack.peek() == '[')
                charStack.pop();
        }
        if (charStack.isEmpty()) System.out.println("Valid String");
        else System.out.println("Invalid String");
    }
}
