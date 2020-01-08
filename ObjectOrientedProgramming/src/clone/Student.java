package clone;

import constructor.Student;
import constructor.student;

public class Student {
	
	private String name;
	private int num;
	private String major;
	
	//인스턴스를 복제해주는 메소드
	public String clone() {
	Student clone = new Student();
	clone.name = this.name;
	clone.num = this.num;
	
	//복제된 데이터를 갖는 객체를 리턴
	return other;
	}

}
