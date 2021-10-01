import java.util.Scanner;
public class Ejemplo4 {
	public static void main (String argv[]) {
		float x;
		float squareArea;
		
		System.out.println("Enter the side:");
		
		//Reading the value
		
		Scanner inputValue;
		inputValue = new Scanner(System.in);
		x = inputValue.nextFloat();
		
		squareArea = x * x;
		System.out.println(squareArea);
		inputValue.close();
	}
}
