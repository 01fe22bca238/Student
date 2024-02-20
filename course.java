public class course {
    public String course[] = { "C#", "Applied statistics", "JAVA" };
    public int marks[] = { 70, 100, 30 };

    public void Dispalymarks(){
        System.out.println("Marks Obtained for the Courses");
        for (int i = 0; i < 3; i++) {
            System.out.println("Course:" + course[i] + " marks:" + marks[i]);
        }
    }
    public void displayLessthanFourty() {
        for (int i = 0; i < 3; i++) {
            if (marks[i] < 40) {
                System.out.println("Marks less then 40 in " + course[i]+ ":" + marks[i]);
            }
        }
    }

}

