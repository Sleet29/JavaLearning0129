package ex15_1_ArrayList;
import java.util.ArrayList;

public class ArrayTest3_contains_and_remove {
	public static void main(String args[]) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("봄");
		list1.add("여름");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("봄");
		list2.add("봄");
		list2.add("여름");
		list2.add("가을");
		list2.add("겨울");
		
		// list2 - list1 : 차집합
		//list2.removeAll(list1); // list2에서 list1과 같은 데이터를 제거
		
		
		// list2 에서 list1과 공통되는 요소들을 찾아 삭제
		for (int i=0;i<list2.size();i++) {
			// list1에 list2.get(i)가 포함되어 있는지 확인
			if(list1.contains(list2.get(i))) {
				//list2.remove(i);
				list2.remove(i--);
				System.out.println(list2);
			}
		}
    		
		System.out.println(list1); //[봄, 여름]
		System.out.println(list2); //[가을, 겨울]
	}
}

/*

for (int i = 0; i < resultList.size(); i++) {
    for (int j = i+1; j < resultList.size(); j++) {
        if (resultList.get(j).equals(resultList.get(i))) {
            resultList.remove(i);
        }
    }
}
*/