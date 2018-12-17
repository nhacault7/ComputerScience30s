package computerscience30s;
//zzzz another bites the dust
/**
 *
 * @author n.hacault
 */
public class Person {

    // properties
    String name;
    private int age;
    private boolean isMale;
    private boolean isAlive;

    // methods
    
    /**
     * Constructor method
     */
    public Person() {
        born();
        name = "Jane Doe";
        isMale = false;
    }
    
    public Person(String nameToGive) {
        born();
        name = nameToGive;
        isMale = false;
    }
    
    public Person(String name, int age, boolean isMale) {
        isAlive = true;
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
    
    public void born() {
        isAlive = true;
        age = 0;
        isMale = false;
    }

    public void death() {
        isAlive = false;
    }
 
    public void birthday() {
        age++;
    }
    
    public void birthday(int times) {
        for (int i = 0; i < times; i++) {
            birthday();
        }
    }

    public void talk() {
        if (isAlive) {
            System.out.println(name + " and my age is "
                    + age + " and if you are wondering if "
                    + "i am a male, the answer is " + isMale);

        } else {
            System.out.println("Booooo!");
        }
    }
    
    public void identify() {
        isMale = !isMale;
    }
}
