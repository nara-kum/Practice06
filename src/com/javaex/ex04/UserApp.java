package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		//배열생성
		User[] cArray = new User[3];
		
		//섞어
		User uj = new Customer("jws","j1234","정우성",1000);
		User uy = new Customer("yjs","y2345","이효리",2000);
		User um = new Employee("master","m7788","운영자",500);
		
		//배열에 담기
		cArray[0] = uj;
		cArray[1] = uy;
		cArray[2] = um;
		
		//반복문으로 출력
		for(int i=0; i<cArray.length; i++) {
			cArray[i].showInfo();
		}
		//다운캐스팅으로 출력
		((Employee)um).salary();

	}

}
