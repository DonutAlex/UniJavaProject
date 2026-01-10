package uczelnia;

import administration.Evaluation;

public abstract class ExperiencedLecturer extends Lecturer{
    public int experienceYears;

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public ExperiencedLecturer(String firstName, String lastName, int index, int experienceYears) {
        super(firstName, lastName, index);
        this.experienceYears = experienceYears;
    }

    public Homework createHomework(String title, String description, int maxPoints){
        Homework homework = new Homework(title, description, this, maxPoints);
        Evaluation.addHomework(homework);
        return homework;
    }

    abstract protected GradedHomework gradedHomework(SolvedHomework solvedHomework);

    public GradedHomework gradeHomework(SolvedHomework solvedHomework) {
        GradedHomework homework = gradedHomework(solvedHomework);
        Evaluation.addHomework(homework);
        return homework;
    }
}
