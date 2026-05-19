package p01;

import java.util.Random;
import java.util.Scanner;

public class A12345 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String[] hands = { "グー", "チョキ", "パー" };

		System.out.print("0:グー 1:チョキ 2:パー → ");
		int user = sc.nextInt();
		int cpu = rand.nextInt(3);

		System.out.println("あなた：" + hands[user]);
		System.out.println("相手：" + hands[cpu]);

		if (user == cpu) {
			System.out.println("あいこ！");
		} else if ((user + 1) % 3 == cpu) {
			System.out.println("あなたの負け！");
		} else {
			System.out.println("あなたの勝ち！");
		}

		sc.close();
	}
}
