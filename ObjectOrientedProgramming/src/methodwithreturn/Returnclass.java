package methodwithreturn;

public class Returnclass {

	//2개의 정수를 매개변수로 받아서 더한 후 결과를 출력하는 메소드 생성하기
	public void addDisplay(int a, int b)
	{
		System.out.println("Result of a+b is : "  + (a+b));
	}
	
	//2개의 정수를 매개변수로 받아서 더한 후 결과를 리턴하는 메소드
	public int addreturn(int a, int b) //더이상 void가 아니야! return이있으면 자료형 써줘
	{
		return(a+b);
	}
	
}
