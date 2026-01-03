package uczelnia;

public class Homework {
    private String title;
    private String description;
    private Lecturer author;
    private int maxPoints;

    public Homework(String title, String description, Lecturer author, int maxPoints){
        this.title = title;
        this.description = description;
        this.author = author;
        this.maxPoints = maxPoints;
    }

    public Homework() {
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Lecturer getAuthor() {
        return author;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }
}
