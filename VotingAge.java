import java.util.*;
public class VotingAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int n=sc.nextInt();
		
		if(n>=18)System.out.println("Elligible");
		else System.out.println("Not eligible");
		sc.close();
	}
	

}
