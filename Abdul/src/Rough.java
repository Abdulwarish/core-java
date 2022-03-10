import java.util.Comparator;

import javax.swing.plaf.synth.SynthSpinnerUI;

import java.util.*;
class Emp implements Comparator<Emp>{
	int id;
	String name;
	float salary;
	public Emp(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compare(Emp o1, Emp o2) {
		if(o1.salary==o2.salary) {
			return 0;
		}
		else if(o1.salary>o2.salary) {
			return 1;
		}
		else if(o1.salary<o2.salary) {
			return -1;
		}
		return id;
		
	}
}
public class Rough {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(new Emp(1,"waris",2121));
		l.add(new Emp(2,"Suhail",34535));
		l.add(new Emp(3,"Asadullah",30000));
		Collections.sort(l,new Emp(0, null, 0));
		Iterator itr=l.iterator();
		while(itr.hasNext()){
			Emp em=(Emp)l.iterator();
			System.out.println(em.name+" "+em.id+" "+em.salary);
		}
	}
}
