import java.util.Scanner;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return id == student.id && name.equals(student.name);
    }
}

public class CompareObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID for Student 1: ");
        int id1 = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Enter Name for Student 1: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter ID for Student 2: ");
        int id2 = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Enter Name for Student 2: ");
        String name2 = scanner.nextLine();

        Student s1 = new Student(id1, name1);
        Student s2 = new Student(id2, name2);

        if (s1.equals(s2)) {
            System.out.println("s1 and s2 are equal.");
        } else {
            System.out.println("s1 and s2 are not equal.");
        }
    }
}
