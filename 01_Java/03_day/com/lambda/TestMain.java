package com.lambda;

public class TestMain {

	public static void main(String[] args) {

		// 익명 클래스
		Flyer f = new Flyer() {
			@Override
			public void fly() {
				System.out.println("fly");
			}
		}; //end
		f.fly();
		// 람다 표현식
		Flyer f2 = ()->{System.out.println("람다 표현식 fly");};
		f2.fly();
		
	}

}
