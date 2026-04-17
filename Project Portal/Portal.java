import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Portal extends JFrame implements ActionListener{
    JPanel panel;
	JLabel idLabel, passwordLabel, signUpLabel;
	JTextField idTF;
	JPasswordField passwordTF;
	JButton lgnBtn, signUpBtn, logInBtn;
	Color myColor1, myColor2;
	Font myFont, myFont2;
	Users us;
	User u = null;
	
	public Portal(Users us){
	    super("Portal");
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		this.us=us;
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		
		idLabel = new JLabel("ID: "); 
		idLabel.setBounds(80,100,100,30); //x,y,width,height
		idLabel.setForeground(Color.BLACK);
		panel.add(idLabel);
		
		passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(50,140,100,30);
		panel.add(passwordLabel);
		
		idTF = new JTextField();
		idTF.setBounds(120,100,150,30);
		panel.add(idTF);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(120,140,150,30);
		passwordTF.setEchoChar('*');
		panel.add(passwordTF);
		
		
		signUpBtn = new JButton("SignUp");
		signUpBtn.setBounds(80,210,80,25);
		signUpBtn.setFocusable(false);
		signUpBtn.addActionListener(this);
		signUpBtn.setBorder(null);
		panel.add(signUpBtn);
		
		logInBtn = new JButton("Login");
		logInBtn.setBounds(200,210,80,25);
		logInBtn.setFocusable(false);
		logInBtn.addActionListener(this);
		logInBtn.setBorder(null);
		panel.add(logInBtn);
		
		
		this.add(panel);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
	    String command = ae.getActionCommand();
		if(logInBtn.getText().equals(command)){
			String id = idTF.getText();
			String pass = passwordTF.getText();
	
	     int index = us.userExists(id);
			if(index!=-1){
				u = us.getUser(index,pass);
				if(u!=null){
					JOptionPane.showMessageDialog(this, "Login successfull!");
					Dashboard db = new Dashboard(u,this);
					db.setVisible(true);
					this.setVisible(false);
				}else{
					JOptionPane.showMessageDialog(this, "Password incorrect!");
				}
			}else{
				JOptionPane.showMessageDialog(this, "User doesn't exist!");
			}
		}else if(signUpBtn.getText().equals(command)){
			   SignUp su = new SignUp(us,this);
			   su.setVisible(true);
			   this.setVisible(false);
		}else{}
    }

}