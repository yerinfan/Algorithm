package chap02;

import java.util.Random;
import java.util.Scanner;

public class ReverseArrayRand {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("배열의 수 : ");
		int num = input.nextInt();
		int[] numArr = new int[num];
		
		getRandArray(numArr, 0, 100);
		
		// 배열 역순 정렬
		reverseArray(numArr);
		
		// 배열 출력
		displayArray(numArr);
		
		
		
	}
	
	static void reverseArray(int[] numArr) {
		for (int i = 0; i < numArr.length / 2; i++) {
			swapArr(numArr, i, numArr.length - 1 - i);
		}
	}
	
	static void reverseArray2(int[] numArr) {
		for (int i = 0, j = numArr.length - 1; i < numArr.length / 2; i++, j--) {
			swapArr(numArr, i, j);
		}
	}
	
	
	static void swapArr(int[] numArr, int source, int target) {
		int temp = numArr[source];
		numArr[source] = numArr[target];
		numArr[target] = temp;
	}
	
	static void displayArray(int[] numArr) {
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
	}
	
	static void getRandArray(int[] numArr, int start, int end) {
		Random rand = new Random();
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] =start + rand.nextInt(end - start);
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
	}
}

