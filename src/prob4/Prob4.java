package prob4;

public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);

		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}

	public static char[] reverse(String str) {

		char[] array = new char[str.length()];

		for (int i = 1; i < str.length() + 1; i++) {

			array[i - 1] = str.charAt(str.length() - i);
		}

		return array;

	}

	public static void printCharArray(char[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}

}
