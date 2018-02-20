package prob5;

import java.util.Random;
import java.util.Scanner;

import com.sun.tools.corba.se.idl.Generator;

public class Prob5 {

	public static void main(String[] args) {

		Random generator = new Random();

		boolean isAnswer = false;
		boolean reGame = false;

		int i = 1;
		int min = 1;
		int max = 100;

		int answer = generator.nextInt(101) + 1;
		System.out.println(answer);

		System.out.println("수를 결정하였습니다. 맞추어보세요");
		System.out.println("1-100");

		while (!reGame) {

			Scanner sc = new Scanner(System.in);
			System.out.print(i++ + ">>");
			int inputNum = sc.nextInt();

			if (inputNum > answer) {
				max = inputNum;
				System.out.println("더 낮게");
				System.out.println(min + "-" + max);

			} else if (inputNum < answer) {
				min = inputNum;
				System.out.println("더 높게");
				System.out.println(min + "-" + max);
			} else {
				System.out.println("맞았습니다.");
				isAnswer = true;
			}

			if (isAnswer == true) {
				System.out.println("다시하시겠습니가(y/n)>>");
				if (sc.next().equals("n")) {
					reGame = true;
				} else {
					i = 1;
					answer = generator.nextInt(101) + 1;
					System.out.println(answer);
					System.out.println("수를 결정하였습니다. 맞추어보세요");
					System.out.println("1-100");

				}

			}

		}

	}
}