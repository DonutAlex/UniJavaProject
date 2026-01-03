package uczelnia;

public class GradedHomework extends SolvedHomework {
    private double grade;
    private ExperiencedLecturer gradeAuthor;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public GradedHomework(String title, String description, Lecturer author, int maxPoints, String solution,
                          Student solutionAuthor, double grade, ExperiencedLecturer gradeAuthor){
        super(title, description, author, maxPoints, solution, solutionAuthor);
        this.grade = grade;
        this.gradeAuthor = gradeAuthor;
    }

    public GradedHomework(SolvedHomework solvedHomework, double grade, ExperiencedLecturer gradeAuthor){
        super(solvedHomework,
                solvedHomework.getSolution(),
                solvedHomework.getSolutionAuthor());

        this.grade = grade;
        this.gradeAuthor = gradeAuthor;
    }
}
