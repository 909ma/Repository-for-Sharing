package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Java14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);

		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < N; i++) {
			String word = br.readLine();
			set.add(word);
		}

		int count = 0;

		for (int i = 0; i < M; i++) {
			String word = br.readLine();
			if (set.contains(word)) {
				count++;
			}
		}

		System.out.println(count);
	}
}
