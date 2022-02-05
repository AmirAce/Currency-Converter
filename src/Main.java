import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Enter your Currency");
			Scanner scan = new Scanner(System.in);
			int toman = scan.nextInt();
			System.out.println(toDollars(toman));
			
	}
	public static int toDollars(int toman) {
		int Dollars = toman/30000;
		return Dollars;
	}

}
