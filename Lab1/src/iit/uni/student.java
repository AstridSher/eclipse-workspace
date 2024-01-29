package iit.uni;

public class student {
private int student_id;
private String student_name;
private int age;
private boolean status;
public student() {
	
}

public student(int student_id, String student_name, int age, boolean status) {
	super();
	this.student_id = student_id;
	this.student_name = student_name;
	this.age = age;
	this.status = status;
}
public int getStudent_id() {
	return student_id;
}
public void setStudent_id(int student_id) {
	this.student_id = student_id;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}


}
