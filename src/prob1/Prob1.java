package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 금액: 67879
		System.out.print("금액:");
		int money = scanner.nextInt();

		int a = money / 50000;
		money = money % 50000;

		int b = money / 10000;
		money = money % 10000;

		int c = money / 5000;
		money = money % 5000;

		int d = money / 1000;
		money = money % 1000;

		int e = money / 500;
		money = money % 500;

		int f = money / 100;
		money = money % 100;

		int g = money / 50;
		money = money % 50;

		int h = money / 10;
		money = money % 10;

		int i = money / 5;
		money = money % 5;

		int j = money / 1;
		money = money % 1;

		System.out.println("50000원 : " + a + "개");
		System.out.println("10000원 : " + b + "개");
		System.out.println("5000원 : " + c + "개");
		System.out.println("1000원 : " + d + "개");
		System.out.println("500원 : " + e + "개");
		System.out.println("100원 : " + f + "개");
		System.out.println("50원 : " + g + "개");
		System.out.println("10원 : " + h + "개");
		System.out.println("5원 : " + i + "개");
		System.out.println("1원 : " + j + "개");

		scanner.close();
	}
}