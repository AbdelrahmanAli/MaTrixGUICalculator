import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


public class View extends JFrame {

	private JPanel contentPane;
	private static Operation[] history = new Operation[5];
	private static int first,last; 
	private static String operand_1 , operand_2;
	private static int operation;
	private static boolean lastReachedEnd;
	private static int equationNextIndex,equationPrevIndex;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		operation = -1; // no operation is settled
		operand_1 = "";
		operand_2 = "";
		last = -1;
		first = equationNextIndex = equationPrevIndex=  0;
		lastReachedEnd = false;
		
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					View frame = new View();
					frame.setResizable(false);
					frame.setVisible(true);
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public View() 
	{
		setTitle("MaTrix Calculator");
		setIconImage(Toolkit.getDefaultToolkit().getImage(View.class.getResource("/pics/cal.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 282, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		final JCheckBox inputMethod = new JCheckBox("Evaluate From Text Box");
		
		final JTextArea inputText = new JTextArea();
		inputText.setFont(new Font("Courier New", Font.PLAIN, 14));
		
		final JLabel screen = new JLabel("",SwingConstants.CENTER);
		screen.setOpaque(true); // stop the transparency of the label to add a background color
		screen.setBackground(SystemColor.inactiveCaption);
		screen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		
		// create a line border with the specified color and width
        Border labelBorder = BorderFactory.createLineBorder(Color.WHITE, 2);
        Border textFieldborder = BorderFactory.createLineBorder(SystemColor.inactiveCaption, 2);
     // set the border of this component
        screen.setBorder(labelBorder);
        inputText.setBorder(textFieldborder);


		
		JButton ac = new JButton("AC");
		ac.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				screen.setText("");
				inputText.setText("");
				
				operation = -1;
				operand_1 = "";
				operand_2 = "";
			}
		});
		ac.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton nine = new JButton("9");
		nine.setFont(new Font("Tahoma", Font.PLAIN, 10));
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(operand_1.length()==0)
				{
					screen.setText("");
					inputText.setText("");
				}
				
				// 1st operand
				if(operation == -1) operand_1+="9";
				// 2nd operand
				else operand_2 += "9";
				
				if(inputMethod.isSelected())
				{
					screen.setText("");
					inputText.setText(inputText.getText() + "9");
				}
				else screen.setText(screen.getText() + "9");
			}
		});
		
		JButton eight = new JButton("8");
		eight.setFont(new Font("Tahoma", Font.PLAIN, 10));
		eight.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(operand_1.length()==0)
				{
					screen.setText("");
					inputText.setText("");
				}
				
				// 1st operand
				if(operation == -1) operand_1+="8";
				// 2nd operand
				else operand_2 += "8";
				
				if(inputMethod.isSelected())
				{
					screen.setText("");
					inputText.setText(inputText.getText() + "8");
				}
				else screen.setText(screen.getText() + "8");
			}
		});
		
		JButton seven = new JButton("7");
		seven.setFont(new Font("Tahoma", Font.PLAIN, 10));
		seven.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(operand_1.length()==0)
				{
					screen.setText("");
					inputText.setText("");
				}
				
				// 1st operand
				if(operation == -1) operand_1+="7";
				// 2nd operand
				else operand_2 += "7";
				
				if(inputMethod.isSelected())
				{	
					screen.setText("");
					inputText.setText(inputText.getText() + "7");
				}
				else screen.setText(screen.getText() + "7");
			}
		});
		
		JButton six = new JButton("6");
		six.setFont(new Font("Tahoma", Font.PLAIN, 10));
		six.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(operand_1.length()==0)
				{
					screen.setText("");
					inputText.setText("");
				}
				
				// 1st operand
				if(operation == -1) operand_1+="6";
				// 2nd operand
				else operand_2 += "6";
				
				if(inputMethod.isSelected())
				{
					screen.setText("");
					inputText.setText(inputText.getText() + "6");
				}
				else screen.setText(screen.getText() + "6");
			}
		});
		
		JButton five = new JButton("5");
		five.setFont(new Font("Tahoma", Font.PLAIN, 10));
		five.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(operand_1.length()==0)
				{
					screen.setText("");
					inputText.setText("");
				}
				
				// 1st operand
				if(operation == -1) operand_1+="5";
				// 2nd operand
				else operand_2 += "5";
				
				if(inputMethod.isSelected())
				{
					screen.setText("");
					inputText.setText(inputText.getText() + "5");
				}
				else screen.setText(screen.getText() + "5");
			}
		});
		
		JButton four = new JButton("4");
		four.setFont(new Font("Tahoma", Font.PLAIN, 10));
		four.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(operand_1.length()==0)
				{
					screen.setText("");
					inputText.setText("");
				}
				
				// 1st operand
				if(operation == -1) operand_1+="4";
				// 2nd operand
				else operand_2 += "4";
				
				if(inputMethod.isSelected())
				{
					screen.setText("");
					inputText.setText(inputText.getText() + "4");
				}
				else screen.setText(screen.getText() + "4");
			}
		});
		
		JButton three = new JButton("3");
		three.setFont(new Font("Tahoma", Font.PLAIN, 10));
		three.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(operand_1.length()==0)
				{
					screen.setText("");
					inputText.setText("");
				}
				
				// 1st operand
				if(operation == -1) operand_1+="3";
				// 2nd operand
				else operand_2 += "3";
				
				if(inputMethod.isSelected())
				{
					screen.setText("");
					inputText.setText(inputText.getText() + "3");
				}
				else screen.setText(screen.getText() + "3");
			}
		});
		
		JButton two = new JButton("2");
		two.setFont(new Font("Tahoma", Font.PLAIN, 10));
		two.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(operand_1.length()==0)
				{
					screen.setText("");
					inputText.setText("");
				}	
				
				// 1st operand
				if(operation == -1) operand_1+="2";
				// 2nd operand
				else operand_2 += "2";
				
				if(inputMethod.isSelected())
				{
					screen.setText("");
					inputText.setText(inputText.getText() + "2");
				}
				else screen.setText(screen.getText() + "2");
			}
		});
		
		JButton one = new JButton("1");
		one.setFont(new Font("Tahoma", Font.PLAIN, 10));
		one.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(operand_1.length()==0)
				{
					screen.setText("");
					inputText.setText("");
				}	
				
				// 1st operand
				if(operation == -1) operand_1+="1";
				// 2nd operand
				else operand_2 += "1";
				
				if(inputMethod.isSelected())
				{
					screen.setText("");
					inputText.setText(inputText.getText() + "1");
				}
				else screen.setText(screen.getText() + "1");
			}
		});
		
		JButton zero = new JButton("0");
		zero.setFont(new Font("Tahoma", Font.PLAIN, 10));
		zero.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(operand_1.length()==0)
				{
					screen.setText("");
					inputText.setText("");
				}
				
				// 1st operand
				if(operation == -1) operand_1+="0";
				// 2nd operand
				else operand_2 += "0";
				
				if(inputMethod.isSelected())
				{
					screen.setText("");
					inputText.setText(inputText.getText() + "0");
				}
				else screen.setText(screen.getText() + "0");
			}
		});
		
		JButton dot = new JButton(".");
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(operand_1.length()==0)
				{
					screen.setText("");
					inputText.setText("");
				}
				
				// 	1st operand
				if(operation==-1)
				{
					if(!operand_1.contains("."))
					{
						operand_1+=".";
						if(inputMethod.isSelected())
						{
							screen.setText("");
							inputText.setText(inputText.getText() + ".");
						}
						else screen.setText(screen.getText() + ".");
					}
				}
				// 	2nd operand
				else
				{
					if(!operand_2.contains("."))
					{
						operand_2 += ".";
						if(inputMethod.isSelected()) inputText.setText(inputText.getText() + ".");
						else screen.setText(screen.getText() + ".");
					}
				}
			}
		});
		
		JButton addition = new JButton("+");
		addition.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				if(operation==-1 && operand_1.length() > 0)
				{
					if(!(operand_1.length()==1 && operand_1.charAt(0)=='-'))
					{
						operation = 0;
						if(inputMethod.isSelected()) inputText.setText(inputText.getText() + " + ");
						else screen.setText(screen.getText() + " + ");
					}
				}
			}
		});
		
		JButton subtraction = new JButton("-");
		subtraction.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(operand_1.equals(""))
				{
					operand_1 += "-";
					
					if(inputMethod.isSelected()) inputText.setText("-");
					else screen.setText("-");
				}
				else if(operand_2.equals("") && operation !=-1)
				{
					operand_2 += "-";
					if(inputMethod.isSelected()) inputText.setText(inputText.getText() + "-");
					else screen.setText(screen.getText() + "-");
				}
				else if(operation == -1)
				{
					if(operand_1.charAt(0)=='-' && operand_1.length()>1)
					{						
						operation = 1;
						if(inputMethod.isSelected()) inputText.setText(inputText.getText() + " - ");
						else screen.setText(screen.getText() + " - ");
					}
					else if(operand_1.charAt(0)!='-')
					{
						operation = 1;
						if(inputMethod.isSelected()) inputText.setText(inputText.getText() + " - ");
						else screen.setText(screen.getText() + " - ");
					}
				}
				
			}
		});
		
		JButton multiplication = new JButton("x");
		multiplication.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				if(operation==-1 && operand_1.length() > 0)
				{
					if(!(operand_1.length()==1 && operand_1.charAt(0)=='-'))
					{
						operation = 2;
						if(inputMethod.isSelected()) inputText.setText(inputText.getText() + " x ");
						else screen.setText(screen.getText() + " x ");
					}
				}
			}
		});
		
		JButton division = new JButton("/");
		division.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(operation==-1 && operand_1.length() > 0)
				{
					if(!(operand_1.length()==1 && operand_1.charAt(0)=='-'))
					{
						operation = 3;
						if(inputMethod.isSelected()) inputText.setText(inputText.getText() + " / ");
						else screen.setText(screen.getText() + " / ");
					}
				}
			}
		});
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				
				if(checkValidation(inputMethod.isSelected() , inputText.getText()))
				{
					Operation evaluateOperation = new Operation(Double.parseDouble(operand_1) , Double.parseDouble(operand_2) , operation);
					
					if(inputMethod.isSelected())
					{
						screen.setText(inputText.getText() + " = " + evaluateOperation.evaluate());
					}
					else
					{
						screen.setText(screen.getText() + " = " + evaluateOperation.evaluate());
					}
					
					
					if(last==4) lastReachedEnd = true;

					//save operation
					history[(last+1)%5] = evaluateOperation;
					
					System.out.println(evaluateOperation.getEquation());

					if(lastReachedEnd)
					{
						 first = (first+1)%5;
						 equationNextIndex = first;
						equationPrevIndex =  last;
					}
					last = (last+1)%5;
					
					operation = -1;
					operand_1 = "";
					operand_2 = "";
				}
				else if(inputMethod.isSelected())
				{
					JOptionPane.showMessageDialog(null,"Invalid Input : "+inputText.getText(),"Error Message",JOptionPane.ERROR_MESSAGE );
					inputText.setText("");
					screen.setText("");
				}
			}
		});
		

		
		
		JButton next = new JButton(">");// from first
		next.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(last!=-1)
				{
					inputText.setText(history[equationNextIndex].getEquation());
					screen.setText(history[equationNextIndex].getEquation()+" = "+history[equationNextIndex].evaluate());
					
					equationPrevIndex = equationNextIndex;
					if(lastReachedEnd) equationNextIndex = (equationNextIndex+1)%5;
					else if(equationNextIndex < last) equationNextIndex++;
					else equationNextIndex = first;
				}
					
			}
		});
		next.setFont(new Font("Tahoma", Font.PLAIN, 7));
		
		JButton prev = new JButton("<"); // from last
		prev.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(last!=-1)
				{
					equationNextIndex = equationPrevIndex;
					equationPrevIndex--;
					if(equationPrevIndex < 0) 
					{
						if(lastReachedEnd)	equationPrevIndex = 4;
						else if(last!=0) equationPrevIndex = last;
						else equationPrevIndex = 0;
					
					}
				
					inputText.setText(history[equationPrevIndex].getEquation());
					screen.setText(history[equationPrevIndex].getEquation() + " = "+history[equationNextIndex].evaluate());
					
				}
			}
		});
		prev.setFont(new Font("Tahoma", Font.PLAIN, 7));
		

		


		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(screen, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(multiplication, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
										.addComponent(prev, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
										.addComponent(division, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(seven, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(eight, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(nine, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(addition))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(next, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(zero, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(one, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
													.addGap(6)
													.addComponent(two, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
											.addGap(6)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(ac, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(three, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(dot, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(four, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addGap(6)
											.addComponent(five, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addGap(6)
											.addComponent(six, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(subtraction, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(inputMethod)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(inputText, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(equal, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(screen, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(multiplication, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(addition, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nine, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
								.addComponent(eight, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
								.addComponent(seven, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(four, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
								.addComponent(five, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
								.addComponent(six, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
								.addComponent(subtraction, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(division, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(one, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
						.addComponent(two, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(three, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addComponent(dot, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(zero, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(prev, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(next, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(ac, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(equal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(inputText, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(inputMethod)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public boolean checkValidation(boolean inputMethod, String input)
	{
		
		int dotCounter = 0;
		
		if(inputMethod && input.length()>2) // get input from text field
		{
			operand_1 = operand_2 ="";
			operation = -1;
			input = input.replaceAll(" ", "");
			input = input.replaceAll("\n", "");
			input = input.replaceAll("\t", "");
			
			
			for(int i = 0 ; i < input.length() ; i++)
			{
				if( (input.charAt(i) > '9' || input.charAt(i) < '0') && input.charAt(i)!='.' && input.charAt(i)!=' ' && input.charAt(i) !='+' && input.charAt(i) !='-' && input.charAt(i) !='/' && input.charAt(i) !='x')
				{
					return false;
				}
			}
			
			
			
			//count operators
			int plus , minus , divided , multi;
			plus = minus = divided = multi = 0;
			for(int i = 0 ; i < input.length() ; i++)
			{
				switch(input.charAt(i))
				{
					case '+':
						plus++;
						break;
					case '-':
						minus++;
						break;
					case '/':
						divided++;
						break;
					case 'x':
						multi++;
						break;
				}
			}
			
			if(plus >1 || multi >1 || divided >1 || minus > 3) return false;
			
			// minus
			if(minus == 3)
			{
				if(input.charAt(0)!='-' || input.charAt(input.length()-1)=='-' ) return false;
				if(input.indexOf('-',input.indexOf('-',1)+1) - input.indexOf('-',1) !=1) return false;
				operation = 1;
			}
			else if(minus == 2)
			{
				int first = input.indexOf('-',0);
				int second = input.indexOf('-',first+1);
				if(second - first == 1)
				{
					if(first == 0) return false;
					else if(second == input.length()-1) return false;
					else operation = 1; //middle
				}
				else if(second == input.length()-1)
				{
					return false;
				}
				else if(first != 0)
				{
					return false;
				}
				else
				{
					operation = 1;
				}
					
			}
			else if(minus == 1)
			{
				if(input.indexOf('-',0) == 0)
				operand_1 +="-";
				else if(input.indexOf('-',0)==input.length()-1)
					return false;
				else
					operation = 1;
			}
			
			//plus
			if(plus==1)
			{
				if(input.indexOf('+',0)==input.length()-1 || input.indexOf('+',0)==0)
					return false;
				else	operation = 0;
			}
			
			//multi
			if(multi==1)
			{
				if(input.indexOf('x',0)==input.length()-1 || input.indexOf('x',0)==0)
					return false;
				else	operation = 2;
			}
			
			//division
			if(divided==1)
			{
				if(input.indexOf('/',0)==input.length()-1 || input.indexOf('/',0)==0)
					return false;
				else	operation = 3;
			}
			
			String[] operands = new String[2];
			switch(operation)
			{
				case 0 : //+
						operands = input.split("\\+");
						operand_1 = operands[0];
						operand_2 = operands[1];
						break;
				case 1 : //-
						if(input.charAt(0)=='-')
						{
							operand_1 = input.substring(0,input.indexOf('-',1));
							operand_2 = input.substring(input.indexOf('-',1)+1,input.length());
						}
						else if(minus == 2)
						{
							operand_1 = input.substring(0,input.indexOf('-',0));
							operand_2 = input.substring(input.indexOf('-',input.indexOf('-',0)+1),input.length());;
						}
						else
						{
							operands = input.split("\\-");
							operand_1 = operands[0];
							operand_2 = operands[1];
						}
						break;
				case 2 :// x
						operands = input.split("x");
						operand_1 = operands[0];
						operand_2 = operands[1];
						break;
				case 3 :// /
						operands = input.split("\\/");
						operand_1 = operands[0];
						operand_2 = operands[1];
						break;
			}
		}
		
		if(operation == -1 || operand_1.length() == 0 || operand_2.length() == 0) return false;
		
		
		dotCounter = 0;
		for(int i = 0 ; i < operand_1.length() ; i++)
		{
			if(i==0 && operand_1.charAt(i)=='-') continue;
			
			if( (operand_1.charAt(i) > '9' || operand_1.charAt(i) < '0') && operand_1.charAt(i)!='.') 
			{
				return false;
			}
			else if(operand_1.charAt(i)=='.')
			{
				dotCounter++;
			}
		}
		
		if(dotCounter > 1) return false;
		
		dotCounter = 0;
		
		for(int i = 0 ; i < operand_2.length() ; i++)
		{
			if(i==0 && operand_2.charAt(i)=='-') continue;
						
			if(	(operand_2.charAt(i) > '9' || operand_2.charAt(i) < '0') && operand_2.charAt(i)!='.')
			{
				return false;
			}
			else if(operand_2.charAt(i)=='.')
			{
				dotCounter++;
			}
		}
		
		if(dotCounter > 1) return false;
		
		return true; // valid
	}
}
