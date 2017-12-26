package com.me.crack.others;

import java.util.ArrayList;
import java.util.List;

public class PrintBalancedBrackets {
	private static int k=0;
	public static void main(String[] args) {
		List<String> l = generateParenthesis(2);
		for(String s:l)
			System.out.println(s);
	System.out.println(k);
	}
	
	public static List<String> generateParenthesis(int n) {
	    ArrayList<String> result = new ArrayList<String>();
	    dfs(result, "", n, n);
	    return result;
	}
	/*
	left and right represents the remaining number of ( and ) that need to be added. 
	When left > right, there are more ")" placed than "(". Such cases are wrong and the method stops. 
	*/
	public static  void dfs(ArrayList<String> result, String s, int left, int right){
		System.out.println(s +","+left+","+right);
	    if(left > right)
	        return;
	 
	    if(left==0&&right==0){
	        result.add(s);
	        return;
	    }
	 
	    if(left>0){
	        dfs(result, s+"(", left-1, right);
	    }
	 
	    if(right>0){
	        dfs(result, s+")", left, right-1);
	    }
	}
}

