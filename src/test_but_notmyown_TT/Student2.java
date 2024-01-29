package test_but_notmyown_TT;

import java.util.ArrayList;

public class Student2 {
    private String name;
    private int koreanScore;
    private int englishScore;
    private int mathScore;
    public static int korTotal = 0;
    public static int engTotal = 0;
    public static int mathTotal = 0;

    public Student2(String name, int koreanScore, int englishScore, int mathScore) {
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
        
        // 과목별 총점 업데이트
        korTotal += koreanScore;
        engTotal += englishScore;
        mathTotal += mathScore;
    }

    // 학생 정보 출력 메서드
    public String toString() {
        int total = koreanScore + englishScore + mathScore;
        double average = total / 3.0;
        return name + "\t" + koreanScore + "\t" + englishScore + "\t" + mathScore + "\t" + total + "\t" + String.format("%.1f", average);
    }

    // 학생들을 총점에 따라 정렬하는 메서드
    public static void sort(ArrayList<Student2> students) {
        students.sort((s1, s2) -> {
            int total1 = s1.koreanScore + s1.englishScore + s1.mathScore;
            int total2 = s2.koreanScore + s2.englishScore + s2.mathScore;
            return Integer.compare(total2, total1); // 총점 역순으로 정렬
        });
    }
}
