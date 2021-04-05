package sdbms;

import java.util.Comparator;

public class SortStudentsByName implements Comparator<Student> {
	@Override
	public int compare(Student x, Student y) {
		return x.getName().compareTo(y.getName());
	}
}