import java.util.Scanner;

public class PasswordSoloLearn {

	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		//System.out.println(input);
		char [] in = input.toCharArray();
		/*for (char i : in) {
			System.out.println(i);
		}*/
		int letters = 0;
		int numbers = 0;
		int signs = 0;
		int len = in.length;

		System.out.println("len: " + len);

		for (char i : in) {
			if (i >= '0' && i <= '9') {
				numbers++;
			}
			if (i>='a' && i<='z' || i>='A' && i<='Z') {
				letters++;
			}
			if (i=='!' || i=='@' || i=='#' || i=='$' || i=='%' || i=='&' || i=='*') {
				signs++;
			}
		}
		System.out.println("letters: " + letters + " numbers: " + numbers + " signs: " + signs);
	}
}
