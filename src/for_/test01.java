package for_;

import java.util.Scanner;

public class test01 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int jjak=0 ,hol=0 ;
	System.out.print("수 입력: ");
	int num = sc.nextInt();
	for (int i=1;i<=num;i++) {
		if(i%2==0) {
			jjak+=i;
		}
		else{
			hol+=i;
		}
	}
	
	System.out.println("짝수의 합: "+jjak);
	System.out.println("홀수의 합: "+hol);
	
	
	System.out.println("==================================");
//	음료 자판기에 아래의 기능을 구현 하시오
//	1. 입금(추가 입금 시 누적)
//	2. 구입(음료 선택 시 "음료이름+가 나왔습니다"출력하고 남은 금액 출력)
//		1. 커피(2500원)
//		2. 코코아(2000원)
//		3. 아이스티(1500원)
//	(음료가격보다 금액이 적을 때 "금액이 부족합니다." 출력)
//	3. 현재 금액 확인
//	4. 잔돈 반환(잔돈을 반환하고 금액을 0로 만듬)
//	5. 종료
//	(잘못 입력 시 "다시 입력" 출력)
	
	System.out.println("[ 음료 자판기 ]");
	System.out.println("[1]입금");
	System.out.println("[2]구입");
	System.out.println("[3]현재 금액 확인");
	System.out.println("[4]잔돈 반환");
	System.out.println("[5]종료");
	int inputMoney, money=0;
	while(true) {
	System.out.print("선택: ");
	int choice = sc.nextInt();
	switch(choice) {
	case 1: 
		System.out.print("입금할 금액을 입력하세요: ");
		inputMoney = sc.nextInt();
		money+=inputMoney;
		break;
	
	case 2:
		System.out.println("1. 커피(2500원)");
		System.out.println("2. 코코아(2000원)");
		System.out.println("3. 아이스티(1500원)");
		System.out.println("4. 메뉴 선택 취소");
		System.out.print("메뉴를 선택하세요: ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1: 
				if(money<2500)
				System.out.println("금액이 부족합니다.");
				
				else
				{System.out.println("커피가 나왔습니다.");
				money-=2500;
				System.out.println("남은 금액 : "+money+"원");
				}
				break;
		case 2: if(money<2000)
				System.out.println("금액이 부족합니다.");
			 	else {
				System.out.println("코코아가 나왔습니다.");
				money-=2000;
				System.out.println("남은 금액 : "+money+"원");
				}
				break;
		case 3: if(money<1500)
				System.out.println("금액이 부족합니다.");
			 	else {
				System.out.println("아이스티가 나왔습니다.");
				money-=1500;
				System.out.println("남은 금액 : "+money+"원");
			 	}break;
		case 4: System.out.println("메뉴 선택을 취소합니다."); break;
			}
		
		break;
		
	case 3: 
		System.out.println("현재 남은 금액 :"+money+"원");
		break;
	case 4:
		System.out.println("잔돈 반환: "+money+"원");
		money=0;
		break;
	case 5: System.out.println("== 주문 종료 =="); 
	break;
	default:
		System.out.println("다시 입력하세요.");
	}
	
	if(choice==5) {
		break;
	}
	}
	
	
	
	
	
	
	
	

}
}
