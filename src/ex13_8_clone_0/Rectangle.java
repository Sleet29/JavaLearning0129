// 복제 가능 클래스로 만들기
// 1단계 - Cloneable 인터페이스 구현
// 2단계 - clone()메소드 오버라이드하기


package ex13_8_clone_0;

// Cloneable 인터페이스가 구현되어 있다는 것은 클래스 작성자가 복제를 허용한다는 의미
public class Rectangle {
	int width, height;
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
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
