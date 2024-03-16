package Task3;

public class Person {
    private String name;

    // Konstruktør
    public Person(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Dummy-metode som beskrevet i opgaven
    public boolean addCourse(String course) {
        // Her kunne logik til at tilføje et kursus implementeres,
        // men i dette tilfælde gør vi ikke noget og returnerer blot true.
        return true;
    }
}
