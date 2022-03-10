import javax.swing.plaf.synth.SynthScrollBarUI;

class StringBufferExample6 {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("dfd");
		StringBuffer sb1 = new StringBuffer("a");
		
		System.out.println(sb.capacity());// default 16
		// sb.append(sb1);
		System.out.println(sb.capacity());// now 16
		sb.append("java");
		System.out.println(sb.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
		
		do{ 
			
		}while((System.out.printf("hello world")==null));
		
		
		
		
	}
}
