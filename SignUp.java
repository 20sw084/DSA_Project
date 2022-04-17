package mm;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUp extends JFrame implements ActionListener   {
   JLabel l1, l2, l3, l4, l5, l6, l7, l8;  //all labels for textField
    JTextField tf1, tf2, tf5, tf6, tf7;   // others fields
    JButton btn1, btn2;  //buttons for signup and clear
    JPasswordField p1, p2;  // password fields
    File f = new File("C:\\Files");
    int ln;
   
    
    void createFolder(){
        if(!f.exists()){
            f.mkdirs();
        }
    }
    
    void readFile(){
        try {
            FileReader fr = new FileReader(f+"\\logins.txt");
            System.out.println("file exists!");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw = new FileWriter(f+"\\logins.txt");
                System.out.println("File created");
            } catch (IOException ex1) {
               // Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
    }
    
    void addData(String usr,String pswd,String mail,String con,String state,String Phn){
        try {
            RandomAccessFile raf = new RandomAccessFile(f+"\\logins.txt", "rw");
            for(int i=0;i<ln;i++){
                raf.readLine();
            }
            //if condition added after video to have no lines on first entry
            if(ln>0){
            raf.writeBytes("\r\n");
            raf.writeBytes("\r\n");
            }
            raf.writeBytes("Email:"+mail+ "\r\n");
            raf.writeBytes("Password:"+pswd+ "\r\n");
            raf.writeBytes("Username:"+usr+ "\r\n");
            raf.writeBytes("Country:"+con+ "\r\n");
            raf.writeBytes("State:"+state+ "\r\n");
            raf.writeBytes("Phone No:"+Phn);
            
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            //Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    void countLines(){
        try {
            ln=0;
            RandomAccessFile raf = new RandomAccessFile(f+"\\logins.txt", "rw");
            for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
            System.out.println("number of lines:"+ln);
        } catch (FileNotFoundException ex) {
           // Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
           // Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    SignUp()  
    {  
        setVisible(true);  
        setSize(550, 450);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setTitle("Sign-Up");  
        l1 = new JLabel("Sign Up");  
        l1.setForeground(Color.blue);  
        l1.setFont(new Font("Serif", Font.BOLD, 20));  
        l2 = new JLabel("Name:");  
        l3 = new JLabel("Email-ID:");  
        l4 = new JLabel("Create Passowrd:");  
        l5 = new JLabel("Confirm Password:");  
        l6 = new JLabel("Country:");  
        l7 = new JLabel("State:");  
        l8 = new JLabel("Phone No:");   
        tf1 = new JTextField();  
        tf2 = new JTextField();  
        p1 = new JPasswordField();  
        p2 = new JPasswordField();  
        tf5 = new JTextField();  
        tf6 = new JTextField();  
        tf7 = new JTextField();  
        btn1 = new JButton("Submit");  
        btn2 = new JButton("Clear");  
        btn1.addActionListener(this);  
        btn2.addActionListener(this);  
        l1.setBounds(100, 30, 400, 30);  
        l2.setBounds(80, 70, 200, 30);  
        l3.setBounds(80, 110, 200, 30);  
        l4.setBounds(80, 150, 200, 30);  
        l5.setBounds(80, 190, 200, 30);  
        l6.setBounds(80, 230, 200, 30);  
        l7.setBounds(80, 270, 200, 30);  
        l8.setBounds(80, 310, 200, 30);  
        tf1.setBounds(300, 70, 200, 30);  
        tf2.setBounds(300, 110, 200, 30);  
        p1.setBounds(300, 150, 200, 30);  
        p2.setBounds(300, 190, 200, 30);  
        tf5.setBounds(300, 230, 200, 30);  
        tf6.setBounds(300, 270, 200, 30);  
        tf7.setBounds(300, 310, 200, 30);  
        btn1.setBounds(150, 350, 100, 30);  
        btn2.setBounds(350, 350, 100, 30);  
        add(l1);  
        add(l2);  
        add(tf1);  
        add(l3);  
        add(tf2);  
        add(l4);  
        add(p1);  
        add(l5);  
        add(p2);  
        add(l6);  
        add(tf5);  
        add(l7);  
        add(tf6);  
        add(l8);  
        add(tf7);  
        add(btn1);  
        add(btn2);  
    }  
    public void actionPerformed(ActionEvent e)   
    {  
        if (e.getSource() == btn1)  
         {  
            int x = 0;  
            String s1 = tf1.getText();  
            String s2 = tf2.getText();  
            char[] s3 = p1.getPassword();  
            char[] s4 = p2.getPassword();   
            String s8 = new String(s3);  
            String s9 = new String(s4);  
            String s5 = tf5.getText();  
            String s6 = tf6.getText();  
            String s7 = tf7.getText();  
            if (s8.equals(s9))  
            {  
                try  
                {  
                   createFolder();
                   readFile();
                   countLines();
                   addData(s1,s8,s2,s5,s6,s7);
                       
                     
                        JOptionPane.showMessageDialog(btn1, "Signed Up Successfully.\nLets Log-In now."); 
                        dispose();
                        new Login();
                }  
                catch (Exception ex)   
                {  
                    System.out.println(ex);  
                }  
            }  
            else  
            {  
                JOptionPane.showMessageDialog(btn1, "Password Does Not Match");  
            }   
          }   
          else  
          {  
            tf1.setText("");  
            tf2.setText("");  
            p1.setText("");  
            p2.setText("");  
            tf5.setText("");  
            tf6.setText("");  
            tf7.setText("");  
          }  
    } 
    public static void main(String args[])  
    {  
        new SignUp();  
    }  

}