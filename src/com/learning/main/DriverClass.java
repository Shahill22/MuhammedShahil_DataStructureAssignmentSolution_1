package com.learning.main;
import java.util.Scanner;
import java.util.Stack;

import com.learning.service.SortedStack;

public class DriverClass {
	public static void main(String[] args) {
		Stack<Integer> stack2 = new Stack<Integer>();
		Stack<Integer> stack3 = new Stack<Integer>();
		SortedStack s=new SortedStack();
		int size;
		int val;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		size=sc.nextInt();
		int[] arr = new int[size];
		for(int i =0;i<size;i++) {
			System.out.println("enter the floor size given on day :"+ (i+1));
			val = sc.nextInt();
			arr[i]=val;
		}
		stack2= s.sortedStack(arr,size);
		System.out.println("The order of construction is as follows");
		System.out.println();
		for(int i =0;i<size;i++) {
			System.out.println("Day:"+ (i+1));
			if(stack2.peek()==arr[i]) {
				System.out.println(arr[i]);
				stack2.pop();
				int max=stack2.peek();
				while(!stack3.empty()) {
					if(stack3.pop()==max) {
						System.out.println(stack2.pop());
						if (!stack2.empty()) {
							max=stack2.peek();
						}
					}
				}
			}
			else {
				stack3.push(arr[i]);
				System.out.println();
			}
		}
		while(!stack2.empty()) {
			System.out.println(stack2.pop());
		}
		sc.close();
	}
}
