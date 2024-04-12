package Queue;

import java.util.Scanner;

public class IntQueueTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		IntQueue s = new IntQueue(64);
		
		while (true) {
			System.out.printf("현재 데이터 개수 : %d / %d\n", s.getSize(), s.getCapacity());
			System.out.print("(1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 (0) 종료\n입력 : ");
			
			int menu = input.nextInt();
			if (menu == 0) break;
		
			int x;
			switch (menu) {
			case 1:
				System.out.print("데이터: ");
				x = input.nextInt();
				s.enqueue(x);
				break;
				
			case 2:
				System.out.printf("디큐한 데이터는 %d입니다.\n", s.dequeue());
				break;
				
			case 3:
				s.peak();
				break;
				
			case 4: 
				s.dump();
				break;
			}
			
			
		}

		
	}
}
