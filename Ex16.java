package chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex16 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		npira(num);

	}
	
	static void npira(int n) {
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i ; j++) {
				System.out.print(" ");
			}for (int j = (2*i - 1); j >= 1; j--) {
				System.out.print(i);
			}System.out.println();
		}
		
	}
}
