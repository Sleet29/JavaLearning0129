package ex13_8_clone_1;

public class ObjectExample2 {
	public static void main(String args[]) {
		// 객체 생성
		Rectangle rec1 = new Rectangle(10,20);
		
		// The method clone() from the type Object is not visible
		// clone 메서드로 객체를 복제
		Rectangle rec2 = (Rectangle) rec1.clone();
		
		// 원본 객체와 복제 객체의 값을 출력
		System.out.println("obj1 ["+ rec1 + "]");
		System.out.println("obj1 ["+ rec2 + "]");
		
		rec1.height = 300; rec1.width = 50;
		System.out.println("obj1 ["+ rec1 + "]");
		System.out.println("obj1 ["+ rec2 + "]");
		
	}

}
