package sdbms;

import java.util.Comparator;

public class SortStudentsByMarks implements Comparator<Student> {
	@Override
	public int compare(Student x, Student y) {
		return x.getMarks().compareTo(y.getMarks());
	}
}