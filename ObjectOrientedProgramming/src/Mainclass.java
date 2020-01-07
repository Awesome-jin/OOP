
public class Mainclass {

	public static void main(String[] args) {
		// 실행이 가능한 메인 클래스
		
		/*Sampleclass의 인스턴스 만들기
		new sampleclass() : 인스턴스를 만드는데, 이 구문을 수행하고 참조만 리턴함!!
		재사용하려면 참조를 동일한 자료형의 변수에 대입을 해야한다 
		딱 한 번만 사용하고 말거다! 이러면 new sampleclass();만해도 된다. */
		Sampleclass obj = new Sampleclass();
		
		/*2. final 변수는 생성과 동시에 값을 할당해야 함!!
		 모두 대문자로 써서 얘는 final 변수야 라고 구분지어 줘야한다*/ 
		final int TEN = 10;  // final int = x; 이런식이면 안된다
		//TEN = 20; // 
		
		//Sampleclass의 인스턴스를 2개 생성
		Sampleclass ob1 = new Sampleclass();
		Sampleclass ob2 = new Sampleclass();
		
		//인스턴스 변수에 값 대입
		ob1.name = "첫번째 인스턴스";
		ob2.name = "두번째 인스턴스";
		//static이 붙지 않은 멤버는 클래스 호출 불가
		//Sampleclass.name은 안됨!
		
		//인스턴스 변수의 값 출력
		System.out.println(ob1.name);
		System.out.println(ob2.name);
		
		//static 변수에 값 대입
		// 클래스와 인스턴스 모두 접근 가능
		ob1.share = 100;
		Sampleclass.share = 200;
		// static 변수는 하나만 만들어서 공유함
		// 출력하면 동일한 값을 출력
		System.out.println(ob1.share);
		System.out.println(Sampleclass.share);
	}

}
