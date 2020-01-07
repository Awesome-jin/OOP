package method;

public class mainforcall {

	public static void main(String[] args) {
		// main 메소드에 확인하기 위한 코드를 작성하고 실행하기
		callby obj2 = new callby();
		
		int x = 100;
		int br[ ] = {100,200,300};
		
		obj2.cbv(x); // callbyvalue (복사본 빌려주기 - 메소드를 다녀와도 x값 자체는 안변해)
		System.out.println(x);
		
		System.out.println("====================== 구분선 ====================== ");
		
		obj2.cbr(br); //callbyreference (원본을 빌려주기 - 메소드를 다녀오면 값 변경 가능)
		System.out.println(br[0]);
		
	}

}
