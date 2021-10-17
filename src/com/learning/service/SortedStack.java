package com.learning.service;

import java.util.Stack;

public class SortedStack {
	public Stack<Integer> sortedStack(int[] arr,int size){
		Stack<Integer> stack2 = new Stack<Integer>();
		Stack<Integer> stack1 = new Stack<Integer>();
		for(int i =0;i<size;i++) {
			stack1.push(arr[i]);
		}
		while (!stack1.empty()) {
			int tmp = stack1.peek();
	        stack1.pop();
	        while (!stack2.empty() && stack2.peek() > tmp)
	        {
	        	stack1.push(stack2.peek());
	            stack2.pop();
	        }
	        stack2.push(tmp);
	    }
		return stack2;	
	}
}
