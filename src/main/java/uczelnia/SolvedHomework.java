package uczelnia;

public class SolvedHomework extends Homework{
    private String solution;
    private Student solutionAuthor;

    public SolvedHomework(String title, String description, Lecturer author, int maxPoints, String solution, Student solutionAuthor){
        super(title, description, author, maxPoints);
        this.solution = solution;
        this.solutionAuthor = solutionAuthor;
    }
    public SolvedHomework(Homework homework, String solution, Student solutionAuthor)
    {
        super(homework.getTitle(), homework.getDescription(), homework.getAuthor(), homework.getMaxPoints());
        this.solution = solution;
        this.solutionAuthor = solutionAuthor;
    }

    public SolvedHomework() {
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public Student getSolutionAuthor() {
        return solutionAuthor;
    }

    public void setSolutionAuthor(Student solutionAuthor) {
        this.solutionAuthor = solutionAuthor;
    }
}
