import javax.swing.*;


// Frame by Association
public class Window {
    JFrame f;
    JButton b;
    Window(){
        f = new JFrame();  
        f.setSize(400,400);
        f.setTitle("Welcome");              
        f.setLocation(483,184); 
        f.setLayout(null);        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);     

        b = new JButton("Submit");
        f.add(b); 
        b.setBounds(100,100,100,30);
       
    }
    public static void main(String[] args) {
        new Window();
    }
}


// Frame by Inheritance
// public class Window extends JFrame {    
//     Window(){                
//         super.setTitle("Welcome");
//         setSize(400,400);
//         setLocation(483,184); 
//         // add(new JLabel("Welcome to my Label"));
//         // setResizable(false);        
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setVisible(true);        
//     }
//     public static void main(String[] args) {
//         new Window();
//     }
// }
