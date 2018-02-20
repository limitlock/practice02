package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("5개의 숫자를 입력하세요.");

		int intArray[] = new int[5];
		double sum = 0;

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			sum += intArray[i];
		}

		System.out.println(sum / intArray.length);

		scanner.close();

	}
}
