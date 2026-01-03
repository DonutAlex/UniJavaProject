package uczelnia;

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

}
