package computerscience30s;

/**
 *
 * @author n.hacault
 */
public class Teacher extends Person {

    public Student[] students;

    public Teacher(String name) {
        super(name);
        super.birthday(30);
        students = new Student[100];
    }

    public void teach() {
        for (int i = 0; i < students.length; i++) {
            if(students[i] != null){
                students[i].study();
            }
        }
    }

    public void talk() {
        super.talk();
        System.out.println("\tI teach " + students.length + " students");
    }

}
