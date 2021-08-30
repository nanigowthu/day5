package que8;
import java.util.Scanner;
public class SplitClass {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	String name;
	String country;
	String skill;
	
	SplitClass(String n,String c,String s)
	{
		this. name= n;
		this. country= c;
		this. skill=  s;
	}
	void PlayerDetails() 
	{
	
		System.out.println("Player Details");
		System.out.println("Player Name: "+name);
		System.out.println("Country Name: "+country);
		System.out.println("skill: "+skill);
	}

}
