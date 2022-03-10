package com.jsoft.String;

import java.util.StringTokenizer;

public class StringTokenizers {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Hi abdul");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
