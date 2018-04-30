import java.util.Random;
import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String cont = " ";
		do {
			int side = Validator.getInt(scnr, "How many sides should each die have? ");
			int num1 = RNG(side);
			int num2 = RNG(side);
			
			cont = Validator.getString(scnr, "Would you like to continue? y/n");
		} while (cont.equalsIgnoreCase("y"));
		System.out.println("Goodbye!");

		

	}
	
	public static int RNG(int Side) {
		Random rng = new Random ();
		int num = rng.nextInt(Side) + 1;
		System.out.println(num);
		return num;
	}
}
