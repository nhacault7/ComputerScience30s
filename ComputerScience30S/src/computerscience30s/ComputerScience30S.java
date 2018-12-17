package computerscience30s;

import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author n.hacault
 */
public class ComputerScience30S {

    public static void main(String[] args) {
        /* call the method so that it
        branches down and runs all the code
        in the method, to do this
        use the name of the method and round
        brackets */
        // unit1();

        /* In NetBeans, you can write the call
        to a method before you write the method
        and NetBeans will help you write the method */
        //unit2();
        //unit3();
        //unit4();
        unit5();    

    }

    public static void unit1() {

        // this is a comment, boi best know what that is
        /* This is a big boy comment. 
        Seen it before? */
        System.out.print("Hello world");
        //How to output 101

        System.out.println("Goodbye world");
        // println likes its personal safe space, breaks current line

        // sout + tab uses magic called "autocomplete"
        // they're special, not different
        System.out.println("Display a Quote, \" slash quote");
        System.out.println("Display a tab, \t slash t");
        System.out.println("Display a slash \\ slash slash");
        System.out.println("Display a line break \n slash n");

        // big bucks for something fancy
        JOptionPane.showMessageDialog(null, "Heyyo");

        // extra big bucks for + 5 cool
        JOptionPane.showMessageDialog(null,
                "Heyyo, the sequal",
                "Hey look, im up here",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "Heyyo, the trilogy",
                "Whatcha thinking about?",
                JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "YO, YOU GOT VIRUS",
                "Free V-Bucks",
                JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "This box is pre boring",
                "",
                JOptionPane.PLAIN_MESSAGE);

        // Hey kid... you ever wanna talk to a computer?
        JOptionPane.showInputDialog("Give it a try, its safe I promise");

        // Lets get fancy
        JOptionPane.showInputDialog(null,
                "50% of g-fuel",
                "Important Info",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showInputDialog(null,
                "Eating Sugar?",
                "Yes Papa?",
                JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showInputDialog(null,
                "You have 934 unread emails",
                "Computer Time",
                JOptionPane.WARNING_MESSAGE);

        JOptionPane.showInputDialog(null,
                "Input dialog 5",
                "Input 5",
                JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showInputDialog(null,
                "Input dialog 6",
                "Input 6");

        //
        JOptionPane.showConfirmDialog(null, "Did your mom say yes?");

        //
        JOptionPane.showConfirmDialog(null,
                "Confirm 2",
                "Confirm 2",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showConfirmDialog(null,
                "Confirm 3",
                "Confirm 3",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showConfirmDialog(null,
                "Confirm 4",
                "Confirm 4",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showConfirmDialog(null,
                "Confirm 5",
                "Confirm 5",
                JOptionPane.OK_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

        // variables are cool
        // ye or ne
        boolean a = true;
        a = false;

        // not letters
        int b;
        b = 0;

        double c;
        c = 0.1;

        // not numbers
        char d;
        d = '$';

        // hard string stuff
        String e;
        //string is not blue
        e = "beans";

        // output that boi
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        // manipulation is necessary
        int x;
        x = 10;
        System.out.println("x =  " + x);
        x = 20;
        System.out.println("x = " + x);
        int y;
        y = x + 10;
        System.out.println("y = " + y);
        y++;    // y = y + 1
        System.out.println("y = " + y);
        y--;    // y = y - 1
        System.out.println("y = " + y);
        y = y + 10;
        System.out.println("y = " + y);

        // shorter is better
        y += 10;    // y = y + 10
        y -= 10;    // y = y - 10
        y *= 2;     // y = y * 2
        y /= 10;    // y = y / 10
        System.out.println("y = " + y);

        // if johnny has 5 candies and eats 3 how many are left?
        x = 28;
        y = x % 5;
        System.out.println("y = " + y);

        // stubborn variables *typed big*
        final double PI;
        PI = 3.14159265358979323846264338327950288419716939937510;
        final int PROBLEMS;
        PROBLEMS = 99;
        final char YES;
        YES = 'y';
        final boolean FOUND;
        FOUND = true;
        final String TEACHER_NAME;
        TEACHER_NAME = "Wachs";

        System.out.println(PI + " and "
                + PROBLEMS + " and "
                + YES + " and "
                + FOUND + " and "
                + TEACHER_NAME);

        // you decide who you are
        int f;
        f = 15;
        double g;
        g = 15.8;
        int h;
        h = (int) g;
        // lil imposter right here "casting"

        double k;
        k = 2.99999999999999;
        int l;
        l = (int) k;
        double m;
        m = (double) l;

        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);

        // here's the cast list for the numbers in this years play
        char n;
        n = 'a';
        int o;
        o = (int) n;
        System.out.println("o = " + o);

        o++;
        char p;
        p = (char) o;
        System.out.println("p = " + p);

        // use input dialog with a string
        String q = JOptionPane.showInputDialog("Write some cool stuff");
        JOptionPane.showMessageDialog(null, q);

        // convert string into numbers *parsing*
        String r = JOptionPane.showInputDialog("Enter int");
        int s = Integer.parseInt(r);
        JOptionPane.showMessageDialog(null, s);

        String t = JOptionPane.showInputDialog("Enter double");
        double u = Double.parseDouble(t);
        JOptionPane.showMessageDialog(null, u);

        // built in string actions
        String word = "super-man";
        int count = word.length();

        // built in math actions
        double answer1 = Math.abs(-1);  // absolute value
        double answer2 = Math.PI;       // the value of Pi
        double answer3 = Math.cos(0.5); // cosine (sin, tan, and arcs also)
        double answer4 = Math.log(0.5); // logarithms
        double answer5 = Math.pow(5, 3); // 5 to the power of 3
        double answer6 = Math.sqrt(9);  // square root
        System.out.println("1 = " + answer1);
        System.out.println("2 = " + answer2);
        System.out.println("3 = " + answer3);
        System.out.println("4 = " + answer4);
        System.out.println("5 = " + answer5);
        System.out.println("6 = " + answer6);

        // Math library and random numbers
        double seed = Math.random();
        double low = 1.0;
        double high = 10;
        double random = (high - low + 1.0) * seed + low;
        System.out.println("Random # between " + low + " and "
                + high + " is " + random);
        int value = (int) random;
        System.out.println("Random integer is " + value);
        // random number formula restricts randoms to a range

        //////////////////////////////////////////////////////////////////////
        // CONDITIONAL STATEMENTS:
        //////////////////////////////////////////////////////////////////////
        // simple if statement, when something is true, checks for 1 thing
        int value1 = 10, value2 = 10;
        if (value == value2) {
            System.out.println("Equal");
        }

        // if with an else, when something is true and false, checks for 2 things
        double value3 = 1.45, value4 = 1.5;
        if (value3 < value4) {
            System.out.println("Less than");
        } else {
            System.out.println("Greater than or equal");
        }

        /* use chars and some shorthand for conditional statements, meaning
        when the code is 1 line, you don't need the ( ) brackets */
        char value5 = 'A', value6 = 'a';
        if (value5 != value6) {
            System.out.println("Not Equal");
        }
        // above style is not recommended, except in certain situations

        /* use the else if for multiple cases of more than 2 things
        same as switch statement (which is not recommended using strings
        (more complicated for comparing) */
        String word1 = "cat";
        String word2 = "cAt";
        // equals is more complicated with strings
        if (word1.equals(word2)) {
            System.out.println("Equal, same case");
        } else if (word1.equalsIgnoreCase(word2)) {
            System.out.println("Equal, different cases");
        } else {
            System.out.println("Not equal");
        }

        // optional (shorthand) for combining logic using "and" "or"        
        int age = 20;
        double iq = 0.6;
        if (age >= 15 && iq >= 0.5) {       // && means "and"
            System.out.println("Get in");
        } else if (age >= 15 || iq >= 0.5) {  // || means "or"
            System.out.println("Try again later");
        } else {
            System.out.println("Get out");
        }

        //////////////////////////////////////////////////////////////////////
        // LOOPING:
        //////////////////////////////////////////////////////////////////////
        // basic "while" loop
        int counter = 1;
        while (counter <= 50) {
            System.out.println("Counter = " + counter);
            counter++;
        }

        // while loop with a string
        String password = JOptionPane.showInputDialog("Enter pass");
        while (password.equals("123")) {
            System.out.println("Not accepted");
            password = JOptionPane.showInputDialog("Enter pass");
        }

        /* second version of the while loop, very rarely used, tests at the
        bottom of the loop, this loop always runs at least once */
        do {
            password = JOptionPane.showInputDialog("Enter password");
        } while (password.equals("qwerty") == false);

        // the "for" lop, designed for counting
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        // second loop with variations
        for (int j = 10; j <= 100; j = j + 5) {
            System.out.println("j = " + j);
        }

        // for loop that counts down
        for (int i = 100; i >= 0; i--) {
            System.out.println("i = " + i);
        }
    }

    private static void unit2() {
        System.out.println("Methods starting...");

        drawStar();

        draw("word");
        draw("$");
        draw("chicken");

        draws("dalmations", 101);
        draws("problems", 99);

        int number = getMeNumber();
        draw("Number is " + number);

        output("Hello");
        output("Hi", "Example");

        System.out.println("Methods complete!");
    }

    /**
     * Draws a star
     */
    private static void drawStar() {
        System.out.println("*");
    }

    /**
     * draws an item
     *
     * @param thing the thing to draw
     */
    private static void draw(String thing) {
        System.out.println(thing);
    }

    private static void draws(String item, int times) {
        for (int i = 0; i < times; i++) {
            draw(item);
        }
    }

    private static int getMeNumber() {
        return random(1, 100);
    }

    /**
     * generates a random number
     *
     * @param low the lowest number i can make
     * @param high the highest number i can make
     * @return a random number in the range
     */
    private static int random(int low, int high) {
        double seed = Math.random();
        double h = (double) high;
        double l = (double) low;
        double number = (h - l + 1) * seed + l;
        int answer = (int) number;
        return answer;
    }

    /**
     * display text to display
     *
     * @param text the text to display
     */
    private static void output(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    private static void output(String text, String title) {
        JOptionPane.showMessageDialog(null, text,
                title, JOptionPane.PLAIN_MESSAGE);
    }

    private static void unit3() {
        System.out.println("Arrays example started");

        // create a regular variable for comparison
        int size = 5;

        // create (declare) an array
        int[] array = new int[size];

        array[0] = 5;
        array[1] = -5;
        array[2] = 0;
        array[3] = 55;
        array[4] = 555;

        // interntional error
        // array[5] = 5555
        // array[-1] = error
        // create an array with no size
        double[] a;

        // later give it a size
        a = new double[3];

        // put in content
        a[1] = 3.14;

        /* you can keep resizing (re-dimensioning)
        the array */
        a = new double[5];
        /* but when it resizes it wipes
        out the content */

        // create a pre-filled array
        double[] coins = {0.05, 0.10, 0.25, 1.00, 2.00};

        // arrays can be constants
        final String[] OPTIONS = {
            "New Game",
            "Save Game",
            "Quit"
        };

        // create an empty array
        int[] numbers = new int[100];

        /* to go through an entire array (traverse)
        use a for loop */
        for (int i = 0; i < 100; i++) {
            numbers[i] = 25;
        }

        /* better way to use the for loop with
        arrays is the .length feature*/
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " = "
                    + numbers[i]);
        }

        // arrays with methods:
        // use arrays as a parameter (input)
        output(coins);

        // test with another array
        double[] percents = {
            0.0,
            0.25,
            0.50,
            0.75,
            1.00
        };
        output(percents);

        // overloaded method
        output(numbers);

        int[] cards = random(2, 14, 52);
        output(cards);

        /* create a 2 dimensional (2D) array also
        constant to help "visualize" the array */
        final int ROWS = 20; // heights , y
        final int COLUMNS = 50; // width, x

        char[][] matrix = new char[ROWS][COLUMNS];

        // fill the matrix
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                matrix[row][column] = random('!', '~');
            }
        }

        output(matrix);

        System.out.println("arrays example complete");
    }

    private static void output(double[] a) {
        String text = "Array \n";

        for (int i = 0; i < a.length; i++) {
            // text = text + a[i} + ",";
            text += +a[i] + "\n";
        }

        output(text);
    }

    private static void output(int[] a) {
        double[] array = convert(a);
        output(array);
    }

    private static double[] convert(int[] a) {
        double[] array = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = (double) a[i];
        }
        return array;
    }

    private static int[] random(int low, int high, int size) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = random(low, high);
        }
        return a;
    }

    private static double random(double low, double high) {
        return (high - low + 1) * Math.random() + low;
    }

    private static char random(char low, char high) {
        return (char) (random((double) low, (double) high));
    }

    private static void output(char[][] matrix) {
        String text = "";

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                text += matrix[r][c] + " ";
            }
            text += "\n";
        }

        display(text);
    }

    private static void display(String text) {

        JTextArea area = new JTextArea();

        area.setText(text);

        Color background = new Color(0, 0, 0);
        Color foreground = new Color(0, 255, 0);

        area.setBackground(background);
        area.setForeground(foreground);

        Font font = new Font("Consolas", Font.PLAIN, 20);

        area.setFont(font);

        Icon icon = new ImageIcon("C:\\Users\\n.hacault\\Downloads"
                + "\\c16470506ad874d97ef7f41d4366f855.gif");

        JOptionPane.showMessageDialog(
                null,
                area,
                "",
                0,
                icon);
    }

    private static void unit4() {
        System.out.println("\nClasses begins...\n");

        Person person = new Person();
        person.name = "Chicken Solomon";

        person.birthday();
        person.talk();

        person.birthday(30);
        person.talk();

        Person douglas = new Person("Dougy Sampson");
        douglas.talk();

        Person palpatine = new Person("Sheev Palpatine", 88, true);
        palpatine.talk();
        
        Person bob = new Person("Sponge Square Pants", 24, true);
        bob.talk();
        bob.identify();
        bob.birthday();
        bob.talk();
        bob.death();
        bob.talk();

        Student student = new Student("Billy Madison", 30, true, 3, 1999);
        student.talk();
        student.study();
        student.slackOff();
        student.cram();
        student.talk();
        
        Huskie huskie = new Huskie("Havoc", 12, true, 9, 2665);
        huskie.talk();
        huskie.getOlder();
        huskie.talk();
        huskie.graduating();
        huskie.talk();
        
        Teacher teacher = new Teacher("Mrs. Puffs");
        teacher.talk();
        teacher.students[0] = student;
        teacher.students[1] = huskie;
        teacher.teach();
        
        huskie.talk();
        
        Meeting meeting = new Meeting();
        meeting.attend(person);
        meeting.attend(douglas);
        meeting.attend(palpatine);
        meeting.attend(bob);
        meeting.attend(student);
        meeting.attend(huskie);
        meeting.attend(teacher);
        meeting.hold();
        
        
        System.out.println("\nClasses complete!\n");
    }

    private static void unit5() {
        System.out.println("\nGraphics example started...\n");
        
        //Graphics1 g1 = new Graphics1(); // 1st graphics object all coded
        //Graphics2 g2 = new Graphics2(); // 2nd graphics object using designer
        Graphics3 g3 = new Graphics3();  // 3rd graphics using code and designer
        
        System.out.println("\nGraphics example complete!\n");
        
    }

}
