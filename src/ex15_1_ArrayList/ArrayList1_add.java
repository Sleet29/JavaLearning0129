package ex15_1_ArrayList;
import java.util.ArrayList;
class ArrayList1_add {
	public static void main(String args[]) {
	// 업캐스팅(상속해준 메소드만 가능합니다.)
	// List list = new ArrayList();
	// ArrayList<Object> list = new ArrayList<object>();
	ArrayList list = new ArrayList();
	// 자료 추가
	list.add("하나");
	list.add(2);		// list.add(Integer.valueOf(2));
	list.add(false);
	list.add(5.42);
	list.add("넷");
	list.add("five");
	list.add('A');
	
	}

}
