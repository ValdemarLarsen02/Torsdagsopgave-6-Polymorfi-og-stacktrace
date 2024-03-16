package Task3;
import java.util.ArrayList;
public class Teacher extends Person {
    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;

    // Opdateret konstruktør
    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<>(); // Initialiseres som tom
    }

    @Override
    public boolean addCourse(String course) {
        // Tjekker om underviseren er kvalificeret til at undervise i kurset
        if (canTeach.contains(course)) {
            // Tjekker om kurset allerede er i currentCourses
            if (!currentCourses.contains(course)) {
                currentCourses.add(course); // Tilføjer kurset til currentCourses, hvis det ikke allerede er der
                return true;
            }
            return false; // Returnerer false, hvis kurset allerede er i currentCourses
        } else {
            return false; // Underviseren er ikke kvalificeret til at undervise i kurset
        }
    }

    // Yderligere funktionalitet specifik for Teacher kan tilføjes her
}
