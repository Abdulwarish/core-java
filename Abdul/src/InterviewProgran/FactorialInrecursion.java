package InterviewProgran;
class FactorialNum{
	public static int factor(int num) {
		if(num==0){
			return 1;
		}
		else
		{
		return num*factor(num-1);
		}
	}
}
public class FactorialInrecursion {

	public static void main(String[] args) {
		int s=FactorialNum.factor(5);
		System.out.println(s);
	}
}
