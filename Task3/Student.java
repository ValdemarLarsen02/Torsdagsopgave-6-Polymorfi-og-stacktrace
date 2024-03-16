package Task3;

import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<String> passedCourses;
    private ArrayList<String> currentCourses;

    // Opdateret konstruktør
    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<>(); // Initialiseres som tom
    }

    // Overskriver addCourse metoden
    @Override
    public boolean addCourse(String course) {
        // Tjekker om kurset allerede er bestået
        if (passedCourses.contains(course)) {
            return false; // Kurset er allerede bestået og tilføjes ikke til currentCourses
        } else {
            // Tjekker om kurset allerede er tilmeldt
            if (!currentCourses.contains(course)) {
                currentCourses.add(course); // Tilføjer kurset til currentCourses, hvis det ikke allerede er tilmeldt
                return true;
            }
            return false; // Returnerer false, hvis kurset allerede er i currentCourses
        }
    }

    // Yderligere funktionalitet specifik for Student kan tilføjes her
}