/* Use Case Thirteen : Comparing different palindrome checking approaches
 * 
 *@author : Developer
 *version : 13.0
 * 
 */

package com.palindromechecker;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Stack;

public class UseCaseThirteen { 

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the text : ");
        String input = sc.nextLine();

        System.out.println("\nInput : " + input);

        // 1st approach : 2 pointer approach
        long startTwoPointer = System.nanoTime();
        boolean isPalTwoPointer = checkTwoPointer(input);
        long endTwoPointer = System.nanoTime();
        System.out.println("\nTwo Pointer - Is Palindrome : " + isPalTwoPointer);
        System.out.println("Two Pointer - Execution Time : " + (endTwoPointer - startTwoPointer) + " ns\n");

        // 2nd approach : Stack
        long startStack = System.nanoTime();
        boolean isPalStack = checkStack(input);
        long endStack = System.nanoTime();
        System.out.println("Stack - Is Palindrome : " + isPalStack);
        System.out.println("Stack - Execution Time : " + (endStack - startStack) + " ns\n");

        // 3rd approach : Linked list
        long startLinkedList = System.nanoTime();
        boolean isPalLinkedList = checkLinkedList(input);
        long endLinkedList = System.nanoTime();
        System.out.println("Linked List - Is Palindrome : " + isPalLinkedList);
        System.out.println("Linked List - Execution Time : " + (endLinkedList - startLinkedList) + " ns\n");
    }

    public static boolean checkTwoPointer(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean checkStack(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        for (char c : s.toCharArray()) {
            if (stack.pop() != c) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkLinkedList(String s) {
        LinkedList<Character> list = new LinkedList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                return false;
            }
        }
        return true;
    }
}