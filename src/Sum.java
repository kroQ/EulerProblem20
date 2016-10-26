import java.math.BigInteger;

public class Sum {

	public static void main(String[] args) {

		BigInteger bi1, bi2, wynik;
		bi1 = new BigInteger("1");
		bi2 = new BigInteger("1");
		wynik = new BigInteger("1");

		for (int i = 0; i < 99; i++) {
			wynik = wynik.multiply(bi1.add(bi2));
			bi1 = bi1.add(bi2);
		}

		String s = new String(wynik.toString());
		char c[] = new char[s.length()];
		//System.out.println(wynik);
		c = s.toCharArray();

		int suma = 0;
		for (int i = 0; i < s.length(); i++) { //sumowanie cyfr
			//System.out.print(c[i]);
			suma += (int) c[i] - 48; // bo w ASCII 0 jest na 48 pozycji
		}
		System.out.println("\n" + suma); //648
	}
}