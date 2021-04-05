package sdbms;

import java.util.Comparator;

public class SortStudentsBySubject implements Comparator<Student> {
	@Override
	public int compare(Student x, Student y) {
		return x.getSubject().compareTo(y.getSubject());
	}
}