package studentcourse ;

public class Course{
	// 設定單一課程,不同課程皆可通用
	String courseName ;
	int courseID ;
	String[]students = new String[50] ; //上限50人
	int numberOfStudents = 0 ;
	
	// 構造方法 創建課程
	Course(String courseName, int courseID){
		this.courseName = courseName ;
		this.courseID = courseID ;
	}
	
	// 加入學生 **Course 本類使用之主程式不須return
	void addStudents(String studentsID){
		students[numberOfStudents] = studentsID ;
		numberOfStudents ++ ;
	}
	
	
	//訪問器,用來查詢
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
