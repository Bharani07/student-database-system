package sdbms;

public class Student {

	private int id;
	private String name;
	private Double marks;
	private String subject;
	
	Student(int id, String name, double marks, String subject) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Id:"+id+" Name:"+name+" Subject:"+subject+" Marks:"+marks;
	}
	
}
