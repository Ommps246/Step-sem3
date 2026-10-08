abstract class Question {
    protected String questionText;
    protected String correctAnswer;
    protected String studentAnswer;
    protected double points;

    public Question(String questionText, String correctAnswer, String studentAnswer, double points) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.studentAnswer = studentAnswer;
        this.points = points;
    }

    public abstract double getScore();

    public abstract String getType();
}

class McqQuestion extends Question {
    public McqQuestion(String questionText, String correctAnswer, String studentAnswer, double points) {
        super(questionText, correctAnswer, studentAnswer, points);
    }

    public double getScore() {
        return studentAnswer.equals(correctAnswer) ? points : 0;
    }

    public String getType() {
        return "MCQ";
    }
}

class TfQuestion extends Question {
    public TfQuestion(String questionText, String correctAnswer, String studentAnswer, double points) {
        super(questionText, correctAnswer, studentAnswer, points);
    }

    public double getScore() {
        return studentAnswer.equals(correctAnswer) ? points : 0;
    }

    public String getType() {
        return "TF";
    }
}

class EssayQuestion extends Question {
    public EssayQuestion(String questionText, String correctAnswer, String studentAnswer, double points) {
        super(questionText, correctAnswer, studentAnswer, points);
    }

    public double getScore() {
        String[] keywords = correctAnswer.split(",");
        int matches = 0;
        String lowerAnswer = studentAnswer.toLowerCase();
        for (String keyword : keywords) {
            if (lowerAnswer.contains(keyword.trim().toLowerCase())) {
                matches++;
            }
        }
        if (matches >= 2) {
            return points * 0.75;
        } else if (matches == 1) {
            return points * 0.50;
        } else {
            return 0;
        }
    }

    public String getType() {
        return "ESSAY";
    }
}

public class ExaminationQuestionGrader {
    public static void main(String[] args) {
        Question[] questions = new Question[4];
        questions[0] = new McqQuestion("What is the capital of France?", "Paris", "Paris", 10);
        questions[1] = new TfQuestion("The Earth is flat?", "False", "True", 5);
        questions[2] = new EssayQuestion("Name two primary OOP principles.", "Inheritance, Polymorphism, Encapsulation", "Polymorphism is one.", 20);
        questions[3] = new EssayQuestion("Describe abstraction and composition.", "Abstraction, Composition", "I talked about abstraction.", 15);
        double total = 0;
        for (Question q : questions) {
            double score = q.getScore();
            System.out.printf("%s: %.2f%n", q.getType(), score);
            total += score;
        }
        System.out.printf("Total Score: %.2f%n", total);
    }
}
