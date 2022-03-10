package InterviewProgran;
class Factorial2{
	public static int factor(int num) {
		return num=(num==1)?1:num*factor(num-1);
	}
}
public class FactorialShortRecursion 
{
    public static void main( String[] args )
    {
    	System.out.println(Factorial2.factor(4));
	}
}
