package sdbms;

import java.util.Comparator;

public class SortStudentsById implements Comparator<Student> {
	@Override
	public int compare(Student x, Student y) {
		return x.getId() - y.getId();
	}
}