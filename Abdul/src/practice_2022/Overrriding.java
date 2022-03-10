package practice_2022;
/**
 * @Author Abdul Warish 08-Mar-2022
 */
class P{
	protected void m1() {
		System.out.println("P M1");
	}
}

public class Overrriding extends P{
	protected void m1() {
		System.out.println("Overrriding M1");
	}
	public static void main(String[] args) {
		P p =  new P();
		p.m1();
	}
}

