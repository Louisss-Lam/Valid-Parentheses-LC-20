import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "())))";
		System.out.println(isValid(word));
	}
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();	
		
		for (char c: s.toCharArray()) {
			if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else {
				stack.push(c);
			}
		}
		return stack.isEmpty();
		
	}

}
