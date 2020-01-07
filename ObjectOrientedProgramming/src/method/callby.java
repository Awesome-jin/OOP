package method;

public class callby {

	// callbyvalue vs callbyreference

	// 정수 1개를 매개 변수로 받아서 1증가 시키고 출력하는 메소드 생성

	public void cbv(int n) {
		n = n + 1;
		System.out.println("n: " + n);
	}
	
	// 배열 1개를 매개변수로 받아서 첫번째 데이터를 1감소 시키고 출력하는 메소드 만들기
	public void cbr(int []ar)
	{
		ar[0] = ar[0]-1;
		System.out.println("ar[0]: " + ar[0]);
	}
}
