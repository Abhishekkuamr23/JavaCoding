package javacoding.SetCollection;

import java.util.Objects;

public class Student implements Comparable<Student> {
	int rollNo;
	String name;
	
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
	@Override //from object class
	public String toString() {
		return "Student{" + "name =  '" + name + '\'' + ", rollNo=" + rollNo + '}';
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		Student stu = (Student)o;
		return rollNo == stu.rollNo;
	}
	
	
	public int hashCode() {
		return Objects.hash(rollNo);
	}

	@Override
	public int compareTo(Student o) {
		return this.rollNo - o.rollNo;
	}
}
