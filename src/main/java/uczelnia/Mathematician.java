package uczelnia;

import administration.Evaluation;

public class Mathematician extends ExperiencedLecturer {
    private int favortiteNumber;

    public int getFavortiteNumber() {
        return favortiteNumber;
    }

    public void setFavortiteNumber(int favortiteNumber) {
        this.favortiteNumber = favortiteNumber;
    }

    public Mathematician(int favortiteNumber, int expierienceYears, String firstName, String lastName, int employeeNumber) {
        super(firstName, lastName, employeeNumber, expierienceYears);
        this.favortiteNumber = favortiteNumber;
    }

    @Override
    public GradedHomework gradedHomework(SolvedHomework solvedHomework){
        GradedHomework gradedHomework = new GradedHomework(solvedHomework, solvedHomework.getMaxPoints(), this);
        if(solvedHomework.getSolution().length() > favortiteNumber)
            gradedHomework = new GradedHomework(solvedHomework, 0, this);
        return gradedHomework;
    }
}