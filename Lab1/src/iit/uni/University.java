package iit.uni;
//import iit.uni.*; 

public class University {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//student student1 = new student(); // [class ref_object] stack = new[heap] student()
		//student1.setAge(13);
		//System.out.println(student1.getAge());
		student s = new student(12,"xoxo",10, true);
		System.out.println(s.getStudent_id());
		System.out.println(s.getStudent_name());
		System.out.println(s.getAge());
		System.out.println(s.isStatus());
		Teacher tech1 = new Teacher();
		tech1.setTeacher_name("kiko");
		System.out.println(tech1.getTeacher_name());
	}

}
