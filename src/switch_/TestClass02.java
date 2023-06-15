package switch_;

import java.util.Scanner;

public class TestClass02 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	System.out.print("수 입력: ");
	int num = sc.nextInt();
	switch(num%2) {
	case 1: System.out.println("홀수: "+num);
		break;
	case 0 :System.out.println("짝수: "+num);
		break;
	//default: System.out.println("잘못입력하셨습니다.");
	
	}
	System.out.println("다음 문장 실행");
}
}
