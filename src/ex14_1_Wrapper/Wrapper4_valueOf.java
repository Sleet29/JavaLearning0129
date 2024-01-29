package ex14_1_Wrapper;

public class Wrapper4_valueOf {
	public static void main(String args[]) {
	
	// The constructor Integer(int) is deprecated since version 9
	// 박싱 - 기본형 타입의 값을 객체로 변환
	// int -> Integer
	Integer obj1 = Integer.valueOf(10); // Integer 객체를 생성합니다.
	Integer obj2 = Integer.valueOf(10); 
	

	// 똑같은 기본값을 가지고 valueOf 메소드를 여러 번 호출하면 같은 객체에 대한 참조값이 리턴됩니다.
	if (obj1==obj2)
		System.out.println("obj1==obj2");
	else 
		System.out.println("obj1!=obj2");
	
	if (obj1.equals(obj2))
		System.out.println("obj1.equals(obj2) 같아요");
	else 
		System.out.println("obj1.equals(obj2) 달라요");
	
	} 
}