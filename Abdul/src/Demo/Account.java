package Demo;

public class Account {
	long acc_no;
	String name;
	float amount;
	void insert(long ac,String n,float am) {
		acc_no=ac;
		name=n;
		amount=am;
	}
	void deposit(float am) {
		amount=amount+am;
		System.out.println("Deposited Total is="+amount);
	}
	void withdraw(float am) {
		if(amount<am) {
			System.out.println("Insufficient Balance");
		}
		else {
			amount=amount-am;
			System.out.println(am+"withdrawn");
		}
		
	}
	void check_Balance() {
		System.out.println("total Amount is= "+amount);
	}
	void disp() {
		System.out.println("Account Number is:"+acc_no+" "+"\nAccountHolder_Name Is: "+name+" "+"\n Total AmmountIs "+"amount");
	}
	public static void main(String[] args) {
		Account obj=new Account();
		obj.insert(91001919090l,"Abdul",50000.0f);
		//obj.deposit(10000);
		obj.check_Balance();
		//obj.withdraw(90000);
		//obj.disp();
	}
}
