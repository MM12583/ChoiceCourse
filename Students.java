package studentcourse;

import java.util.Scanner;

public class Students{
    // �Ыرb��
	String ID = ID() ;
	String passWord = passWord() ;
	String[]choicedCourse = new String[20] ;
	int courseNum = 0 ;
	
	// �@��input
		String input(){
			Scanner input = new Scanner(System.in) ;
			return input.nextLine() ;
		}
	
	String ID(){
		
		System.out.print("�п�JID : ") ;
		ID = input() ;
		return ID ;
	}
	
	String passWord(){
		
		System.out.print("�п�Jpassword : ") ;
		passWord = input() ;
		return passWord ;
	}
	
	// ��Ҥ�k
	void getCourse(int[]courseID){
		
		System.out.print("�п�J����ҵ{ID : ") ;
		int choiceID = Integer.parseInt(input()) ; // ��Ʀr
		boolean choiceScuess = false ;
		
		for(int i : courseID){
			if(i == choiceID){
				choiceScuess = true ;
				break ;
			}
		}
		
		if(choiceScuess){
			choicedCourse[courseNum] = choiceID +" " ; // ��String
			courseNum ++ ;
		}else{
			System.out.println("��JID���~");
		}
		
	}
	
	// �X�ݾ�
	String getID(){
		return ID ;
	}
	
	String getPassWord(){
		return passWord ;
	}
	
	String[]getChoicedCourse(){
		return choicedCourse ;
	}
	
	int getCourseNum(){
		return courseNum ;
	}
}
