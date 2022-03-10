package com.jsoft.String;
import java.util.*;
public class StringToke {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("HI,Abdul,Waris,Khan");
		System.out.println(st.nextToken(","));
		System.out.println(st.nextToken());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
