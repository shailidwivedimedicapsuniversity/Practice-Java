import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {
    private int s_id;
    private String name;

    // Constructor
    public Student(int s_id, String name) {
        this.s_id = s_id;
        this.name = name;
    }

    // Getters and Setters
    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Overriding compareTo for natural ordering based on name
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name); // Compare by name
    }

    // Overriding toString for easy display
    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", name='" + name + '\'' +
                '}';
    }
}

class Comparables {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(3, "Shaili"),
                new Student(10, "Naili"),
                new Student(2, "Rhitu"),
                new Student(3, "Anjali"), // Same ID as Shaili
                new Student(2, "Rohit") // Same ID as Rhitu
        );

        System.out.println("Original List:" + list);

        // Sorting using Comparable (by name)
        Collections.sort(list);
        System.out.println("Sorted List by Comparable (Name):" + list);
        
        // Sorting using Comparator (by s_id, then by name)
        Collections.sort(list, new IdComparator());
        System.out.println("\nSorted List by ID (Custom Ordering, then by Name):" + list);
    }
}

// Comparator class for sorting by s_id and then by name
class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int idComparison = Integer.compare(s1.getS_id(), s2.getS_id());
        if (idComparison == 0) {
            return s1.getName().compareTo(s2.getName()); // Compare by name if IDs are the same
        }
        return idComparison; // Compare by ID
    }
}
