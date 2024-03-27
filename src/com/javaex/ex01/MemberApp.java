package com.javaex.ex01;

import java.util.Scanner;// java.util.Scanner라는 클래스 이용위해 호출 

public class MemberApp {

	public static <member> void main(String[] args) {

		
		Member[] memberArray = new Member[3];    //member배열 3개 만들어주기 (length==3인)배열
		Scanner sc = new Scanner(System.in);	//스캐너 열기
		
		//for문 반복문 사용하기
		for (int i = 0; i < 3; i++) {  //for(초기화,조건연산,증감)
			
			//---------------------------------------------
			String id = null;
			String name = null;
			int point = 0;					//변수 선언 ,초기화도 
			
			//---------------------------------------------
			
			System.out.print("회원정보: ");
         	name = sc.next();	//스캐너로부터 문자열을 전달받기

         	System.out.print("(");
         	name = sc.next();	//스캐너로부터 문자열을 전달받기
			
         	System.out.print("), ");
         	name = sc.next();	//스캐너로부터 문자열을 전달받기
         	
         	System.out.print("점");
         	name = sc.next();	//스캐너로부터 문자열을 전달받기
         	
         	//--------------------------------------------

         	Member newMember = new Member();   //주의) 메모리상에 member를 만들어주고
        	newMember.setId(id);
        	newMember.setName(name);
        	newMember.setPoint(point);   //만들어 두고 이제 연결시키기
			

        	//배열에 참조주소 할당해주기//------------------------

        	memberArray[i] = newMember;
        	System.out.println();
        	
       	}
		
			// 멤버정보 출력//---------------------------------
            for (int i = 0; i < memberArray.length; i++) {

            //친구정보 출력 메소드 호출
        	memberArray[i].showInfo();
        }

        
        sc.close();
	}

}


//

