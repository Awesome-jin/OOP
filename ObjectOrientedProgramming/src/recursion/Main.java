package recursion;

public class Main {

	public static void main(String[] args) {
		// 피보나치 수열의 값을 불러보자
		// 인스턴스 생성해서 피보나치 수열1번 값에 10번째항 뽑아보자	
		Fibo obj = new Fibo();
		
		int result1 = obj.fibo1(10);
		System.out.println("Result of Fibonacci: " + result1);
		System.out.println("구분선====================");
		
		int result2 = obj.fibo2(10);
		System.out.println("Result of Fibonacci recursion type: " + result2);
	}

}
