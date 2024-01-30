package test;

import java.util.ArrayList;

public class Student2 { 
	private String name;
	private int kor, eng, math;
	public static int korTotal;
	public static int engTotal;
	public static int mathTotal;
	public Student2(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		korTotal += kor;
		engTotal += eng;
		mathTotal += math;
	}
     int getTotal() {
    	 return kor + eng + math; 
     }
     
     float getAverage() {
 		return Math.round(getTotal()/3.0*10)/10.0f;
 	}
     
    public String toString() {
    	return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" 
           + getTotal() + "\t" + getAverage() ;
    }
    
 // 학생별 총점을 기준으로 정렬하기
 	static void sort(ArrayList<Student2> as) {
 		int size=as.size();
 		for (int i = 0; i < size-1; i++) {
 			for (int j = i + 1; j < size; j++) {
 				if (as.get(i).getTotal() < as.get(j).getTotal()) {
 					Student2 imsi = as.get(i);
 					as.set(i,as.get(j));
 					as.set(j,imsi);
 				}
 			}
 		}
 	 }
}






