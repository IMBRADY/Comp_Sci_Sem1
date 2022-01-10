package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dwarf {
	public String name;
	public int age;
	public String nom;
	public int c;
	public Dwarf()
	{
		name = "";
		age = 0;
	}
	public Dwarf(String a, int b)
	{
		name = a;
		age = b;
	}
	public void setName(String a)
	{
		name = a;
	}
	public void setAge(int a)
	{
		age = a;
	}
	public void isSameNameCheck(String a)
	{
		isSameName(a,"a");
	}
	public boolean isSameName(String a, String b)
	{
		if(a == b)
		{
			return true;
		}
		else if(a != b)
		{
			return false;
		}
		else
		{
			return false;
		}
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
