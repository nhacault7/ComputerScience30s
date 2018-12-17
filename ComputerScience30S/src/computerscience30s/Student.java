package computerscience30s;

/**
 *
 * @author n.hacault
 */
public class Student extends Person {
    
    private int grade;
    private double gpa;
    private int studentNumber;
    
    public Student(String name, int age, boolean isMale, 
            int grade, int studentNumber) {
        super(name, age, isMale);
        gpa = 2.8;
        this.grade = grade;
        this.studentNumber = studentNumber;
    }
    
    public void study(){
        gpa = gpa + 0.1;
    }
    
    public void slackOff(){
        gpa = gpa - (0.1 * 2);
    }
    
    public void cram(){
        for (int i = 0; i < 6; i++) {
            study();
        }
    }
    
    @Override
    public void talk(){
        super.talk();
        System.out.println("\t" + "Student # " + studentNumber 
                + ", Grade " + grade + ", GPA " + gpa);
    }
}
