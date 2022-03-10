package test;
class Demo{
int id;
String name;
float money;

void Demo(int i,String n){
	id=i;
	name=n;
}
void disp(){
	 System.out.println(id+" "+name+" "+money);
		}
		static class Demo2{
		public static void main(String args[]){
			Demo d1=new Demo();
			Demo d2=new Demo();
			d1.Demo(12,"abdul waris khan");
			d2.Demo(13,"Abdul Khalique khan");
			d1.disp();
			d2.disp();
		
		}
		
		}
}