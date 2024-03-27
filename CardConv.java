package chap02;

import java.util.Scanner;

public class CardConv {

	public static void main(String[] args) {
		// 양의 숫자 입력 받기
		int num = getPositiveNumber("양의 숫자 : ");
		
		// 몇 진수 변환할지 입력 받기 (양의 숫자)
		int N = getPositiveNumber("몇 진수로 변환할까요? (양수) : ");
		
		// 2진수로 변환하기(메서드)
		char[] cardNum = new char[64];
		int numDigit;
		numDigit = cardConv(num, N, cardNum);
		
		//변환결과 출력
		displayResult(cardNum, numDigit);
		
	}
	
	static int cardConv(int num, int N, char[] cardNum) {
		int numDigit = 0;
		String digitChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		while (num > 0) {
			cardNum[numDigit++] = digitChar.charAt(num % N);
			num /= N;
		}
		
		return numDigit;
	}
	
	static void displayResult(char[] cardNum, int numDigit) {
		for (int i = numDigit - 1; i >= 0; i--) {
			System.out.print(cardNum[i]);
		} System.out.println();
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
