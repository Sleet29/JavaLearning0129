// 복제 가능 클래스로 만들기
// 1단계 - Cloneable 인터페이스 구현
// 2단계 - clone()메소드 오버라이드하기


package ex13_8_clone_2;


// Cloneable 인터페이스가 구현되어 있다는 것은 클래스 작성자가 복제를 허용한다는 의미
public class Rectangle implements Cloneable{
	int width, height;
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/*
	 * Object 클래스에 정의된 clone()
	 * protected Object clone() throws CloneNotSupportedException;
	 *  ==> 오버라이딩 시 접근 제어자 변경
	 *  (protected => public : 상속관계 없이 다른 클래스에서 호출 할 수 있습니다.)
	 */
	
	public Rectangle clone() { // 변경된 곳 : Object형 >> Rectangle 형으로 변경
		try {
			// 슈퍼 클래스의 clone 메서드를 호출해서 그 결과를 리턴
			return (Rectangle) super.clone(); // 변경된 곳 : Rectangle형으로 변환
		}
		// 슈퍼 클래스의 clone 메서드가 발생하는 익셉션을 처리
		catch (CloneNotSupportedException e){
			return null;
		}
	}
	
	public String toString() {
		String result = "가로는 " + width + ", 세로는 "+ height;
		return result;
	}
	
	public boolean equals(Object obj) {
		
		
		if(obj instanceof Rectangle && obj != null) {
			Rectangle rec = (Rectangle) obj;
			return this.width == rec.width && this.height == rec.height;
		} else {
			return false;
		}
		
	}
}
