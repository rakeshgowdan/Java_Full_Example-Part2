package Com.niit.Extends;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class ThreadExtendsExample extends Thread {
  //Countdown timer Example
	 
	 JTextField text;
	 JLabel Label;
	 JFrame frame;
	 
	 public void run()
	 {
		 //provides implementation of timer
		 buildGUI();
	 }
	 
	 void display()
	 {
		 for(int i=60;i>=60;i--)
		 {
			 try
			 {
				 Thread.sleep(4000);
				 String s=Integer.toString(i);
				 text.setText(" "+s+"seconds to go..");
			 }
				 catch(Exception e)
				 {
					System.out.println(e); 
				 }
			 }
		 JOptionPane.showMessageDialog(frame, "Time UP");
		 text.setText("");
		 text.setEnabled(false);
	 }
public void buildGUI()
{
	frame=new JFrame("Count Down Timer");
	JPanel p=new JPanel();
	Label=new JLabel("");
	text=new JTextField(15);
	text.setEnabled(false);
	Font F=new Font("Verdana",0,18);
	text.setFont(F);
	text.setBackground(Color.BLACK);
	p.setBackground(Color.blue);
	frame.add(p);
	p.add(text);
	p.add(Label);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(350,150);
	frame.setResizable(false);
	display();
	
	
}
public static void main(String[] args) {
	ThreadExtendsExample object=new ThreadExtendsExample();
	object.start();
	//start method begins the exceution
	
}
}