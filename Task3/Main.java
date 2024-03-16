package Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Opdaterede ArrayLists for studerende og undervisere
        ArrayList<String> student1PassedCourses = new ArrayList<>(Arrays.asList("Matematik", "Engelsk", "Java 1.0"));
        ArrayList<String> student2PassedCourses = new ArrayList<>(Arrays.asList("Lua"));
        ArrayList<String> teacher1CanTeach = new ArrayList<>(Arrays.asList("Fysik", "Kemi", "Biologi"));
        ArrayList<String> teacher2CanTeach = new ArrayList<>(Arrays.asList("Python", "Java 1.0", "React"));
        
        // Opretter studerende og undervisere
        Student student1 = new Student("Micke", student1PassedCourses);
        Student student2 = new Student("Valdemar", student2PassedCourses);
        Teacher teacher1 = new Teacher("Lise", teacher1CanTeach);
        Teacher teacher2 = new Teacher("Tess", teacher2CanTeach);

        // Gemmer alle objekter i en ArrayList persons
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);
        
        // Tilføjer kurset "Java 1.0" til alle personer i listen og printer udsagn
        for (Person person : persons) {
            boolean added = person.addCourse("Java 1.0");
            if (!added) {
                if (person instanceof Student) {
                    System.out.println(person.getName() + " har allerede bestået dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan ikke undervise i dette fag.");
                }
            }
        }
    }
}
