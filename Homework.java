import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Ar dirbate siuo metu?");
		String ats = scan.nextLine();
		System.out.println("Kokio dydzio santaupas turite?");
		int santaupos = scan.nextInt();
		System.out.println("Kokio dydzio paskola norite gauti?");
		int paskola = scan.nextInt();

		switch (ats) {
		case ("taip"):
			if (paskola <= 5000 || paskola < 2 * santaupos)
				System.out.println("Paskola isduosime");
			else
				System.out.println("Tokios paskolos isduoti negalime, bandykite pasirinkti mazesne paskolos suma");
			break;
		case ("ne"):
			if (paskola < 2 * santaupos)
				System.out.println("Paskola isduosime");
			else
				System.out.println("Tokios paskolos isduoti negalime, bandykite pasirinkti mazesne paskolos suma");
			break;
		default:
			break;
		}

		scan.close();
	}

}
