package computerscience30s;

/**
 *
 * @author n.hacault
 */
public class Meeting {
    
    private Person[] people;
    private int index;
    
    public Meeting(){
        people = new Person[500];
        index = 0;
    }
    
    public void attend(Person person){
        people[index] = person;
        index++;
    }
    
    public void hold() {
    
    }
}
