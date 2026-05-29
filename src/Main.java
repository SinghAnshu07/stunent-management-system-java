public class main {
}
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    StudentManagement sm = new StudentManagement();

    while (true) {

        System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");

        System.out.println("1. Add Student");
        System.out.println("2. Display Students");
        System.out.println("3. Search Student");
        System.out.println("4. Remove Student");
        System.out.println("5. Exit");

        System.out.print("Enter Choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:

                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();

                Student s = new Student(id, name, marks);

                sm.addStudent(s);

                break;

            case 2:

                sm.displayStudents();

                break;

            case 3:

                System.out.print("Enter Student ID: ");

                int searchId = sc.nextInt();

                sm.searchStudent(searchId);

                break;

            case 4:

                System.out.print("Enter Student ID: ");

                int removeId = sc.nextInt();

                sm.removeStudent(removeId);

                break;

            case 5:

                System.out.println("Program Closed!");

                System.exit(0);

            default:

                System.out.println("Invalid Choice!");
        }
    }
}

