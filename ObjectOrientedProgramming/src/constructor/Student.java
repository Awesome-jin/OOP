package constructor;

public class Student {

	private String name;
	private int num;
	private String major;
	
	//Student 클래스의 생성자
	// 생성자는 리턴 타입 없이 클래스 이름 그대로 사용한다!
	// 매개변수가 없는 생성자를 Default constructor라고 부름
	public Student() { //무조건 값이 고정 되어있을 때 유용하다. (예를 들어 슈팅게임의 모든 비행기 총알은 500개다)
		name = "Chris"; 
		num = 1;
		major = "Computer Science";
	}

	//매개변수가 여러개인 생성자
	public Student(int num, String name, String major)
	{
		this.num = num;
		this.name=name;
		this.major=major;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}//코딩 끝
