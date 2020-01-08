package constructor;

public class Main {

	public static void main(String[] args) {
		
		//Student 클래스의 인스턴스를 생성
		/*자바 개발자는 인스턴스 1개를 만들면 클래스 이름 첫글자만 소문자로 변환한다.
		 *자바 개발을 할 때는 인스턴스를 자동으로 생성해주는 Spring 프레임워크를 많이 사용.
		 *Spring이 이름을 만들 때 이 규칙을 적용함
		 */
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		// 생성자를 별도로 없다면 인스턴스의 값은 기본값으로 채워진다 (이 경우엔 null)
		
		System.out.println("num"+student1.getNum()+"\t"+ "Name:"+student1.getName()+"\t"+"\t"+"Major:"+student1.getMajor());
		
		//기본값을 만들어 주기
		student2.setNum(1);
		student2.setMajor("ECN");
		student2.setName("Paul");
		System.out.println("num"+student2.getNum()+"\t"+ "Name:"+student2.getName()+"\t"+"\t"+"Major:"+student2.getMajor());
		
		//더이상 메소드를 부를 필요가 없음
		System.out.println("num"+student3.getNum()+"\t"+ "Name:"+student3.getName()+"\t"+"\t"+"Major:"+student3.getMajor());
	
		//★★★매개변수가 있는 생성자
		Student student4 = new Student(50,"Jin","BIO");
		System.out.println("num"+student4.getNum()+"\t"+ "Name:"+student4.getName()+"\t"+"\t"+"Major:"+student4.getMajor());
	
		//student 클래스의 인스턴스 배열을 만들어보자
		//student 인스턴스의 참조를 저장 할 수 있는 공간 2개 생성
		Student [] ar = new Student[2];
		
		//공간에 인스턴스를 생성해서 대입
		ar[0] = new Student();
		ar[1] = new Student();
		
		for (Student imsi : ar)
		{
			System.out.println(imsi);
		}
	
		// 하나의 인스턴스를 생성하고 내부 데이터를 설정하는 거
		Student origin = new Student();
		origin.setMajor("ENG");
		origin.setName("Jin");
		origin.setNum(5);
		
		/* 참조형 사이의 대입
	 	origin이 가리키고 있는 인스턴스를 weak도 가리킴
		Student weak = origin;
		weak.setNum(6);  << 이런 코드를 박아버리는 순간 origin의 Num값까지 다 바뀌어버려. callbyreference!
		*/
		}
	}
		
