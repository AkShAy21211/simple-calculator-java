package calculator_java_project;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;


public class Calculator implements ActionListener{
	
	JFrame jf;
	JLabel displayLable;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bclr;
	static double oldValue=0,newValue=0,result=0;
	
	static String Operator;
	
	
	
	
	
	
	public Calculator()
	{
		jf=new JFrame("CALCULATOR");

		jf.setSize(500,650);
		jf.getContentPane().setBackground(Color.black);
		jf.setVisible(true);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);

	
	

		//object creation for the components
		
		displayLable=new JLabel("",SwingConstants.RIGHT);
		displayLable.setBackground(Color.GRAY);
		displayLable.setOpaque(true);
		displayLable.setBounds(50,50,380,40);
		displayLable.setForeground(Color.white);
		jf.add(displayLable);
	

		
	
		b1=new  JButton("1");
		b1.setFont(new Font(null, Font.BOLD,15));

		b2=new  JButton("2");
		b2.setFont(new Font(null, Font.BOLD,15));

		b3=new  JButton("3");
		b3.setFont(new Font(null, Font.BOLD,15));

		b4=new  JButton("4");
		b4.setFont(new Font(null, Font.BOLD,15));

		b5=new  JButton("5");
		b5.setFont(new Font(null, Font.BOLD,15));

		b6=new  JButton("6");
		b6.setFont(new Font(null, Font.BOLD,15));

		b7=new  JButton("7");
		b7.setFont(new Font(null, Font.BOLD,15));

		b8=new  JButton("8");
		b8.setFont(new Font(null, Font.BOLD,15));

		b9=new  JButton("9");
		b9.setFont(new Font(null, Font.BOLD,15));

		b0=new  JButton("0");
		b0.setFont(new Font(null, Font.BOLD,15));

		bdiv=new  JButton("/");
		bdiv.setFont(new Font(null, Font.BOLD,15));

		bmul=new  JButton("x");
		bmul.setFont(new Font(null, Font.BOLD,15));

		bsub=new  JButton("-");
		bsub.setFont(new Font(null, Font.BOLD,15));

		badd=new  JButton("+");
		badd.setFont(new Font(null, Font.BOLD,15));

		bdec=new  JButton(".");
		bdec.setFont(new Font(null, Font.BOLD,25));

		beq=new  JButton("=");
		beq.setFont(new Font(null, Font.BOLD,15));

		bclr=new  JButton("clear");
		bclr.setFont(new Font(null, Font.BOLD,15));

		
		
		
		//locations of each components in the frame and add those to frame
		
		b7.setBounds(50,130,80,80);
		b7.isCursorSet();
	


		jf.add(b7);
		b8.setBounds(150,130,80,80);
		jf.add(b8);
		b9.setBounds(250,130,80,80);
		jf.add(b9);
		b4.setBounds(50,230,80,80);
		jf.add(b4);
		b5.setBounds(150,230,80,80);
		jf.add(b5);
		b6.setBounds(250,230,80,80);
		jf.add(b6);
		b1.setBounds(50,330,80,80);
		jf.add(b3);
		b2.setBounds(150,330,80,80);
		jf.add(b2);
		b3.setBounds(250,330,80,80);
		jf.add(b1);
		bdec.setBounds(50,430,80,80);
		jf.add(bdec);
		b0.setBounds(150,430,80,80);
		jf.add(b0);
		beq.setBounds(250,430,80,80);
		jf.add(beq);
		bdiv.setBounds(350,130,80,80);
		jf.add(bdiv);
		bmul.setBounds(350,230,80,80);
		jf.add(bmul);
		bsub.setBounds(350,330,80,80);
		jf.add(bsub);
		badd.setBounds(350,430,80,80);
		jf.add(badd);
		bclr.setBounds(200,550,80,30);
		jf.add(bclr);
	
		
		//Add actionListener to all the buttons
		
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		bdiv.addActionListener(this);
		bmul.addActionListener(this);
		bsub.addActionListener(this);
		badd.addActionListener(this);
		bdec.addActionListener(this);
		beq.addActionListener(this);
		bclr.addActionListener(this);


		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

	
		
		
		if(e.getSource()==b1)
		{
			displayLable.setText(displayLable.getText().concat("1"));
		}
		if(e.getSource()==b2)
		{
			displayLable.setText(displayLable.getText().concat("2"));
		}
		if(e.getSource()==b3)
		{
			displayLable.setText(displayLable.getText().concat("3"));
		}
		if(e.getSource()==b4)
		{
			displayLable.setText(displayLable.getText().concat("4"));
		}
		if(e.getSource()==b5)
		{
			displayLable.setText(displayLable.getText().concat("5"));
		}
		if(e.getSource()==b6)
		{
			displayLable.setText(displayLable.getText().concat("6"));
		}
		if(e.getSource()==b7)
		{
			displayLable.setText(displayLable.getText().concat("7"));
		}
		if(e.getSource()==b8)
		{
			displayLable.setText(displayLable.getText().concat("8"));
		}
		if(e.getSource()==b9)
		{
			displayLable.setText(displayLable.getText().concat("9"));
		}
		if(e.getSource()==b0)
		{
			displayLable.setText(displayLable.getText().concat("0"));
		}
		
		if(e.getSource()==bdec){
			displayLable.setText(displayLable.getText().concat("."));
			}
		
		
		
		
		
		if(e.getSource()==badd)
		{
			oldValue=Double.parseDouble(displayLable.getText());
			
			Operator="+";
			displayLable.setText("");
		}
		if(e.getSource()==bsub)
		{
			oldValue=Double.parseDouble(displayLable.getText());
			
			Operator="-";
			displayLable.setText("");
		}
		if(e.getSource()==bmul)
		{
			oldValue=Double.parseDouble(displayLable.getText());
		

			Operator="*";
			displayLable.setText("");
		}
		if(e.getSource()==bdiv)
		{
			oldValue=Double.parseDouble(displayLable.getText());
			
			Operator="/";
			displayLable.setText("");
		}
		if(e.getSource()==beq)
		{
			
			
			newValue=Double.parseDouble(displayLable.getText());

			switch (Operator) {
			case "+": result=oldValue+newValue;
			      break;
			case "-": result=oldValue-newValue;
			      break;
			case "*": result=oldValue*newValue;
			      break;
			case "/": result=oldValue/newValue;
			      break;
			default :result=0;
				
				
			
			
			}
			displayLable.setText(""+result);
		}
		if(e.getSource()==bclr)
		{
			displayLable.setText("");
		}
		}

	
	
	
	public static void main(String[] args) {
		new Calculator();
	}
	


}
