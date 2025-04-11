import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student\n2. View All \n3. Update\n4. Delete\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // okay planning to ask for student drtails, and call dao.addStudent()
                    break;
                case 2:
                    // to get all students
                    break;
                case 3:
                    // to update studets
                    break;
                case 4:
                    // to delete student
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}