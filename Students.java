package studentcourse;

import java.util.Scanner;

public class Students{
    // 創建帳戶
	String ID = ID() ;
	String passWord = passWord() ;
	String[]choicedCourse = new String[20] ;
	int courseNum = 0 ;
	
	// 共用input
		String input(){
			Scanner input = new Scanner(System.in) ;
			return input.nextLine() ;
		}
	
	String ID(){
		
		System.out.print("請輸入ID : ") ;
		ID = input() ;
		return ID ;
	}
	
	String passWord(){
		
		System.out.print("請輸入password : ") ;
		passWord = input() ;
		return passWord ;
	}
	
	// 選課方法
	void getCourse(int[]courseID){
		
		System.out.print("請輸入選取課程ID : ") ;
		int choiceID = Integer.parseInt(input()) ; // 轉數字
		boolean choiceScuess = false ;
		
		for(int i : courseID){
			if(i == choiceID){
				choiceScuess = true ;
				break ;
			}
		}
		
		if(choiceScuess){
			choicedCourse[courseNum] = choiceID +" " ; // 轉String
			courseNum ++ ;
		}else{
			System.out.println("輸入ID錯誤");
		}
		
	}
	
	// 訪問器
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
