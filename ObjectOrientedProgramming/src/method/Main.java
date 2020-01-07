package method;

public class Main {

	public static void main(String[] args) {
		// hi java를 3번 출력해보기
		System.out.println("Hi Java");
		System.out.println("Hi Java");
		System.out.println("Hi Java");
		System.out.println("====================== 구분선 ====================== ");
		
		//methodclass의 인스턴스를 생성해줘야한다 ★★★
		// 반복문과 생성하는 이유는 비슷하다. 
		Methodclass obj = new Methodclass();
		
		// 메소드 호출 - hi java를 5번으로 바꾸고 싶다면 메소드 내용만 변경하면 된다!
		obj.print();  

		// 매개변수가 있는 메소드를 호출해보기
		System.out.println(" 매개변수 수만큼 찍힘 ====================== ");
		obj.print(1);
		System.out.println(" 매개변수 수만큼 찍힘 ====================== ");
		obj.print(2); //print라는 메소드 이름만 기억하면 매개변수를 적절히 활용해 다양한 메소드를 쓸 수 있게 해준다.
	}

}
