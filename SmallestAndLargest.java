//program for checking largest and smallest among three numbers
import java.util.*;
public class SmallestAndLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first , second and third numbers:");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int last = sc.nextInt();
		
		int largests = largest(first,second,last);
		int smallest = smallest(first,second,last);
		System.out.println("largest value is : "+largests);
		System.out.println("smallest value is : "+smallest);
		
		sc.close();
		
		

	}
	public static int largest(int first , int second, int last) {
		int max=first;
		if(second>max) {
			max=second;
		}
		if(last>max) {
			max=last;
		}
		return  max;
	}
	public static int smallest(int first , int second, int last) {
		int min=first;
		if(second<min) {
			min=second;
		}
		if(last<min) {
			min=last;
		}
		return  min;
	}

}
