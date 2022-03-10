package Demo;

class Studentnew {
	int sid;
	String name;
	String adderess;

	Studentnew(int sid, String name, String adderess) {
		this.sid = sid;
		this.name = name;
		this.adderess = adderess;
	}
}
class Studentmarks {
	Studentnew studenew;
	int stmarks;
	String subject;
	float percentage;

	Studentmarks(Studentnew studenew, int stmarks, String subject, float percentage) {
		this.studenew = studenew;
		this.stmarks = stmarks;
		this.subject = subject;
		this.percentage = percentage;
	}

	void disp() {
		System.out.println(stmarks + "" + subject + "" + percentage);
		System.out.println(studenew.sid + "" + studenew.name + "" + studenew.adderess);
	}
}

class Aggerigation {
	public static void main(String[] args) {
		Studentnew ob = new Studentnew(6, " Abdul Warish", "Sakinaka");
		Studentnew ob1 = new Studentnew(8, " Abdul", "mumbai");
		Studentmarks ob2 = new Studentmarks(ob, 455, " java ", 76.6f);
		Studentmarks ob3 = new Studentmarks(ob1, 567, " C++ ", 88.6f);
		ob2.disp();
		ob3.disp();
	}
}

/*
 * class Operation{ int square(int n){ return n*n; } }
 * 
 * class Aggerigation{ Operation op;//aggregation double pi=3.14;
 * 
 * double area(int radius){ op=new Operation(); int
 * rsquare=op.square(radius);//code reusability (i.e. delegates the method
 * call). return pi*rsquare; }
 * 
 * 
 * 
 * public static void main(String args[]){ Aggerigation c=new Aggerigation();
 * double result=c.area(5); System.out.println(result); } }
 */