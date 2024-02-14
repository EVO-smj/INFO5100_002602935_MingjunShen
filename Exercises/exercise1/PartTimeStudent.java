import java.util.Random;

public class PartTimeStudent extends Student {
    public PartTimeStudent(String name, int id) {
        super(name, id);
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
        System.out.println("Part-Time Student: " + name + " (ID: " + id + ")");
    }
}
