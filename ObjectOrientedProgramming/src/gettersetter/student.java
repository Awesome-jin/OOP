package gettersetter;

public class student {
	//인스턴스 변수들 선언
	private int num;
	private String name;
	private String major;
	// boolean은 못만드나?? 
	private boolean visa = false;
	
	
	public boolean isVisa() {
		return visa;
	}
	public void setVisa(boolean visa) {
		this.visa = visa;
	}
	// source 메뉴> getter and setter로 자동 생성!. this가 있으니 무엇이 return되는 건지 잘 생각해보자
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num; // this가 붙으면 메소드 내부에서 찾지 않고 메소드 외부에서 num을 먼저 찾음
	}//this.num은 위에 private int num이고 // 그냥 num은 매개변수 num이다
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	private String nationality;
}
