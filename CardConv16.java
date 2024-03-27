package chap02;

import java.util.Scanner;

public class CardConv16 {
	public static void main(String[] args) {
		// 양의 숫자 입력 받기
		int num = getPositiveNumber("양의 숫자 : ");
		
		// 2진수로 변환하기(메서드)
		char[] cardNum = new char[64];
		int numDigit;
		numDigit = cardConv16(num, cardNum);
		
		//변환결과 출력
		displayResult(cardNum, numDigit);
		
	}
	
	static void displayResult(char[] cardNum, int numDigit) {
		for (int i = numDigit - 1; i >= 0; i--) {
			System.out.print(cardNum[i]);
		} System.out.println();
	}
	
	static int cardConv16(int num, char[] cardNum) {
		int numDigit = 0;
		String digitChar = "0123456789ABCDEF";
		
		while (num > 0) {
			cardNum[numDigit++] = digitChar.charAt(num % 16);
			num /= 16;
		}
		
		
		return numDigit;
	}
	
	static int getPositiveNumber(String message) {
		Scanner input = new Scanner(System.in);
		
		int num;
		do {
			System.out.println(message);
			num = input.nextInt();
		}while(num <= 0);
		return num;
	}
	
	
	
}
