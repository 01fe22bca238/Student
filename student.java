/**
 * The class "student" represents a student with specific details like name, program, department, and
 * registered courses, and has a method to display these details.
 */
class student extends course{
    String name = "Sanju";
    String program = "BCA";
    String department = "BCA";
    public String Registeredcourses[] = {" ","C#", "Applied statistics", "JAVA" };

    public void Display() {
        System.out.println("---Student Details ---");
        System.out.println("Name of the student: " + name);
        System.out.println("Program: " + program);
        System.out.println("Department: " + department);
        System.out.println("Registered Courses: ");
        for (int i = 1; i <=3; i++) {
            System.out.println(i +" : "+Registeredcourses[i]);
        }
    }
    public static void main(String[] args) {
        student s = new student();
        s.Display();
        s.Dispalymarks();
        s.displayLessthanFourty();
        
    }
}