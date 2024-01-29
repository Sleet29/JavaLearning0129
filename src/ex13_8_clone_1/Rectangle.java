// 복제 가능 클래스로 만들기
// 1단계 - Cloneable 인터페이스 구현
// 2단계 - clone()메소드 오버라이드하기


package ex13_8_clone_1;

// Cloneable 인터페이스가 구현되어 있다는 것은 클래스 작성자가 복제를 허용한다는 의미
public class Rectangle implements Cloneable{
	int width, height;
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}


	/* 공변 반환 타입 (covariant return type) JDK 1.5부터 적용
	 * 오버라이딩 할 때 조상 메서드의 반환타입을 자손 클래스의 타입으로 변경을 허용하는 것입니다.
	 * 즉, 반환형을 Object에서 자손 클래스 타입
	 */
	
	public Object clone() { // 반환형이 Object형 입니다.
		try {
			// 슈퍼 클래스의 clone 메서드를 호출해서 그 결과를 리턴
			return super.clone();
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
