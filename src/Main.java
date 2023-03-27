import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Dodaj osobę");
            System.out.println("2. Dodaj studenta");
            System.out.println("3. Dodaj nauczyciela");
            System.out.println("0. Wyjście");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Podaj imię:");
                    String firstName = scanner.nextLine();
                    System.out.println("Podaj nazwisko:");
                    String lastName = scanner.nextLine();
                    System.out.println("Podaj rok urodzenia:");
                    int birthYear = scanner.nextInt();
                    scanner.nextLine();

                    Person person = new Person(firstName, lastName, birthYear);
                    System.out.println(person);
                    break;
                case 2:
                    System.out.println("Podaj imię:");
                    firstName = scanner.nextLine();
                    System.out.println("Podaj nazwisko:");
                    lastName = scanner.nextLine();
                    System.out.println("Podaj rok urodzenia:");
                    birthYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Podaj numer albumu:");
                    int albumNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Podaj rok naboru:");
                    String enrollmentYear = scanner.nextLine();
                    scanner.nextLine();

                    Student student = new Student(firstName, lastName, birthYear, albumNumber, enrollmentYear);
                    System.out.println(student);
                    break;
                case 3:
                    System.out.println("Podaj imię:");
                    firstName = scanner.nextLine();
                    System.out.println("Podaj nazwisko:");
                    lastName = scanner.nextLine();
                    System.out.println("Podaj rok urodzenia:");
                    birthYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Podaj stopień naukowy:");
                    String academicDegree = scanner.nextLine();

                    Teacher teacher = new Teacher(firstName, lastName, birthYear, academicDegree);
                    System.out.println(teacher);
                    break;
                case 0:
                    System.out.println("Koniec programu.");
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja.");
                    break;
            }
        } while (choice != 0);
    }
}
