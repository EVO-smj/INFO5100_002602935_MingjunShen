import java.util.Random;

public class FullTimeStudent extends Student {
    private double examScore1;
    private double examScore2;

    public FullTimeStudent(String name, int id, double examScore1, double examScore2) {
        super(name, id);
        this.examScore1 = examScore1;
        this.examScore2 = examScore2;
        generateRandomQuizScores();
    }

    private void generateRandomQuizScores() {
        Random random = new Random();
        for (int i = 0; i < quizScores.length; i++) {
            double score = random.nextDouble() * 10;
            quizScores[i] = Double.parseDouble(String.format("%.1f", score));
        }
    }

    @Override
    public void printDetails() {
        System.out.println("Full-Time Student: " + name + " (ID: " + id + ")");
    }

    public void printExamScores() {
        System.out.println("Exam 1 Score: " + examScore1);
        System.out.println("Exam 2 Score: " + examScore2);
    }
}
