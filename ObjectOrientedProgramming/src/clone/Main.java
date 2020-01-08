package clone;

import constructor.Student;

public class Main {

	public static void main(String[] args) {
		// 내부 데이터를 설정하는 거
		Student origin = new Student();
		origin.setMajor("ENG");
		origin.setName("Jin");
		origin.setNum(5);
		
		/* 참조형 사이의 대입
	 	origin이 가리키고 있는 인스턴스를 weak도 가리킴
		Student weak = origin;
		weak.setNum(6);  << 이런 코드를 박아버리는 순간 origin의 Num값까지 다 바뀌어버려. callbyreference!
		*/
		
		//origin을 복사해서 대입해보자
		Student deep = origin.clone();
		deep.setName("Jang");
		System.out.println(deep.getName());
		System.out.println(origin.getName());

	}

}
