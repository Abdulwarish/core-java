package overriding;
class OO{
	public void m1() {
		System.out.println("A");
	}
}
	class Demo extends OO{
		public void m1() {
			System.out.println("B");
		}
		public static void main(String[] args) {
			OO o=new Demo();
			o.m1();
		}
	}