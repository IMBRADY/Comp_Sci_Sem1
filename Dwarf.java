package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dwarf {
	public String name;
	public int age;
	public Dwarf()
	{
		name = "";
		age = 0;
	}
	public void setName(String a)
	{
		name = a;
	}
	public void setAge(int a)
	{
		age = a;
	}
	public String getName()
	{
		return name;	
	}
	public int getAge()
	{
		return age;
	}
}
