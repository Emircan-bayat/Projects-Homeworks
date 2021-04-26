package kodlama.io;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı(JAVA+REACT)", "Engin Demiroğ", 0.0);
		Course course2 = new Course("Programlamaya Giriş İçin Temel Kurs", "Engin Demiroğ", 0.0);
		Course course3 = new Course("Yazılım Geliştirici Yetiştirme Kampı(C#+ANGULAR)", "Engin Demiroğ", 27.9);

		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {
			System.out.println(course.courseName);
			System.out.println(course.courseInstructor);
			System.out.println(course.coursePrice);
		}

		Student student1 = new Student("Emir", 20, 1001);
		Student student2 = new Student("Can", 18, 1002);
		Student student3 = new Student("Ahmet", 25, 1003);

		Student[] students = { student1, student2, student3 };
		for (Student student : students) {
			System.out.println(student.studentName);
			System.out.println(student.studentAge);
			System.out.println(student.studentId);
		}

		CourseManager courseManager = new CourseManager();

		courseManager.addToMyCourses(course1);
		courseManager.addToMyCourses(course2);
		courseManager.addToMyCourses(course3);
		courseManager.removeCourse(course1);
		courseManager.removeCourse(course2);
		courseManager.removeCourse(course3);

	}

}
