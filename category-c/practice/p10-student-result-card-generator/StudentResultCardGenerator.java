public class StudentResultCardGenerator {
    static class Student {
        private String name;
        private int[] marks;

        public Student(String name, int[] marks) {
            this.name = name;
            this.marks = marks;
        }

        public double getAverage() {
            int sum = 0;
            for (int m : marks) {
                sum += m;
            }
            return (double) sum / marks.length;
        }

        public String getGrade() {
            double average = getAverage();
            if (average >= 90) {
                return "A";
            } else if (average >= 75) {
                return "B";
            } else if (average >= 60) {
                return "C";
            } else if (average >= 40) {
                return "D";
            } else {
                return "F";
            }
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("Asha", new int[]{80, 90, 70});
        students[1] = new Student("Ravi", new int[]{60, 55, 50});
        for (Student s : students) {
            System.out.printf("%s: Average %.1f, Grade %s%n", s.getName().toUpperCase(), s.getAverage(), s.getGrade());
        }
    }
}
