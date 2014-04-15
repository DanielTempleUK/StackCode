package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{

	private String name;
	private String age;
	private String classStudy;

	public Student(final String name, final String age, final String classStudy) {
		this.name = name;
		this.age = age;
		this.classStudy = classStudy;
	}

	public int compareTo(final Student o) {
		if( compare(this.name, o.getName()) == 0 ) {
			if( compare(this.name, o.getName()) == 0) {
				return compare(this.classStudy, o.getClassStudy());
			}
			return compare(this.age, o.getAge());
		}
		return compare(this.name, o.getName());
	}

	private int compare(final String s1, final String s2) {
		if(s1 == null && s2 == null) {
			return 0;
		}
		if(s1 == null) {
			return -1;
		}
		if( s2 == null ) {
			return 1;
		}
		return s1.compareTo(s2);
	}

	public static void main(final String []args) {
		final List<Student> lists = new ArrayList<Student>();
		lists.add(new Student("Tung", "24", "Java"));
		lists.add(new Student("Hong", "26", "Uava"));
		lists.add(new Student("yoiy", "42", "jrva"));
		lists.add(new Student("Tung", "22", "Aava"));
		lists.add(new Student("Tung", null, "Aava"));
		lists.add(new Student("Tyn", "22", "Aava"));
		lists.add(new Student("Tungh", "22", "Aava"));
		lists.add(new Student("aung", "39", "ora"));
		lists.add(new Student(null, null, "Aava"));
		lists.add(new Student("Rung", "17", "Kva"));
		lists.add(new Student(null, null, null));

		Collections.sort(lists);

		for(final Student listTemp : lists){
			System.out.println("Name : " + listTemp.getName() + ", Age : " + listTemp.getAge()
					+ ", Class : "+ listTemp.getClassStudy());
		}
	}

	public String getClassStudy() {
		return this.classStudy;
	}

	public String getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}
}