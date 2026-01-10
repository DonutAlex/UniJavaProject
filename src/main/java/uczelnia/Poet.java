package uczelnia;

public class Poet extends ExperiencedLecturer {
    private String hatedAuthor;

    public String getHatedAuthor() {
        return hatedAuthor;
    }

    public void setHatedAuthor(String hatedAuthor) {
        this.hatedAuthor = hatedAuthor;
    }

    public Poet(String hatedAuthor, int expierienceYears, String firstName, String lastName, int employeeNumber) {
        super(firstName, lastName, employeeNumber, expierienceYears);
        this.hatedAuthor = hatedAuthor;
    }

    @Override
    public GradedHomework gradedHomework(SolvedHomework solvedHomework) {

        if (solvedHomework.getSolution().contains(hatedAuthor)) {
            return new GradedHomework(solvedHomework, 0, this);
        } else {
            return new GradedHomework(solvedHomework, solvedHomework.getMaxPoints(), this);
        }
    }
}
