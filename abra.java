import java.util.Scanner;

public class abra {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int abra;
		int kadabra;
		int liczba;

		System.out.println("Podaj liczb� ABRA");
		abra = scanner.nextInt();
		System.out.println(abra + " to liczba ABRA");

		System.out.println("Podaj liczb� KADABRA");
		kadabra = scanner.nextInt();
		System.out.println(kadabra + " to liczba KADABRA");

		System.out.println("Do ilu ma sprawdza�?");
		liczba = scanner.nextInt();
		System.out.println("B�dzie sprawdza� do " + liczba);

		for (int a = 1; a <= liczba; a++) {
			if (a % abra == 0) {
				if (a % kadabra == 0)

					System.out.println("ALAKAZAM");

				else

					System.out.println("ABRA");
			}

			else if (a % kadabra == 0) {
				System.out.println("KADABRA");
			} else {
				System.out.println(a);
			}
		}
		scanner.close();
	}
}
