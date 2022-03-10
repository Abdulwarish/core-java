package com.test.emp;

import java.util.LinkedList;
import java.util.List;

public class Test {
   private static int counter = 0;
   void Test() {
       counter = 20;
   }
   
   Test(int x){
       counter = x;
   }
   
   public static void main(String[] args) {
       Test test = new Test(counter);
       System.out.println(counter);
       
       String str1 = "abc";
       String str2 = new String("abc");
       System.out.println(str1 == str2); 
       System.out.println(str1.equals(str2)); 
       
       List<String> l = new LinkedList<>();	
       l.add("A");
       l.add("B");
       System.out.println(l.get(1));
   }
}