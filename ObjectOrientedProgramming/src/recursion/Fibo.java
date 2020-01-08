package recursion;

public class Fibo {

	//1. 재귀를 이용하지 않고 n번째 피보나치 수열의 값을 리턴하는 메소드
	
	public static int fibo1(int n)
	{
		if (n==1 | n==2) {
			return 1; // 두번째항까지는 무조건 1만 리턴해라
		}
		else //3번째부터는 2전 두개 항의 합을 계산해야함
		{
			int result = 0; 	// 피보나치 수열의 값을 저장할 변수
			int f1 = 1; //f(n-1) 초기값
			int f2 = 1; //f(n-2) 초기값
			for(int i =3; i<=n; i=i+1)
			{
				result = f1 + f2; // f(n-1) + f(n-2)가 우리가 구하고 싶은 값
				f2 = f1; // 프로그램에선 자리바꾸기가 안되니까 1차수 높은 값으로 값을 바꿔주는 것
				f1 = result; //위와 마찬가지
			}
			return result;
		}
	}
	// 현재 클래스 내부에 있는 메소드를 부를때는 이름만 기재하면 됨
	//int r = fibo1(10);
	
	// 재귀를 이용해서 코딩해보자 : n값이 커지면 계산 속도가 굉장히 느리다.
	public static int fibo2(int n) {
		if(n==1||n==2) {
			return 1;
		}
		else { //fibo2 메소드 내에서 fibo2를 다시부르기 때문에 재귀라고 부른다.
			return fibo2(n-1)+fibo2(n-2);
		}
	}
	
}
