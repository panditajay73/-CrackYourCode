import java.util.*;
public class AreaAndCircumferenceOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius : ");
		int r=sc.nextInt();
		
		double area = Math.PI*(r*r);
		double circumference = Math.PI * 2 *r;
		
		System.out.println("Area is : "+area);
		System.out.println("Circumference is : "+circumference);
	}

}
