package test;
import java.util.ArrayList;

class Emp {
	int empNo;
	String name;
	float salary;
	
	Emp(int empNo,String name,float salary)
	{
		this.empNo=empNo;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return empNo+" "+name+" "+salary;
	}
}

public class Demo {
	public static void main(String args[])
	{
	Emp e1=new Emp(101,"aaa",5000.00f);
	Emp e2=new Emp(102,"bbb",5500.0f);
	Emp e3=new Emp(103,"ccc",56000.0f);
	//Emp e4=new Emp(105,102,5000.f); //not allow
	ArrayList<Emp> al=new ArrayList<> ();
	al.add(e1);
	al.add(e2);
	al.add(e3);
	
	//al.add(e4);
	System.out.println(al);
}
}
