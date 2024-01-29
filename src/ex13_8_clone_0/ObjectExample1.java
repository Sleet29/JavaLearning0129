// clone() 메서드는 객체를 복제하는 기능을 한다.
// 즉, 똑같은 값을 갖는 객체를 하나 더 생성
// 복제 가능한 클래스에 대해서만 호출 가능
// 복제 가능 여부는 Cloneable 구현 여부.


// Cloneable 인터페이스를 구현한 GregorianCalendar 클래스에 대해서
// clone() 메서드를 호출하는 예제
package ex13_8_clone_0;

import java.util.GregorianCalendar;

public class ObjectExample1 {
	public static void main(String args[]) {
		// 객체 생성
		GregorianCalendar obj1 = new GregorianCalendar(2024,0,29);
		
		// clone메서드로 객체를 복제		
		Object temp = obj1.clone();
		GregorianCalendar obj2 = (GregorianCalendar)temp;
		// 위 두 문장을 한 문장으로 표현하면 다음과 같다.
		// GregorianCalendar obj2 = (GregorianCalendar) obj1.clone();
		
		//%tF : 포맷 명세자는 날짜를 yyyy-MM-dd 형식으로 포맷하는 역할을 한다.
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
		
		obj1.set(2024,6,1);
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
	}
}