package Control;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Frame extends JFrame {
	
	/**
	 * Declare Variables
	 */
	static int numbe1, number2, number3, number4;
	static String sign;
	
	int checkerValue = 0;
	
	JButton one, two, three, four = new JButton("4"), five= new JButton("5") ;
	JButton six = new JButton("6"), seven = new JButton("7"), eight = new JButton("8"), nine = new JButton("9");
	JButton zero = new JButton("0"), comma= new JButton(","), plusMinus = new JButton("+-") ;
	JButton ce = new JButton("CE"), c= new JButton("C"), sqr = new JButton("x²") ;
	JButton plus = new JButton("+"), minus = new JButton("-"), divide = new JButton("÷"), multiply = new JButton("x"), eq = new JButton("=");
	Panels Numbering, Display;
	TextField textNum;

	
	
	public Frame()
	{
		setTitle("TfamCalculator");
		setSize(300,400);
		///////////////////////////
		Numbering = new Panels();
		Display = new Panels();
		textNum = new TextField("",15);
		textNum.setFont(new Font("Serif",Font.PLAIN,25));
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		
		//Panel for buttons
		JPanel pan = new JPanel(); 
		SetUpPanels(pan);
		
		//Creating panel for display
		Display.setSize(200, 200);
		Display.setBorder(new LineBorder(Color.red));
		Display.add(textNum);
		
		//Calling button function
		setNumberFunction();
		setVisible(true);	

	}
	/**
	 * Set up a function to Create Panel
	 */
	public void SetUpPanels(JPanel pan)
	{
		pan.setSize(400, 500);
		pan.setLayout(new GridLayout(5,5));
		
		pan.setBorder(new LineBorder(Color.BLUE));
		pan.add(ce);pan.add(c);pan.add(sqr);pan.add(divide);
		pan.add(nine);pan.add(eight);pan.add(seven);pan.add(multiply);
		pan.add(four);pan.add(five);pan.add(six);pan.add(minus);
		pan.add(one);pan.add(two);pan.add(three);pan.add(plus);
		pan.add(plusMinus);pan.add(zero);pan.add(comma);pan.add(eq);
		
		
		//pan.add(Numbering, BorderLayout.SOUTH);
		add(pan, BorderLayout.CENTER);
		add(Display, BorderLayout.NORTH);
	}
	/**
	 * Function to implement button functions
	 */
	public void setNumberFunction()
	{
		//
		sqr.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String number = textNum.getText();
				int num = Integer.parseInt(number);
				textNum.setText(num*num +"");
				checkerValue=1;
			}
			
		});
		
		//Clear Textbox
		ce.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				textNum.setText("");
			}
			
		});
		
		///Numbers
		comma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(checkerValue==1)
				{
					textNum.setText(".");
				}
				else {
					String number = textNum.getText();
					textNum.setText(number + ".");
					
				}
				checkerValue=0;
			}
			
		});
		
		zero.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(checkerValue==1)
				{
					textNum.setText("0");
				}
				else {
					String number = textNum.getText();
					textNum.setText(number + "0");
					
				}
				checkerValue=0;
			}
			
		});
		
		one.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(checkerValue==1)
				{
					textNum.setText("1");
				}
				else {
					String number = textNum.getText();
					textNum.setText(number + "1");
					
				}
				checkerValue=0;
			}
			
		});


		two.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(checkerValue==1)
				{
					textNum.setText("2");
				}
				else {
					String number = textNum.getText();
					textNum.setText(number + "2");
					
				}
				checkerValue=0;
			}
			
		});


		three.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(checkerValue==1)
				{
					textNum.setText("3");
				}
				else {
					String number = textNum.getText();
					textNum.setText(number + "3");
					
				}
				checkerValue=0;
			}
			
		});
		
		four.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(checkerValue==1)
				{
					textNum.setText("4");
				}
				else {
					String number = textNum.getText();
					textNum.setText(number + "4");
					
				}
				checkerValue=0;
			}
			
		});
		
		five.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(checkerValue==1)
				{
					textNum.setText("5");
				}
				else {
					String number = textNum.getText();
					textNum.setText(number + "5");
					
				}
				checkerValue=0;
			}
			
		});

		six.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(checkerValue==1)
				{
					textNum.setText("6");
				}
				else {
					String number = textNum.getText();
					textNum.setText(number + "6");
					
				}
				checkerValue=0;
			}
			
		});

		seven.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(checkerValue==1)
				{
					textNum.setText("7");
				}
				else {
					String number = textNum.getText();
					textNum.setText(number + "7");
					
				}
				checkerValue=0;
			}
			
		});

		eight.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(checkerValue==1)
				{
					textNum.setText("8");
				}
				else {
					String number = textNum.getText();
					textNum.setText(number + "8");
					
				}
				checkerValue=0;
			}
			
		});

		nine.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(checkerValue==1)
				{
					textNum.setText("9");
				}
				else {
					String number = textNum.getText();
					textNum.setText(number + "9");
					
				}
				checkerValue=0;
			}
			
		});

		///symbols
		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//numbe1 =Integer.parseInt(textNum.getText());
				textNum.setText(textNum.getText() + " + " );
				
				sign = "+";
			}
			
		});
		
		
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//numbe1 =Integer.parseInt(textNum.getText());
				textNum.setText(textNum.getText() + " - " );
				
				sign = "-";
			}
			
		});
		
		multiply.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//numbe1 =Integer.parseInt(textNum.getText());
				textNum.setText(textNum.getText() + " x " );
				
				sign = "*";
			}
			
		});
		
		divide.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				textNum.setText(textNum.getText() + " / " );
				sign="/";
			}
			
		});
		
		

		
		eq.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				String numb = textNum.getText();
				String[] num = numb.split(" ");
				
				
				if(sign.equals("+"))
				{
					if(num[0].contains(".") || num[2].contains("."))
					{
						textNum.setText(Double.parseDouble(num[0]) + Double.parseDouble(num[2])+"");
					}else
					{
						textNum.setText(Integer.parseInt(num[0]) + Integer.parseInt(num[2])+"");
					}
					
				}else if(sign.equals("-"))
				{
					if(num[0].contains(".") || num[2].contains("."))
					{
						textNum.setText(Double.parseDouble(num[0]) - Double.parseDouble(num[2])+"");
					}else
					{
						textNum.setText(Integer.parseInt(num[0]) - Integer.parseInt(num[2])+"");
					}
				}else if(sign.equals("*"))
				{
					if(num[0].contains(".") || num[2].contains("."))
					{
						textNum.setText(Double.parseDouble(num[0]) * Double.parseDouble(num[2])+"");
					}else
					{
						textNum.setText(Integer.parseInt(num[0]) * Integer.parseInt(num[2])+"");
					}
				}else if(sign.equals("/"))
				{
					float d1 =Float.parseFloat(num[0]);
					float d2 = Float.parseFloat(num[2]);
					float dv=  d1/d2;
					//float dv = 5f/3f;
					textNum.setText(dv+"");
					
					//System.out.println(dv);
				}
				
				checkerValue=1;
					
			}
			
		});
	}
	
}
