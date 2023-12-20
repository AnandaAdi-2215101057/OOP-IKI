package id.ac.undiksha.ais;
//import id.ac.undiksha.ais.people.student;
import id.ac.undiksha.ais.people.*;
//import id.ac.undiksha.ais.people.lecture;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student student1 = new student();
		
		student1.setStudentId ("00175113");
		student1.setName("Alzzaera Kana");
		student1.setBirthDate("13 September 2002");
		student1.setGender(true);
		student1.setSmtr(3);
		student1.setAddress("Utopia");
		student1.printAll();
		
		System.out.println(" ");
		lecture lecture1 = new lecture();
		lecture1.setLectureId ("00023113");
		lecture1.setName("Sera Lykaios");
		lecture1.setBirthDate("13 June 2000");
		lecture1.setGender(true);
		lecture1.setAddress("Dystopia");
		lecture1.setFaculty("FTK");
		lecture1.setDepartment("TI");
		lecture1.setStudyProgram("CS");
		lecture1.printAll();

		student student3 = new student(
				"Sky Sara",
				"15 February 2002",
				true,
				"Utopia",
				"00021113",
				3
				);
		System.out.println(" ");
		student3.printAll();
		
		System.out.println(" ");
		lecture lec1 = new lecture(
				"Eliana Aiden",
				"10 November 2000",
				true,
				"Dystopia",
				"00108113",
				"FTK",
				"TI",
				"CS"
				);
		
		lec1.printAll();
		//student student4 = new Human();
		Human human1 = new student();
		human1.setName(null);
		human1.printAll();
		//Human human2 = new Human();
		student3.prodi.setStudyProgramId(null);
		student3.prodi.setDepartmentName(null);
		student3.prodi.getFacultyCode();
		}

}
