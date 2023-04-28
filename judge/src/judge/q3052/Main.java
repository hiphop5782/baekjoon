package judge.q3052;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i < 10; i++) {
			int number = sc.nextInt();
			set.add(number % 42);
		}
		sc.close();
		
		System.out.println(set.size());
	}
}
