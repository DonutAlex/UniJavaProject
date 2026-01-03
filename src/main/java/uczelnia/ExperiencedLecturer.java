package uczelnia;

public class ExperiencedLecturer extends Lecturer{
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
}
