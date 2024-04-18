package work;

import java.util.Scanner;

public class vending {

	
	public static void main(String[] args) {
		
		//자판기 돌린다 while(true) (시간체크 1분이 넘어가는가?- 넘어가면 returnCoin(), break;)
		// 입력을 받기 위한 스캐너 생성
        Scanner input = new Scanner(System.in);

        // 입력을 처리하는 스레드 시작
        Thread inputThread = new Thread(() -> {
        	int sumCoin = 0;
        	
    		while (true) {
 			   
            	// print 콘솔
            	System.out.printf("현재 투입 금액 : %d\n", sumCoin);
            	
            	// 동전을 받는다 1000, 500, 100, 50, 10원
            		System.out.print(">>동전을 투입하세요. (투입 가능 금액 : 1000, 500, 100, 50, 10) : ");
            		int coin = input.nextInt();
            			if (coin == 1000 || coin == 500 || coin == 100 || coin == 50 || coin == 10)
            				sumCoin += coin;
            
            	// 만약 200원 이상일 시 메뉴 출력
            	if (sumCoin >= 200 && sumCoin < 300) {
            		int menu;
            		
            		System.out.printf("%d원이 있습니다.\n주문 가능 음료 : \n 1. 밀크 커피\n 2. 블랙커피\n 3. 돈 반환\n", sumCoin);
            		menu = input.nextInt();
            		switch (menu) {
            		case 1: 
            			System.out.println("밀크 커피를 가져가세요.");
            			sumCoin -= 200;
            			break;
            		case 2: 
            			System.out.println("블랙 커피를 가져가세요.");
            			sumCoin -= 200;
            			break;
            		case 3:
            			System.out.printf("%d원을 가져가세요.", sumCoin);
            			sumCoin = 0;
            			break;
            		}	
            	} else if(sumCoin >= 300) {
            		int menu;
            		System.out.printf("%d원이 있습니다.\n주문 가능 음료 : \n 1. 밀크 커피\n 2. 블랙커피\n 3. 율무차\n 4. 스팀 우유\n 5. 돈 반환\n", sumCoin);
            		menu = input.nextInt();
            		switch (menu) {
            		case 1: 
            			System.out.println("밀크 커피를 가져가세요.");
            			sumCoin -= 200;
            			break;
            		case 2: 
            			System.out.println("블랙 커피를 가져가세요.");
            			sumCoin -= 200;
            			break;
            		case 3:
            			System.out.println("율무차를 가져가세요.");
            			sumCoin -= 300;
            			break;
            		case 4:
            			System.out.println("스팀 우유를 가져가세요.");
            			sumCoin -= 300;
            			break;
            		case 5:
            			System.out.printf("%d원을 가져가세요.", sumCoin);
            			sumCoin = 0;
            			break;
            			}
            		}	
    		}
        });
        inputThread.start();

        // 시간을 체크하고 60초가 경과하면 스레드를 종료
        try {
            Thread.sleep(60000); // 60초를 밀리초 단위로 설정
            inputThread.interrupt(); // 스레드를 중단
            System.out.println("60초 이상 입력이 없어서 종료합니다.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        	 input.close();
        }
	
		// print 콘솔 (메뉴와 현재 투입된 금액 출력) 
		// 버튼을 만들어 (swtich)
		// 1~4번은 메뉴, 5번은 돈입력 , 6번 돈반환, 0번 종료
		
		// case 6가지
		// 1번 밀크 커피 200원 
		 /* 
		  sumcoin >= 200 ? 출력, 200원빼기 : break;
		 */
		// 2번 블랙 커피 200원
		 /* 
		  sumcoin >= 200 ? 출력, 200원빼기 : break;
		 */
		// 3번 율무차 300원
		 /* 
		  sumcoin >= 300 ? 출력, 300원빼기 : break;
		 */
		// 4번 스팀 우유 300원
		 /* 
		  sumcoin >= 300 ? 출력, 300원빼기 : break;
		 */
		// 5번 돈 입력 inputCoin() break;
		// 돈이 가격  (1000 , 500, 100, 50, 10)에 해당하는가? checkCoin() (입력받을때 체크)
		
		// 6번 돈 반환 returnCoin() break;
		
		
		
		// print 종료
		
		
		//
	}

}
