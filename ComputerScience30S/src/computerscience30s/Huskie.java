package computerscience30s;

/**
 *
 * @author n.hacault
 */
public class Huskie extends Student{    
    
    private boolean pride;

    public Huskie(String name, int age, boolean isMale, 
            int grade, int studentNumber) {
        super(name, age, isMale, grade, studentNumber);
        pride = true;
    }
    
    public void getOlder() {
        pride = false;
    }
    
    public void graduating() {
        pride = true;
    }
    
    public void talk() {
        super.talk();
        System.out.println("\t - Do I have pride, the answer is " + pride);
    }
    
}
