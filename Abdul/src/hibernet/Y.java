package hibernet;

public class Y {
	
	public int add(int a, int b) {
		return 10;
	}
	public int add(Integer a,Integer b) {
		return 5;
	}

	public static void main(String[] args) {
		Y y =new Y();
		System.out.println(y.add(1000121212, 1000040000));
	}
}
