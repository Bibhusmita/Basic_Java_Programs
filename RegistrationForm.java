

import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;
 
class RegistrationForm{

 static JTextField name_txt ;
 static JTextField fname_txt;
 static JRadioButton male;
 static JRadioButton female;
 static JComboBox day;
 static JComboBox month;
 static JComboBox year;
 static JTextArea add_txtArea;
 static JTextField phone_txt;
 static JTextField email_txt;
 static JCheckBox chkbox;
 static JButton submit_btn;
 static JTextArea output_txtArea;
 static JTextField username_txt;
 static JPasswordField pwd_txt;
 
 
 public static void main(String args[])
 {
	 
	 JFrame frame=new JFrame("Registration Form");  
	 frame.setVisible(true);      
	 frame.setBounds(200,100,700,900 );    
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	 
	  
	 Container c=frame.getContentPane();   
	 c.setLayout(null);    
	 c.setBackground(Color.cyan);     
	 
	 /*---------------------------------- Creating JLabel for Heading Text ------------------------------------------- */
	 
	 Font f=new Font("Cambria",Font.BOLD,20);   // Creating font style and size for heading
	 
	 
	 JLabel heading_lbl=new JLabel();
	 heading_lbl.setBounds(250,5,200,40);
	 heading_lbl.setText("<html><font><u><b>Registration Form</b></u></html>"); 
	 
	 heading_lbl.setFont(f);
	 
	 /* ----------------------------------- Creating Global Font style for all components ------------------------------ */
	 
	 Font f1=new Font("Cambria",Font.BOLD,14);
	 
	 /* ----------------------------------- Creating components for Registration details ---------------------------------- */
	 
	
	 JLabel name_lbl=new JLabel("Name : ");
	 name_lbl.setBounds(50,80,100,30); 
	 
	
	 name_txt=new JTextField();
	 name_txt.setBounds(180,80,180,30);  
	 
	
	 JLabel fname_lbl=new JLabel("Father's Name : ");
	 fname_lbl.setBounds(50,120,150,30);  
	 
	
	 fname_txt=new JTextField();
	 fname_txt.setBounds(180,120,180,30);
	 
	
	 JLabel gender_lbl=new JLabel("Gender : ");
	 gender_lbl.setBounds(50,160,150,30);   
	 
	
	 Cursor cur=new Cursor(Cursor.HAND_CURSOR); 
	 
	 
	 male=new JRadioButton("Male");
	 male.setBounds(180,160,70,30);
	 male.setBackground(Color.cyan);
	 male.setCursor(cur);
	 
	
	 female=new JRadioButton("Female");
	 female.setBounds(280,160,80,30);
	 female.setBackground(Color.cyan);
	 female.setCursor(cur);
	 
	
	 ButtonGroup gender_grp=new ButtonGroup();
	 gender_grp.add(male);    // adding male radio button in the ButtonGroup
	 gender_grp.add(female);    // adding female radio button in the ButtonGroup
	 
	 
	 JLabel dob_lbl=new JLabel("Date of Birth : ");
	 dob_lbl.setBounds(50,200,100,30); 
	 

	 String day_arr[]=new String[31];
	 for(int i=1;i<=31;i++)
	 day_arr[i-1]=Integer.toString(i); 
	 day=new JComboBox(day_arr);
	 day.setBounds(180,200,40,30);
	 
	 
	 String month_arr[]={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec" }; 
	 month=new JComboBox(month_arr);
	 month.setBounds(230,200,60,30);
	 
	 String year_arr[]=new String[70];
	 for(int i=1951;i<=2020;i++)
	 year_arr[i-1951]=Integer.toString(i);
	 year=new JComboBox(year_arr);
	 year.setBounds(300,200,60,30);
	 
	 JLabel add_lbl=new JLabel("Address : ");
	 add_lbl.setBounds(50,240,100,30); 
	 
	 
	 add_txtArea= new JTextArea();
	 add_txtArea.setBounds(180,240,180,100);
	 
	 
	 JLabel phone_lbl=new JLabel("Phone No. : ");
	 phone_lbl.setBounds(50,350,100,30);
	 
	
	 phone_txt=new JTextField();
	 phone_txt.setBounds(180,350,180,30);
	 
	
	 JLabel email_lbl=new JLabel("Email : ");
	 email_lbl.setBounds(50,390,100,30);
	 
	
	 email_txt=new JTextField();
	 email_txt.setBounds(180,390,180,30); 

	 JLabel username = new JLabel("Username :");
	 username.setBounds(50,430,100,30);

	 username_txt = new JTextField();
	 username_txt.setBounds(180,430,180,30);

	 JLabel password = new JLabel("Password :");
	 password.setBounds(50,470,100,30);

	 pwd_txt = new JPasswordField();
	 pwd_txt.setBounds(180,470,180,30);
	 
	     
	 chkbox=new JCheckBox("I accept the terms and conditions");
	 chkbox.setBounds(50,510,300,30);
	 chkbox.setBackground(Color.cyan);
	 
	 
	 submit_btn=new JButton("Submit");
	 submit_btn.setBounds(180,580,120,40);
	 submit_btn.setCursor(cur);  // Applying hand cursor on the button
	 
	 
	 submit_btn.addActionListener(new ActionListener(){
	 public void actionPerformed(ActionEvent event){
	 submit_action(event); 
	 } 
	 });
	 
	 
	 
	 output_txtArea=new JTextArea();
	 output_txtArea.setBounds(380,80,260,320);
	 
	 name_lbl.setFont(f1);
	 fname_lbl.setFont(f1);
	 gender_lbl.setFont(f1);
	 dob_lbl.setFont(f1);
	 add_lbl.setFont(f1);
	 phone_lbl.setFont(f1);
	 email_lbl.setFont(f1);
	 username.setFont(f1);
	 password.setFont(f1);
	 
	 name_txt.setFont(f1);
	 fname_txt.setFont(f1);
	 male.setFont(f1);
	 female.setFont(f1);
	 add_txtArea.setFont(f1);
	 phone_txt.setFont(f1);
	 email_txt.setFont(f1);
	 chkbox.setFont(f1);
	 submit_btn.setFont(f1);
	 output_txtArea.setFont(f1);
	 username_txt.setFont(f1);

	 
	 c.add(password);
	 c.add(heading_lbl); 
	 c.add(name_lbl); 
	 c.add(fname_lbl);
	 c.add(gender_lbl);
	 c.add(male);
	 c.add(female);
	 c.add(dob_lbl);
	 c.add(add_lbl);
	 c.add(phone_lbl);
	 c.add(email_lbl);
	 c.add(username);
	 
	 
	 c.add(name_txt);
	 c.add(name_txt);
	 c.add(fname_txt);
	 c.add(day);
	 c.add(month);
	 c.add(year);
	 c.add(add_txtArea);
	 c.add(phone_txt);
	 c.add(email_txt);
	 c.add(chkbox);
	 c.add(submit_btn);
	 c.add(output_txtArea); 
	 c.add(username_txt);
	 c.add(pwd_txt);
 }
 
 
 public static void submit_action(ActionEvent event)
 {
	 if(chkbox.isSelected()==true)
	 {
		 String name=name_txt.getText();
		 String fname=fname_txt.getText();
		 String gender="Male";
		 if(female.isSelected()==true)
		 gender="Female";
		 String day_name=(String)day.getSelectedItem();
		 String month_name=(String)month.getSelectedItem();
		 String year_name=(String)year.getSelectedItem();
		 String add=add_txtArea.getText();
		 String phone=phone_txt.getText();
		 String email=email_txt.getText();
		 String uname = username_txt.getText();
		 
		 
		 // displaying value in the JTextArea
		 output_txtArea.setText(" Name :   " +name + "\n Father's Name :  " +fname + "\n Gender :   "+gender +
		                                         "\n Date of Birth :   "+day_name + "  "+month_name + " " +year_name +  
		 "\n Address :  "+add + " \n Phone no :  "+phone + 
		 "\n Email :  "+email + "\n Username :  "+uname);
		 
	 }
	 else
	 {
	 		output_txtArea.setText("Please accept the terms and condition");
	 }
	 
 }
 
}
