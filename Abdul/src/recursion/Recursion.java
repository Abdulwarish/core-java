package recursion;

class Gf{
	int no=1;
	void disp(int x) {
		if(x>0) {
			disp(x-1);
			System.out.println(no++);
		
		}
	}
}
public class Recursion
{
	public static void main(String[] args) {
		Gf o=new Gf();
		o.disp(10);
	}
}

/*
class Typer{
    int count=1;
    void display(int x){
    System.out.println(count);
      count++;
      if(count==x+1)
        return;
     display(x);
    }
}
public class Main
{
	public static void main(String[] args) {
		Typer b=new Typer();
		b.display(10);
	}
}
*/