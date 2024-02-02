package test;

import java.util.ArrayList;

public class Student {
	private String name;
	private int kor, eng, math;
	public static int korTotal;
	public static int engTotal;
	public static int mathTotal;
	public static void main(String args[]) {

		ArrayList<Student2> as = new ArrayList<Student2>();
		as.add(new Student2("강호동", 85, 60, 70));
		as.add(new Student2("이승기", 90, 95, 80));
		as.add(new Student2("유재석", 75, 80, 100));
		as.add(new Student2("하하", 80, 70, 95));
		as.add(new Student2("이광수", 100, 65, 80));
		
		Student2.sort(as);
		print(as);// 출력하기
	}


	static void print(ArrayList<Student2> as) {
		System.out.println("==============   학생별   /  과목별 총점구하기  ==============");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

		for (Student2 s : as) {
			System.out.println(s.toString());
		}

		for (int j = 0; j < 55; j++) {
			System.out.print("=");
		}

		System.out.print("\n총점\t");
		System.out.print(Student2.korTotal + "\t");
		System.out.print(Student2.mathTotal + "\t");
		System.out.print(Student2.engTotal + "\n");
	}
}
