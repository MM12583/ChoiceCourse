package studentcourse;

import java.util.Arrays;

public class MainFunction
{
 
	public static void main(String[] args){
		// �Ыؽҵ{
		Course math = new Course("�ƾ�" , 7788) ;
		int[]courseID = {math.courseID} ;
		
		// �Ыؾǥ�
		Students A = new Students() ;
		
		// ���
		A.getCourse(courseID) ;
		
		System.out.println(A.ID);
		System.out.println(A.passWord);
		System.out.println(A.courseNum);
		System.out.println(Arrays.toString(A.choicedCourse));
		

	}

}
