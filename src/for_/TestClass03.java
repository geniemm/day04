package for_;

import java.util.Scanner;

public class TestClass03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int repet;
	System.out.println("반복 횟수 입력: ");
	repet = sc.nextInt();
	for(int i=1;i<=repet;i++) {
		System.out.println(i+".번 반복");
	}
	System.out.println("============");
	for (int i=repet;i>0;i--) {
		System.out.println(i+".번 실행");
	}
	System.out.println("다음 문장들 실행");
	sc.close();
}
}
