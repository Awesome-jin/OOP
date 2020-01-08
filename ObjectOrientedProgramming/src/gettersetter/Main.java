package gettersetter;

public class Main {

	public static void main(String[] args) {
		// student 클래스 인스턴스 만들기
		student st = new student();
		
		//인스턴스 변수에 값을 설정
		st.setNum(1);
		st.setName("Seongjin Jang");
		st.setMajor("PSY");
		st.setNationality("Korea.S");
		//st.setVisa(true);
		
		//인스턴스 변수의 값 가져오기
		System.out.println("Student Number: " + st.getNum());
		System.out.println("Name: " + st.getName());
		System.out.println("Major: " + st.getMajor());	
		System.out.println("Nationality: " + st.getNationality());	
		//System.out.println("Nationality: " + st.Visa());		
	}

}
