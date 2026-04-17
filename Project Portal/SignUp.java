import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp extends JFrame implements ActionListener{
	JPanel panel;
	JLabel userLabel, passwordLabel,idLabel, deptLabel;
	JTextField userTF,idTF;
	JPasswordField passwordTF;
	JButton signUpBtn,backBtn;
	JRadioButton r1,r2;
	ButtonGroup bg;
	Users us;
	Portal p;
	
	public SignUp(Users us,Portal p){
		super("Login");
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.p = p;
		this.us = us;
		
		
		panel = new JPanel();
		panel.setLayout(null);
		
		userLabel = new JLabel("User name: "); 
		userLabel.setBounds(50,100,100,30);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(120,100,150,30);
		panel.add(userTF);
		
		idLabel = new JLabel("ID: "); 
		idLabel.setBounds(80,140,100,30);
		panel.add(idLabel);
		
		idTF = new JTextField();
		idTF.setBounds(120,140,150,30);
		panel.add(idTF);
		
		passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(50,180,150,30);
		panel.add(passwordLabel);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(120,180,150,30);
		passwordTF.setEchoChar('*');
		panel.add(passwordTF);
	
			
		deptLabel = new JLabel("Dept: ");
		deptLabel.setBounds(80,220,150,30);
		panel.add(deptLabel);


		r1 = new JRadioButton("CSE");
		r1.setBounds(120,220,60,30);
		r1.setFocusable(false);
		panel.add(r1);
		r2 = new JRadioButton("EEE");
		r2.setBounds(180,220,60,30);
		r2.setFocusable(false);
		panel.add(r2);
		
		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		signUpBtn = new JButton("Sign Up");
		signUpBtn.setBounds(150,260,100,25);
		signUpBtn.setForeground(Color.BLACK);
		signUpBtn.setFocusable(false);
		signUpBtn.addActionListener(this);
		signUpBtn.setBorder(null);
		panel.add(signUpBtn);
		
		backBtn = new JButton("Back");
		backBtn.setBounds(300,10,70,30);
		backBtn.setFocusable(false);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		this.add(panel);
		//this.setVisible(true);
	}
	

	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		if(signUpBtn.getText().equals(command)){
			String name="", pass="", id="", dept="";
			
			String myPass="";
			
			name = userTF.getText();
			pass = passwordTF.getText();
			id = idTF.getText();
			
			if(r1.isSelected()){ dept = "CSE";}
			else if(r2.isSelected()){ dept = "EEE";}
			else{}
		
			
			if(!name.isEmpty() && !pass.isEmpty() && !id.isEmpty() && !dept.isEmpty()){
				User u = new User(name,pass,id,dept);
				us.addUser(u);
				JOptionPane.showMessageDialog(this, "Sign up successfull. Please login to continue.");
				p.setVisible(true);
				this.setVisible(false);
			}else{
				JOptionPane.showMessageDialog(this, "Something is empty!");
			}
		}else if (backBtn.getText().equals(command)){
			p.setVisible(true);
			this.setVisible(false);
		}
	}
	
}