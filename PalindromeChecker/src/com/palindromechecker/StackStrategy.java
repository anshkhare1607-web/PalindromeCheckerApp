package com.palindromechecker;
import java.util.Stack;

//Stack strategy
public class StackStrategy implements PalindromeStrategy {
	public boolean check(String text) {
		Stack<Character> stack = new Stack<>(); //stack of character
		for(char c : text.toCharArray()) {
			stack.push(c); //pushing each character of he input into stack.
		}
		
		// checking if the top element of the stack (Which is the last character of the 
		// input) is equal to the first element of the input or not and then second and second last
		// and so on.
		for(char c : text.toCharArray()) {
			if(stack.pop() != c) return false;
		}
		return true; 
	}

}
