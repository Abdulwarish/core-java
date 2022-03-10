import java.lang.reflect.Method;

class Student2 {
	public int getint() {
		return 0;

	}

	public String getName() {
		return null;

	}
}
class Over {

	public static void main(String args[]) throws ClassNotFoundException {
		Student2 first = new Student2();
		int hash = first.hashCode();
		System.out.println(hash);

		Student2 second = new Student2();
		int hash1 = second.hashCode();
		System.out.println(hash1);

		Class e = Class.forName("Student2");
		e.getMethods();
		System.out.println(e.hashCode());
		Method[] m = e.getDeclaredMethods();

		// String a = e.getName();
		// System.out.println(a);
		int count = 0;
		for (Method df : m) {

			System.out.println(df);
			count++;
		}
		System.out.println("There are " + count + " methods");
	}
}