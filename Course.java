package studentcourse ;

public class Course{
	// �]�w��@�ҵ{,���P�ҵ{�ҥi�q��
	String courseName ;
	int courseID ;
	String[]students = new String[50] ; //�W��50�H
	int numberOfStudents = 0 ;
	
	// �c�y��k �Ыؽҵ{
	Course(String courseName, int courseID){
		this.courseName = courseName ;
		this.courseID = courseID ;
	}
	
	// �[�J�ǥ� **Course �����ϥΤ��D�{������return
	void addStudents(String studentsID){
		students[numberOfStudents] = studentsID ;
		numberOfStudents ++ ;
	}
	
	
	//�X�ݾ�,�ΨӬd��
	String getCourseName(){
		return courseName ;
	}
	
	String[]getStudents(){
		return students ;
	}
	
	int getStudeuntsNumber(){
		return numberOfStudents ;
	}
}
