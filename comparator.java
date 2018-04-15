import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{
	String name;
	int age;
	
	public Student(String name,int age)
	{
		this.name = name;
		this.age=age;
	}
}

class nameComparator implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		return s1.name.compareTo(s2.name);
	}
}

class ageComparator implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		return s1.age-s2.age;
	}
}	

class allComparator implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		int i = s1.name.compareTo(s2.name);
		if(i!=0) 
			return i;
		return s1.age-s2.age;
	}
}	

public class comparator
{
	public static void main(String[] args)
	{
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Brijes",44));
		students.add(new Student("Ratna",42));
		
		for(Student s: students)
			System.out.println("Name:"+s.name+" Age:"+s.age);
		
		Collections.sort(students,new nameComparator());
		for(Student s: students)
			System.out.println("Name:"+s.name+" Age:"+s.age);

		Collections.sort(students,new ageComparator());
		for(Student s: students)
			System.out.println("Name:"+s.name+" Age:"+s.age);

	}
}