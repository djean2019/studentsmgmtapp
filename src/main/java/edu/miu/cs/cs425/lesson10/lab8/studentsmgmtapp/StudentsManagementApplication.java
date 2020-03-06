package edu.miu.cs.cs425.lesson10.lab8.studentsmgmtapp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import edu.miu.cs.cs425.lesson10.lab8.studentsmgmtapp.model.Classroom;
import edu.miu.cs.cs425.lesson10.lab8.studentsmgmtapp.model.Student;
import edu.miu.cs.cs425.lesson10.lab8.studentsmgmtapp.model.Transcript;
import edu.miu.cs.cs425.lesson10.lab8.studentsmgmtapp.repository.IStudentRepository;

@SpringBootApplication
public class StudentsManagementApplication implements CommandLineRunner{
	@Autowired
	private IStudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentsManagementApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Welcome to StudentsMgmtApp version 1.0");

		Transcript t1=new Transcript("BS Computer Science");
		Student s1 = new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019,5,24),t1);
//		Classroom c=new Classroom("McLaughlin building", "M105");
//		Transcript t2=new Transcript("BS Computer Science");
//		Student s2 = new Student("000-61-0002", "Joe", "Jin", "Biden", 3.45, LocalDate.of(2019,5,24),c);

		
		
//		s1.setClassroom(c);
//		s2.setClassroom(c);
		saveStudent(s1);
//		saveStudent(s2);
		
//		List<Student> list = new ArrayList<>();
//		list.add(s1);
//		list.add(s2);
//		c.setStudent(list);
//		saveClassroom(c);
	
	}

	private void saveStudent(Student s) {
		studentRepository.save(s);
	}
//	private void saveClassroom(Classroom c) {
//		studentRepository.save(c);
//	}
	
//	private Iterable<Student> getListOfStudents() {
//		return studentRepository.findAll();
//	}

}
