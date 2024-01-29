package ex13_8_clone_2_1_shallow;

public class Circle implements Cloneable {

	Point p;
	double r;
	
	public Circle (Point p, double r) {
		this.p = p;
		this.r = r;
	}
	// 얕은 복사 - 객체에 저장된 값을 그대로 복제
	// 객체가 참조하고 있는 객체까지 복사하지는 않음
	
	public Circle clone() {
		try {
			return (Circle) super.clone(); // 조상의 clone 호출
		} catch (CloneNotSupportedException e){
			System.out.println("복제 오류 발생!");
			return null;
		}
	}
	
	public String toString() {
		return "[p=" + p + ", r="+r+"]";
	}
}
