package for_;

public class TestClass07 {
public static void main(String[] args) {
	
	//1~50사이의 3의배수 출력한 후, 3의 배수의 개수를 구하여라.
	
	int count=0;
	for(int i=1;i<=100;i++) {
		if(i%3==0) {
			System.out.println("3의 배수: "+i);
			count++;
		}
	}
	System.out.println("====================");
	System.out.println("3의 배수의 개수: "+count);
}
}
