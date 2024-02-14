import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Session {
    private List<Student> students;

    public Session() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printAverageQuizScores() {
        for (Student student : students) {
            System.out.println("Average Quiz Score for " + student.name + ": " + student.calculateAverageQuizScore());
        }
    }

    public void printQuizScoresAscending() {
        for (Student student : students) {
            System.out.println("Quiz scores for " + student.name + ": " + Arrays.toString(student.quizScores));
        }
    }

    public void printPartTimeStudents() {
        System.out.println("List of Part-Time Students:");
        for (Student student : students) {
            if (student instanceof PartTimeStudent) {
                student.printDetails();
            }
        }
    }

    public void printFullTimeStudentsExamScores() {
        System.out.println("List of Full-Time Students' Exam Scores:");
        for (Student student : students) {
            if (student instanceof FullTimeStudent) {
                student.printDetails();
                ((FullTimeStudent) student).printExamScores();
            }
        }
    }
}
