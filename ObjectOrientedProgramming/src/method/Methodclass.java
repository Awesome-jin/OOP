package method;

public class Methodclass {
	// 매개변수가 없고 리턴 타입이 void인 메소드 생성
	public void print() {
		// 메소드의 내용을 중괄호 안에다가 적어준다
		for (int i =0; i<=2; i=i+1)
		{
			System.out.println("hi java");
		}
	}
	
	// 매개변수가 정수1개 이고 리턴 타입이 void인 메소드
	// 이 메소드는 호출하려면 반드시 정수 1개를 넘겨줘야 함
	// 이렇게 만들면 hi java를 정수의 수만큼 찍어낼 수 있게 활용도가 높아진다.
	public void print(int n) { // 위와 메소드 이름이 같아! = 메소드 오버로딩
		// 메소드의 내용을 중괄호 안에다가 적어준다.
		for (int i =0; i<n; i=i+1)
		{
			System.out.println("hi java");
		}
	}
}
