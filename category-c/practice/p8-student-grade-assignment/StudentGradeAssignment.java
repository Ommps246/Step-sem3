public class StudentGradeAssignment {
    public static void main(String[] args) {
        int[] marksList = {72, 95, 35};
        for (int marks : marksList) {
            String grade;
            if (marks >= 90) {
                grade = "A";
            } else if (marks >= 75) {
                grade = "B";
            } else if (marks >= 60) {
                grade = "C";
            } else if (marks >= 40) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("Grade " + grade);
        }
    }
}
