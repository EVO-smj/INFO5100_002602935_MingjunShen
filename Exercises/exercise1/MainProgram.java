import java.util.Random;

public class MainProgram {
    public static void main(String[] args) {
        Session session = new Session();
        Random random = new Random();
        for (int i=0; i < 10; i++ ) {
            session.addStudent(new PartTimeStudent("PTStudent_" + i, 10000 + i));
            double score1 = random.nextDouble() * 50 + 50;
            double score2 = random.nextDouble() * 50 + 50;
            session.addStudent(new FullTimeStudent("FTStudent_" + i, 20000 + i, Double.parseDouble(String.format("%.1f", score1)), Double.parseDouble(String.format("%.1f", score2))));
        }

        session.printAverageQuizScores();
        session.printQuizScoresAscending();
        session.printPartTimeStudents();
        session.printFullTimeStudentsExamScores();
    }
}
