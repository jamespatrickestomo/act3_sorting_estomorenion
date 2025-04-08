
import java.util.Scanner;
class Student{
String name;
double grade;
    
public Student(String name, double grade){
    this.name = name;
    this.grade = grade;
}
public String toString(){
    return name + " - " + grade;
}
}
public class App { 
    public static void bubbleSort(Student[] students){
        int n = students.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if (students[j].grade > students[j + 1].grade){
                    Student temp = students[j + 1];
                    students[j] =  students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter name of Student #" + (i + 1)+ ": ");
            String name = scanner.nextLine();
            System.out.println("Enter grade of " + name + ": ");
            double grade = scanner.nextDouble();
            scanner.nextLine();
            students[i] = new Student(name, grade);
        }
        bubbleSort(students);

        System.out.println("\nSorted Students by Grade (Ascending):");
        for(Student s : students){
            System.out.println(s);
        }
        scanner.close();
    }
}