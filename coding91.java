import java.util.Scanner;
public class code {

	public static void main(String[] args) {
		
		/*for(int a = 1; a<=9; a++) {
			for(int b = 1; b<=9; b++) {
				System.out.print(a + "*" + b + "=" + a*b + "\t" );
			}System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("2 이상의 정수를 입력하십시오");
		int n = sc.nextInt();	// 입력값을 n에 저장
		
		boolean prime = true; 	//
		
		if(n<2) {
			prime = false;
		}else {
			for (int a = 2; a < n; a++) {
				if(n % a ==0)
					prime = false;
					break;
			}
		}
		if(prime)
			System.out.println(n + "은(는) 소수입니다");
		else
			System.out.println(n + "은(는) 소수가 아닙니다");
	
		int[] test;
		test = new int [5];
		
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;
		
		for(int i =0; i<5; i++) {
			System.out.println((i+1) + "번째 사람의 정수는" +
					test[i] + "입니다");
		}
		
		int[] test = {80,60,22,50,75};
		
		for(int i=0; i<test.length; i++) {
			System.out.println((i+1)+ "번째 사람의 점수는"+ test[i] + "입니다");
		}*/
		Scanner sc = new Scanner(System.in);
		int[] test = new int[5];
		
		System.out.println("5 명의 점수를 입력하십시오");
		
		for(int i=0; i<test.length; i++) {
			 test[i] = sc.nextInt();
		}
		
		for(int s = 0; s < test.length - 1; s++) {
			for(int t = s+1; t < test.length; t++) {
				if(test[t] > test[s]) {
					int tmp = test[t];
					test[t] = test[s];
					test[s] = tmp;
				}
			}
		}
		for(int j = 0; j < test.length; j++) {
			System.out.println((j + 1) + "번째 사람의 점수는" + test[j] + "입니다.");
		}
	}
}