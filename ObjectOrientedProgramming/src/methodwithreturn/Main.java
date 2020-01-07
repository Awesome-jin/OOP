package methodwithreturn;

public class Main {

	public static void main(String[] args) {
		// obj 생성하기
		Returnclass obj = new Returnclass();
		obj.addDisplay(100, 200); //300이라는 값이 나오긴 하는데 그냥 그걸로 끝! 뭘 더 못해..
		
		// 결과 변수를 보여줄 객체 하나 더 만들기
		int result = obj.addreturn(100, 300);
		System.out.println("result: " + result); //결과를 보고 싶으면 매개변수로 아까 만든 객체 넣기
		
		// return 받은 값으로 추가 작업 해보기
		int result2 = obj.addreturn(result, 500); // return을 받은 값을 addreturn의 매개변수중 하나로 사용
		System.out.println("return받은 값을 매개변수로 사용해보기 : " + result2); // 새로운 결과를 보여주는 result2를 생성하여 출력
		
		// return 값이 있는 메소드는 다른 메소드의 매개변수가 될 수 있다.
		int result3 = obj.addreturn(400, obj.addreturn(100, 200));
		System.out.println("다른 메소드의 매개변수를 넣은 결과 : " + result3);
	}

}
