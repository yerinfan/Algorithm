package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

	
	public static void main(String[] args) {
		// 사람 수 입력 받기
		int num = getPositiveNumber("사람 수 : ");
		int[] height = new int[num];
		
		// 사람 수만큼 키를 random 생성하여 배열에 저장
		getRandArray(height, 100, 200);
		// 배열에서 가장 큰 값 찾기
		
		// 출력
		
		Random rand = new Random();
		
		
		int max = maxOf(height);
		
		System.out.println("가장 큰 키는 " + max + "cm입니다.");	
	}
	
		static int getPositiveNumber(String message) {
			
			Scanner input = new Scanner(System.in);
			
			int num;
			
			do {
				System.out.println(message);
				num = input.nextInt();
			} while (num <= 0);
			
			return num;
		}

		static void getRandArray(int[] numArr, int start, int end) {
			Random rand = new Random();
			
			for (int i = 0; i < numArr.length; i++) {
				numArr[i] =start + rand.nextInt(end - start);
				System.out.print(numArr[i] + " ");
			}
			System.out.println();
		}
		
		
		static int maxOf(int[] numArr) {
			
			int max = numArr[0];
			
			for (int i = 1; i < numArr.length; i++) {
				if (numArr[i] > max) max = numArr[i];
			}
			return max;
		}
		
}