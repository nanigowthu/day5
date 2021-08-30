package que1;
import java.util.Scanner;
public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Player Details");
		
		String str = sc.nextLine();
		String [] split = str.split(",");
		
		String n = sc.nextLine();
		String c = sc.nextLine();
		String s = sc.nextLine();
		
		SplitClass obj1 = new SplitClass(split[0], split[1],split[2]);
		
		obj1.PlayerDetails();
	}

}
