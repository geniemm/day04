package switch_;

import java.util.Scanner;

public class TestClass05 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	// 문제1
	
	int day;
	
	System.out.print("날짜를 입력하세요: ");
	day = sc.nextInt();
	
	if(day>31 || day<1) {
		System.out.println("날짜는 1일부터 31일까지 입력가능합니다.");
	}
	else {
		switch(day%=7) {
		case 1: System.out.println("월"); break;
		case 2: System.out.println("화"); break;
		case 3: System.out.println("수"); break;
		case 4: System.out.println("목"); break;
		case 5: System.out.println("금"); break;
		case 6: System.out.println("토"); break;
		case 0: System.out.println("일"); break;
	
		}
	}
	
	System.out.println("\n===============================\n");
	
	// 문제 2
	
	int num1;
	String home = null, office = null;
	
	while(true) {
	System.out.println("\n*** list ***");
	System.out.println("1. 우리집 등록");
	System.out.println("2. 회사 등록");
	System.out.println("3. 등록 보기");
	System.out.print("번호 선택: ");
	num1=sc.nextInt();
	
	
		switch(num1) {
		case 1:
			System.out.println("\n1. 우리집 등록\n=> ");
			home = sc.next();
			System.out.println("등록완료");
			break;
		case 2:
			System.out.println("\n2. 회사 등록\n=> ");
			office = sc.next();
			System.out.println("등록완료");
			break;
		case 3:
		
			System.out.println("\n우리집: "+home);
			System.out.println("회사: "+office);
			
		}	
	
	}
	
}
}
