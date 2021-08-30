package que7;
import java.util.Scanner;
public class PLAYERMAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter The Player Name ");
		String name = sc.next();
		System.out.println("Enter The Country Name ");
		String country = sc.next();
		System.out.println("Enter The Skill ");
		String skill = sc.next();
		
		System.out.println("Player Name: "+name);
		System.out.println("Country Name: "+country);
		System.out.println("skill: "+skill);
	}

}
