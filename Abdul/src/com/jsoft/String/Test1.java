package com.jsoft.String;

class Test1{
	public static void main(String[] args) {
		String s="Abdul waris";
		s=s.concat(" Waris");
		System.out.println(s);
		System.out.println("------------------------");
		
		String s1="abdul";
		String s2="abdul";
		String s3=new String("abdul");
		String s4="Waris";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//false
		System.out.println("------------------------");
		
		String s5="abdul";
		String s6="ABDUL";
		System.out.println(s5.equals(s6));//false
		System.out.println(s5.equalsIgnoreCase(s6));//true
		
		System.out.println("------------------------");
		
		String s7="abdul";
		String s8="abdul";
		String s9=new String("abdul");
		System.out.println(s7==s8);//true
		System.out.println(s7==s9);//false
		
		System.out.println("------------------------");
		
		String s10="abdul";
		String s11="abdulw";
		String s12="abdul";
		String s13=new String("abdul");
		String s14="abc";
		String s15="ab";
		System.out.println(s10.compareTo(s11));//-1
		System.out.println(s10.compareTo(s12));//0
		System.out.println(s10.compareTo(s13));//0
		System.out.println(s14.compareTo(s15));//1
		System.out.println("------------------------");
		
		String s16="abdul"+"waris";
		System.out.println(s16);//abdulwaris
		
		System.out.println("------------------------");
		
		String s17="Abdul";
		String s18="Waris";
		System.out.println(s17.concat(s18));//AbdulWaris
		
		System.out.println("------------------------");
		
		String s19="550"+"abdul"+"waris"+"450";
		System.out.println(s19);//550abdulwaris450
		
		System.out.println("------------------------");
		
		String s20="abcdefghijklmnopqrstuvwxyz";
		System.out.println(s20.substring(5,10));//fghij
		
		System.out.println("------------------------");
		String s21="abdul waris khan";
		System.out.println(s21.substring(0,5));//abdul
		System.out.println(s21.substring(5));//waris khan
		System.out.println("------------------------");
		
		String s22="Anwarul Hasan";
		System.out.println(s22.toUpperCase());//ANWARUL HASAN
		System.out.println(s22.toLowerCase());//anwarul hasan
		System.out.println(s22);//Anwarul Hasan (No change)
		System.out.println("------------------------");
		
		String s23="  Waris khan  ";
		System.out.println(s23.trim());//Waris khan  remove the space before and after
		System.out.println(s23);//  Waris khan  
		System.out.println("------------------------");
		
		String s24="Anwarul hasan";
		System.out.println(s24.startsWith("Anw"));//True
		System.out.println(s24.endsWith("an"));//true
		System.out.println(s24.startsWith("san"));//false
		System.out.println("------------------------");
		
		String s25="Jamal bhaijan";
		System.out.println(s25.charAt(9));//i
		System.out.println("------------------------");
		
		String s26="Abdulkhalique";
		System.out.println(s26.length());
		String s27=s26.intern();
		System.out.println(s26.intern());
		System.out.println(s27);
		System.out.println("------------------------");
		
		int a=105;
		String s28=String.valueOf(a);
				System.out.println(s28+a);
				System.out.println("------------------------");
				
				String s29="Abdul Waris khan : Abdul Khalique: Abdul Majid";
				String s30=s29.replace("Abdul", "Mohammad");
				System.out.println(s30);//Here replace Abdul to Mohammad
			StringBuffer s31=new StringBuffer("Abdul waris");
				s31.append("Khan");
				System.out.println(s31);
			
				System.out.println("------------------------");
				StringBuffer s32=new StringBuffer("Jsoft india technology");
				s32.append(" Sakinaka");
				System.out.println(s32);
				
				System.out.println("------------------------");
				StringBuffer s33=new StringBuffer("Hello hasan");
				s33.insert(5," hasan");
				System.out.println(s33);
				
				System.out.println("------------------------");
				StringBuffer s34=new StringBuffer("Hello");
				s34.replace(2,5,"Java"); 
				System.out.println(s34);//HeJava
				
				System.out.println("------------------------");
				StringBuffer s35=new StringBuffer("Abdullah");
				s35.reverse();
				System.out.println(s35);
				
				System.out.println("------------------------");
				StringBuffer s36=new StringBuffer();
			
				System.out.println(s36.length());
				System.out.println(s36.capacity());
				s36.append("Hello jsoft");
				System.out.println(s36.capacity());
				s36.append("Java is my favoirit Language");
				s36.capacity();
				System.out.println(s36);
				
				StringBuffer jk=new StringBuffer();
				System.out.println(jk.length());//0
				
				System.out.println("------------------------");
				StringBuffer s37=new StringBuffer();
				System.out.println(s37.capacity());
				s37.ensureCapacity(55);
				System.out.println(s37);
				System.out.println(s37.capacity());
				
				System.out.println("------------------------");
				StringBuilder s38=new StringBuilder("Hello java");
				s38.append(" Hi");
				System.out.println(s38);
				
				System.out.println("------------------------");
				StringBuilder s39=new StringBuilder("Abdul");
				s39.insert(1, "Waris");
				System.out.println(s39);//AWarisbdul
				
				System.out.println("------------------------");
				StringBuilder s40=new StringBuilder("Hasan");
				s40.replace(1, 3, "anwarul");
				System.out.println(s40);

				String t="asdsf";
				t.replace("asdsf", "abcd");
				System.out.println(t);
				
				System.out.println("------------------------");
				String s41="java programming";
				System.out.println(s41.indexOf('a'));//1
				System.out.println(s41.lastIndexOf('g',10));//5
				
				
				StringBuilder s42=new StringBuilder("abcdef");
				s42.replace(3,5, "hello");
				System.out.println(s42);
				
				String ti="Hello";
				System.out.println(ti);
				String t2=new String("hello12");
				System.out.println(t2);
			String t34=t2.intern();
			System.out.println(t34);
				StringBuffer sw=new StringBuffer("this is javatpoint");
				sw.reverse();
				System.out.println(sw);
				


				
	}
}