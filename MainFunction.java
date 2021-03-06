package studentcourse;

import java.util.Arrays;

public class MainFunction
{
 
	public static void main(String[] args){
		// 創建課程
		Course math = new Course("數學" , 7788) ;
		int[]courseID = {math.courseID} ;
		
		// 創建學生
		Students A = new Students() ;
		
		// 選課
		A.getCourse(courseID) ;
		
		System.out.println(A.ID);
		System.out.println(A.passWord);
		System.out.println(A.courseNum);
		System.out.println(Arrays.toString(A.choicedCourse));
		

	}

}
