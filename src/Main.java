import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("choose an option:");
			System.out.println("1) convert");
			System.out.println("2) see rates");
			System.out.println("3) exit");
			Scanner scan = new Scanner(System.in);
			int optscan = scan.nextInt();
			switch(optscan) {
			case 1: fromCurrency();
			}
		
			
	}
	public static int toDollars() {
		System.out.println("Enter amount to convert");
		Scanner scan = new Scanner(System.in);
		int toman = scan.nextInt();
		int Dollars = toman/30000;
		System.out.println(Dollars);
		return Dollars;
	}
	public static void fromCurrency() {
		System.out.println("What is your currency?");
		Scanner scan = new Scanner(System.in);
		String currency = scan.nextLine();
		switch(currency) {
		case "toman":toCurrency(currency);
		}
	}
	public static  void toCurrency(String currency) {
		System.out.println("what would you like to convert " + currency + " " + "to?");
		Scanner scan = new Scanner(System.in);
		currency = scan.next();
		switch(currency) {
			case "dollars":toDollars();
		}
	}

}
