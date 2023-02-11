import java.util.Scanner;

public class Excersice1_StuMgtConsole {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("---- Student Management System -----");
        System.out.println();

        Excersice1_Student[] students = new Excersice1_Student[2];

        //students 10 data input ---> [name,age,address,mark] ---> keybord input
        for (int i = 0; i < students.length; i++) {

            Excersice1_Student student = new Excersice1_Student();
            System.out.print("Enter name for Student " + (i + 1) + " : ");
            student.name = scan.next();
            System.out.print("Enter address for Student " + (i + 1) + " : ");
            student.address = scan.next();
            System.out.print("Enter age for Student" + (i + 1) + " : ");
            student.age = scan.nextInt();
            System.out.print("Enter marks for Student " + (i + 1) + " : ");
            student. marks = scan.nextInt();
            System.out.println("");

            students[i] = student;
        }

        for (Excersice1_Student student : students) {
            System.out.println("[name: " + student.name + ", age: " + student.age + ", address: " + student.address + ", marks: " + student.marks + "] " );
        }

        //[name:Yasindu, age:30, address:panadura, mark:45.6]
        //[name:Yasindu, age:30, address:panadura, mark:45.6]
        //[name:Yasindu, age:30, address:panadura, mark:45.6]
        //[name:Yasindu, age:30, address:panadura, mark:45.6]
        //[name:Yasindu, age:30, address:panadura, mark:45.6]

    }
}
