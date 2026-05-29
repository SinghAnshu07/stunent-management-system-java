import java.util.ArrayList;

public class StudentManagement{
    public static void main(String[] args){
        StudentManagement sm = new StudentManagement();
    }

    ArrayList<Student> students = new ArrayList<>();

    // Add Student
    void addStudent(Student s) {

        students.add(s);

        System.out.println("Student Added Successfully!");
    }

    // Display Students
    void displayStudents() {

        if (students.isEmpty()) {

            System.out.println("No Students Found!");
            return;
        }

        for (Student s : students) {

            s.displayStudent();
        }
    }

    // Search Student
    void searchStudent(int id) {

        boolean found = false;

        for (Student s : students) {

            if (s.id == id) {

                s.displayStudent();

                found = true;
            }
        }

        if (!found) {

            System.out.println("Student Not Found!");
        }
    }

    // Remove Student
    void removeStudent(int id) {

        boolean removed = false;

        for (Student s : students) {

            if (s.id == id) {

                students.remove(s);

                removed = true;

                System.out.println("Student Removed Successfully!");

                break;
            }
        }

        if (!removed) {

            System.out.println("Student Not Found!");
        }
    }
}

