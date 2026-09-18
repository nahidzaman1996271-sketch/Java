public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student("Nahid Ibn Zaman");
        // Student s3 = new Student("Nahid Ibn Zaman", 28);
        // Student s4 = new Student("Nahid Ibn Zaman", 28, 252);
        // Student s5 = new Student("Nahid Ibn Zaman", 28, 252, "Daffodil International University");
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    Student() {
        this("Unknown");
        System.out.println("I am in the first constructor");
    }

    Student(String name) {
        this(name, 0);
        System.out.println("I am in the second constructor");
    }

    Student(String name, int age) {
        this(name, age, 0);
        System.out.println("I am in the third constructor");
    }

    Student(String name, int age, int rollNumber) {
        this(name, age, rollNumber, "unknown");
        System.out.println("I am in the fourth constructor");
    }

    Student(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;

        System.out.println("I am in fifth constructor");
    }

    void markAttendance() {
        System.out.println("Attendance marks for attendance: " + name);
    }
}