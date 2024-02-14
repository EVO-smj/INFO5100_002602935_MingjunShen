public abstract class Student {
    protected String name;
    protected int id;
    protected double[] quizScores;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.quizScores = new double[15];
    }

    public abstract void printDetails();

    public double calculateAverageQuizScore() {
        double sum = 0;
        for (double score : quizScores) {
            sum += score;
        }
        double average = sum / quizScores.length;
        return Double.parseDouble(String.format("%.2f", average));
    }
}
