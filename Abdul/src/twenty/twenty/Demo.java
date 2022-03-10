package twenty.twenty;

public class Demo {
	int rollno;  
	String name,course;  
	float fee;  
	Demo(int rollno,String name,String course){  
	this.rollno=rollno;  
	this.name=name;  
	this.course=course;  
	}  
	Demo(int rollno,String name,String course,float fee){  
	this(rollno,name,course);//C.T.Error  
	this.fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);
	
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
