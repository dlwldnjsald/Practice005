//java.util.Scanner 클래스를 이용하여
//친구정보를 입력받아 Friend 객체를 생성하고
//이들을 Friend 객체 배열에 저장하세요.
//친구 즉, 친구(Friend)객체를 3개 입력 받으면 
//이들을 모두 화면에 출력하세요.

package com.javaex.ex07;  
public class Friend {

	private String name;
	private String hp;
	private String school;

	// getter/setter 작성

    public String getName() {

    	return name;

    }

    public void setName(String name) {		//외부로부터 name변수에 받아들인 데이터를 하위 블록에 집어넣을것. 

    	this.name = name;      //name변수에 할당된 외부데이터를 다시 this.name에 할당해준다

    }

   //------------------------------------

    public String getHp() {

    	return hp;

    }

    public void setHp(String hp) {

    	this.hp = hp;

    }

    //----------------------------------

    public String getSchool() {

    	return school;

    }

    public void setSchool(String school) {

    	this.school = school;

    }

    //----------------------------------------
    
    public void showInfo(){

        System.out.println("이름:" + name + "  핸드폰:" + hp + " 학교:" + school);

    }



}