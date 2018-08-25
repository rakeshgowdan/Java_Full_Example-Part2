package Com.niit.swing;
import javax.swing.*;  

public class BasicSwing extends JFrame 
{   //inheriting JFrame  
	JFrame f;  
	BasicSwing(){  
	JButton b=new JButton("click me");//create button  
	b.setBounds(130,100,100, 40);  
	          
	add(b);//adding button on frame  
	setSize(400,200);  
	setLayout(null);  
	setVisible(true);  
}  
	public static void main(String[] args)
	{  
	new BasicSwing();  
	}
}  