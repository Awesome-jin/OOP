// main 메소드가 없는 클래스 - 실행 불가. 보조적인 역할만 수행하는 클래스
public class Sampleclass {

	// static 변수 - 클래스로 접근 가능하고 인스턴스로도 접근 가능
	// 모든 인스턴스가 공유
	static int share = 1;

	// 인스턴스 변수(멤버 변수) - 인스턴스만 접근 가능하고 각 인스턴스가 별도로 소유
	String name;

	// static 초기화 블럭 만들어보기 (내용 한 번만 수행!!)
	static {
		System.out.println("클래스가 처음 호출될때 1번만 수행");
	} // 실제 디버깅해보면 얘가 맨 처음에 나옴

}
