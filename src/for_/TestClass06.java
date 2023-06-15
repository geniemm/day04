package for_;

import java.util.Scanner;

public class TestClass06 {
public static void main(String[] args) {
	
	// 소수
	
	Scanner sc = new Scanner(System.in);
	System.out.print("1을 제외한 정수 입력: ");
	int num = sc.nextInt();
	int result=0;
	if(num<2) {
		System.out.println("소수가 아닙니다.");
	}
	if(num==2) {
		System.out.println(num+"은 소수입니다.");
	}
//	int i=0;
//		for(i=2;i<num;i++) {
//			if(num%i==0) {
//				result=0;
//			}
//		}
//	
//		if(result==1) {
//			System.out.println(num+"은 소수입니다.");
//		}else if(result==0){
//			System.out.println(num+"은 합성수입니다.");
//		}
	int i;
	for(i=2;i<num;i++) {
		if(num%i==1) {
			System.out.println("소수");
		}
		
	}
		
}


}	

