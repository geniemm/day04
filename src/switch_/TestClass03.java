package switch_;

import java.util.Scanner;

public class TestClass03 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("1번째 문자열 입력: ");
	String str1=sc.next();
		
	switch(str1) {
	case "안녕" : System.out.println("안녕~");
		break;
	case "그래" : System.out.println("그래!");
		break;
	default : System.out.println("그 외의 값 입력");
	
	
	}
}
}
