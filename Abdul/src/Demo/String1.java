package Demo;

public class String1 {

	public static void main(String[] args) {
		String str=new String();
//		System.out.println("abc");
		String s1="abc";
		String s2=new String("abc");
		System.out.println(s1==s2);
		char ch[]= {'a','b','c','d','e','f'};
		String s5=new String(ch,2,3);
		System.out.println("ch :"+s5);
		
		byte[] b={97,98,99};
		String b1=new String(b);
		System.out.println(b1);
		
		byte cha[]={97,98,99};
		String s9=new String(cha,2,0);
		System.out.println(s9);
		
		String s13=new String("null");//We can't give the null value in String class Constructor
		System.out.println(s13);
		

	}

}
