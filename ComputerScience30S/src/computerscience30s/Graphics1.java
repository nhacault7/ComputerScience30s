package computerscience30s;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author n.hacault
 */
public class Graphics1 extends JFrame {
    
    // global variables, propertie, controls
    
    private JLabel text; 
    private JButton button;
    private JTextField textbox;
    private JLabel picture;
            
    /**
     * Default class constructor, sets class properties
     */
    public Graphics1() {
        // setting the properties of the form (frame), container
        this.setSize(500, 800); // set width and height
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.setTitle("Graphics One");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        // create (construct) the controls
        text = new JLabel("Hello World");
        button = new JButton("Exit");
        textbox = new JTextField(10);
        picture = new JLabel("picture here");
        
        // setup a image
        Icon image = new ImageIcon("C:\\Users\\n.hacault\\Pictures\\M94j.gif");
        picture.setIcon(image);
        
        // setup our container      
        this.getContentPane().setLayout(null);
                
        // add our controls into the container
        this.getContentPane().add(text);
        this.getContentPane().add(button);
        this.getContentPane().add(textbox);
        this.getContentPane().add(picture);
        
        // position all our controls
        text.setBounds(5, 5, 200, 50);
        button.setBounds(5, 60, 200, 50);
        textbox.setBounds(5, 115, 200, 25);
        picture.setBounds(5, 145, 400, 400);
        
        // add actions to my controls
        addActions();
        
        /* should always be the last line in the
        constructor */
        this.setVisible(true);
    }

    
    private void addActions() {
        
        // creates an action for the button click
        ActionListener buttonAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        
        // connect the action to the control
        button.addActionListener(buttonAction);
        
    }
    
}
