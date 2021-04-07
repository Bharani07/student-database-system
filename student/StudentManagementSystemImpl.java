package sdbms;

import java.util.Scanner;





public class StudentManagementSystemImpl implements StudentManagementSystem {

	Scanner scan = new Scanner(System.in);

	LinkedHashMap<Integer, Student> db = new LinkedHashMap<Integer, Student>();

	@Override
	public void addStudent() {
		// Logic for Adding Student

		System.out.println("Enter Id, Name, Marks, Subject");
		int id = scan.nextInt();
		String name = scan.next();
		double marks = scan.nextDouble();
		String subject = scan.next();

		Student std = new Student(id, name, marks, subject);

		db.put(std.getId(), std);

		System.out.println("STUDENT RECORD ADDED SUCCESSFULLY");
	}

	@Override
	public void removeStudent() {
		// Logic for Removing Student

		System.out.println("Enter Student Id:");
		int id = scan.nextInt();

		if(db.containsKey(id)) {
			System.out.println("Student Record Present");
			db.remove(id);
			System.out.println("Student Record Deleted Successfully");
		}
		else {
			System.out.println("Invalid Student Id");
		}

	}

	@Override
	public void removeAllStudents() {
		// Logic for RemovingAllStudents
		db.clear();
		System.out.println("All Records Deleted Successfully");
	}

	@Override
	public void updateStudent() {
		// Logic for Updating Student

		System.out.println("Enter Student Id:");
		int id = scan.nextInt();

		if(db.containsKey(id)) {
			System.out.println("Student Record Available");

			Student std = db.get(id);

			System.out.println("1:Update Name\n2:Update Marks\n3:Update Subject");
			System.out.println("Enter Choice:");
			int choice = scan.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter Name:");
				String name = scan.next();
				std.setName(name);
				break;

			case 2:
				System.out.println("Enter Marks:");
				double marks = scan.nextDouble();
				std.setMarks(marks);
				break;

			case 3:
				System.out.println("Enter Subject:");
				String subject = scan.next();
				std.setSubject(subject);
				break;
			}

			System.out.println("Student Record Updated");
		}
		else {
			System.out.println("Invalid Student Id");
		}
	}

	@Override
	public void displayStudent() {
		// Logic for displaying Student

		System.out.println("Enter Student Id:");
		int id = scan.nextInt();

		if(db.containsKey(id)) {
			System.out.println("Student Record Available");

			Student std = db.get(id);

			System.out.println("Name: "+std.getName());
			System.out.println("Subject: "+std.getSubject());
			System.out.println("Marks: "+std.getMarks());
		}
		else {
			System.out.println("Invalid Student Id");
		}

	}

	@Override
	public void displayAllStudent() {
		// Logic for displaying all Students

		Set<Integer> s = db.keySet();
		for(int id : s) {
			System.out.println(db.get(id));
		}

	}

	@Override
	public void sortStudent() {
		// Logic for Sorting All Students
		ArrayList<Student> l = new ArrayList<Student>();

		Set<Integer> s = db.keySet();
		for(int key : s) {
			l.add(db.get(key));
		}

		System.out.println("1:By ID\n2:By Name\n3:By Marks\n4:By Subject");
		System.out.println("Enter Choice:");
		int choice = scan.nextInt();

		switch(choice) {

		case 1:
			System.out.println("Sorting Based on Id:");
			Collections.sort(l, new SortStudentsById());
			for(Student std : l) {
				System.out.println(std);
			}
			break;

		case 2:
			System.out.println("Sorting Based on Name:");
			Collections.sort(l, new SortStudentsByName());
			for(Student std : l) {
				System.out.println(std);
			}
			break;

		case 3:
			System.out.println("Sorting Based on Marks:");
			Collections.sort(l, new SortStudentsByMarks());
			for(Student std : l) {
				System.out.println(std);
			}
			break;

		case 4:
			System.out.println("Sorting Based on Subject:");
			Collections.sort(l, new SortStudentsBySubject());
			for(Student std : l) {
				System.out.println(std);
			}
			break;

		default:
			System.out.println("Invalid Choice");
		}

	}

}

















