import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quiz
{
	int Result, Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10;
	
	Quiz()
	{
		JFrame f = new JFrame("Assessment Quiz");
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 255));
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel Lbl1 = new JLabel(" Simple Assessment Quiz");
		Lbl1.setForeground(Color.BLACK);
		Lbl1.setFont(new Font("Arial", Font.BOLD, 50));
		Lbl1.setBackground(Color.WHITE);
		Lbl1.setBounds(10, -30, 1520, 200);
		panel.add(Lbl1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setForeground(Color.WHITE);
		panel_1.setBounds(10, 10, 727, 124);
		panel.add(panel_1);
		
		JLabel Qn6 = new JLabel("  6) Do you feel bad about yourself ?");
		Qn6.setFont(new Font("Arial", Font.BOLD, 20));
		Qn6.setBounds(866, 172, 664, 50);
		panel.add(Qn6);
		
		JRadioButton Qn6Op1 = new JRadioButton("Not at all");
		Qn6Op1.setFont(new Font("Arial", Font.BOLD, 15));
		Qn6Op1.setBounds(894, 228, 121, 37);
		panel.add(Qn6Op1);
		
		JRadioButton Qn6Op2 = new JRadioButton("Some Days");
		Qn6Op2.setFont(new Font("Arial", Font.BOLD, 15));
		Qn6Op2.setBounds(1031, 228, 121, 37);
		panel.add(Qn6Op2);
		
		JRadioButton Qn6Op3 = new JRadioButton("Many Days");
		Qn6Op3.setFont(new Font("Arial", Font.BOLD, 15));
		Qn6Op3.setBounds(1173, 228, 121, 37);
		panel.add(Qn6Op3);
		
		JRadioButton Qn6Op4 = new JRadioButton("Very Often");
		Qn6Op4.setFont(new Font("Arial", Font.BOLD, 15));
		Qn6Op4.setBounds(1317, 228, 121, 37);
		panel.add(Qn6Op4);
		
		JLabel Qn7 = new JLabel("  7) Do you have trouble concentrating on everyday tasks ?");
		Qn7.setFont(new Font("Arial", Font.BOLD, 20));
		Qn7.setBounds(866, 293, 609, 50);
		panel.add(Qn7);
		
		JRadioButton Qn7Op1 = new JRadioButton("Not at all");
		Qn7Op1.setFont(new Font("Arial", Font.BOLD, 15));
		Qn7Op1.setBounds(894, 349, 121, 37);
		panel.add(Qn7Op1);
		
		JRadioButton Qn7Op2 = new JRadioButton("Some Days");
		Qn7Op2.setFont(new Font("Arial", Font.BOLD, 15));
		Qn7Op2.setBounds(1031, 349, 121, 37);
		panel.add(Qn7Op2);
		
		JRadioButton Qn7Op3 = new JRadioButton("Many Days");
		Qn7Op3.setFont(new Font("Arial", Font.BOLD, 15));
		Qn7Op3.setBounds(1173, 349, 121, 37);
		panel.add(Qn7Op3);
		
		JRadioButton Qn7Op4 = new JRadioButton("Very Often");
		Qn7Op4.setFont(new Font("Arial", Font.BOLD, 15));
		Qn7Op4.setBounds(1317, 349, 121, 37);
		panel.add(Qn7Op4);
		
		JRadioButton Qn8Op1 = new JRadioButton("Not at all");
		Qn8Op1.setFont(new Font("Arial", Font.BOLD, 15));
		Qn8Op1.setBounds(894, 471, 121, 37);
		panel.add(Qn8Op1);
		
		JLabel Qn8 = new JLabel("  8) Do you get restless or anxious more than usual ?");
		Qn8.setFont(new Font("Arial", Font.BOLD, 20));
		Qn8.setBounds(866, 415, 609, 50);
		panel.add(Qn8);
		
		JRadioButton Qn8Op2 = new JRadioButton("Some Days");
		Qn8Op2.setFont(new Font("Arial", Font.BOLD, 15));
		Qn8Op2.setBounds(1031, 471, 121, 37);
		panel.add(Qn8Op2);
		
		JRadioButton Qn8Op3 = new JRadioButton("Many Days");
		Qn8Op3.setFont(new Font("Arial", Font.BOLD, 15));
		Qn8Op3.setBounds(1173, 471, 121, 37);
		panel.add(Qn8Op3);
		
		JRadioButton Qn8Op4 = new JRadioButton("Very Often");
		Qn8Op4.setFont(new Font("Arial", Font.BOLD, 15));
		Qn8Op4.setBounds(1317, 471, 121, 37);
		panel.add(Qn8Op4);
		
		JLabel Qn9 = new JLabel("  9) Do you get thoughts about self harm or other such things ?");
		Qn9.setFont(new Font("Arial", Font.BOLD, 20));
		Qn9.setBounds(866, 534, 609, 50);
		panel.add(Qn9);
		
		JRadioButton Qn9Op2 = new JRadioButton("Some Days");
		Qn9Op2.setFont(new Font("Arial", Font.BOLD, 15));
		Qn9Op2.setBounds(1031, 590, 121, 37);
		panel.add(Qn9Op2);
		
		JRadioButton Qn9Op3 = new JRadioButton("Many Days");
		Qn9Op3.setFont(new Font("Arial", Font.BOLD, 15));
		Qn9Op3.setBounds(1173, 590, 121, 37);
		panel.add(Qn9Op3);
		
		JRadioButton Qn9Op4 = new JRadioButton("Very Often");
		Qn9Op4.setFont(new Font("Arial", Font.BOLD, 15));
		Qn9Op4.setBounds(1317, 590, 121, 37);
		panel.add(Qn9Op4);
		
		JRadioButton Qn9Op1 = new JRadioButton("Not at all");
		Qn9Op1.setFont(new Font("Arial", Font.BOLD, 15));
		Qn9Op1.setBounds(894, 590, 121, 37);
		panel.add(Qn9Op1);
		
		JLabel Qn10 = new JLabel("  10) If you checked any of the problems, how often do these");
		Qn10.setFont(new Font("Arial", Font.BOLD, 20));
		Qn10.setBounds(866, 659, 609, 50);
		panel.add(Qn10);
		
		JRadioButton Qn10Op1 = new JRadioButton("Not at all");
		Qn10Op1.setFont(new Font("Arial", Font.BOLD, 15));
		Qn10Op1.setBounds(894, 732, 121, 37);
		panel.add(Qn10Op1);
		
		JRadioButton Qn10Op2 = new JRadioButton("Some Days");
		Qn10Op2.setFont(new Font("Arial", Font.BOLD, 15));
		Qn10Op2.setBounds(1031, 732, 121, 37);
		panel.add(Qn10Op2);
		
		JRadioButton Qn10Op3 = new JRadioButton("Many Days");
		Qn10Op3.setFont(new Font("Arial", Font.BOLD, 15));
		Qn10Op3.setBounds(1173, 732, 121, 37);
		panel.add(Qn10Op3);
		
		JRadioButton Qn10Op4 = new JRadioButton("Very Often");
		Qn10Op4.setFont(new Font("Arial", Font.BOLD, 15));
		Qn10Op4.setBounds(1317, 732, 121, 37);
		panel.add(Qn10Op4);
		
		JLabel Qn1 = new JLabel("  1) Do you feel very little interest or pleasure in doing things?");
		Qn1.setFont(new Font("Arial", Font.BOLD, 20));
		Qn1.setBounds(110, 172, 609, 50);
		panel.add(Qn1);
		
		JRadioButton Qn1Op4 = new JRadioButton("Very Often");
		Qn1Op4.setFont(new Font("Arial", Font.BOLD, 15));
		Qn1Op4.setBounds(561, 228, 121, 37);
		panel.add(Qn1Op4);
		
		JRadioButton Qn1Op3 = new JRadioButton("Many Days");
		Qn1Op3.setFont(new Font("Arial", Font.BOLD, 15));
		Qn1Op3.setBounds(417, 228, 121, 37);
		panel.add(Qn1Op3);
		
		JRadioButton Qn1Op2 = new JRadioButton("Some Days");
		Qn1Op2.setFont(new Font("Arial", Font.BOLD, 15));
		Qn1Op2.setBounds(275, 228, 121, 37);
		panel.add(Qn1Op2);
		
		JRadioButton Qn1Op1 = new JRadioButton("Not at all");
		Qn1Op1.setFont(new Font("Arial", Font.BOLD, 15));
		Qn1Op1.setBounds(138, 228, 121, 37);
		panel.add(Qn1Op1);
		
		JLabel Qn2 = new JLabel("  2) Do you feel down or hopeless ?");
		Qn2.setFont(new Font("Arial", Font.BOLD, 20));
		Qn2.setBounds(110, 293, 609, 50);
		panel.add(Qn2);
		
		JRadioButton Qn2Op1 = new JRadioButton("Not at all");
		Qn2Op1.setFont(new Font("Arial", Font.BOLD, 15));
		Qn2Op1.setBounds(138, 349, 121, 37);
		panel.add(Qn2Op1);
		
		JRadioButton Qn2Op3 = new JRadioButton("Many Days");
		Qn2Op3.setFont(new Font("Arial", Font.BOLD, 15));
		Qn2Op3.setBounds(417, 349, 121, 37);
		panel.add(Qn2Op3);
		
		JRadioButton Qn2Op4 = new JRadioButton("Very Often");
		Qn2Op4.setFont(new Font("Arial", Font.BOLD, 15));
		Qn2Op4.setBounds(561, 349, 121, 37);
		panel.add(Qn2Op4);
		
		JRadioButton Qn2Op2 = new JRadioButton("Some Days");
		Qn2Op2.setFont(new Font("Arial", Font.BOLD, 15));
		Qn2Op2.setBounds(275, 349, 121, 37);
		panel.add(Qn2Op2);
		
		JLabel Qn3 = new JLabel("  3) Do you have trouble falling asleep or sleeping too much?");
		Qn3.setFont(new Font("Arial", Font.BOLD, 20));
		Qn3.setBounds(110, 415, 609, 50);
		panel.add(Qn3);
		
		JRadioButton Qn3Op1 = new JRadioButton("Not at all");
		Qn3Op1.setFont(new Font("Arial", Font.BOLD, 15));
		Qn3Op1.setBounds(138, 471, 121, 37);
		panel.add(Qn3Op1);
		
		JRadioButton Qn3Op2 = new JRadioButton("Some Days");
		Qn3Op2.setFont(new Font("Arial", Font.BOLD, 15));
		Qn3Op2.setBounds(275, 471, 121, 37);
		panel.add(Qn3Op2);
		
		JRadioButton Qn3Op3 = new JRadioButton("Many Days");
		Qn3Op3.setFont(new Font("Arial", Font.BOLD, 15));
		Qn3Op3.setBounds(417, 471, 121, 37);
		panel.add(Qn3Op3);
		
		JRadioButton Qn3Op4 = new JRadioButton("Very Often");
		Qn3Op4.setFont(new Font("Arial", Font.BOLD, 15));
		Qn3Op4.setBounds(561, 471, 121, 37);
		panel.add(Qn3Op4);
		
		JLabel Qn4 = new JLabel("  4) Do you feel tired all the time?");
		Qn4.setFont(new Font("Arial", Font.BOLD, 20));
		Qn4.setBounds(110, 534, 609, 50);
		panel.add(Qn4);
		
		JRadioButton Qn4Op2 = new JRadioButton("Some Days");
		Qn4Op2.setFont(new Font("Arial", Font.BOLD, 15));
		Qn4Op2.setBounds(275, 590, 121, 37);
		panel.add(Qn4Op2);
		
		JRadioButton Qn4Op3 = new JRadioButton("Many Days");
		Qn4Op3.setFont(new Font("Arial", Font.BOLD, 15));
		Qn4Op3.setBounds(417, 590, 121, 37);
		panel.add(Qn4Op3);
		
		JRadioButton Qn4Op4 = new JRadioButton("Very Often");
		Qn4Op4.setFont(new Font("Arial", Font.BOLD, 15));
		Qn4Op4.setBounds(561, 590, 121, 37);
		panel.add(Qn4Op4);
		
		JRadioButton Qn4Op1 = new JRadioButton("Not at all");
		Qn4Op1.setFont(new Font("Arial", Font.BOLD, 15));
		Qn4Op1.setBounds(138, 590, 121, 37);
		panel.add(Qn4Op1);
		
		JLabel Qn5 = new JLabel("  5) Do you feel like overeating or not eating at all?");
		Qn5.setFont(new Font("Arial", Font.BOLD, 20));
		Qn5.setBounds(110, 659, 609, 50);
		panel.add(Qn5);
		
		JRadioButton Qn5Op1 = new JRadioButton("Not at all");
		Qn5Op1.setFont(new Font("Arial", Font.BOLD, 15));
		Qn5Op1.setBounds(138, 715, 121, 37);
		panel.add(Qn5Op1);
		
		JRadioButton Qn5Op2 = new JRadioButton("Some Days");
		Qn5Op2.setFont(new Font("Arial", Font.BOLD, 15));
		Qn5Op2.setBounds(275, 715, 121, 37);
		panel.add(Qn5Op2);
		
		JRadioButton Qn5Op3 = new JRadioButton("Many Days");
		Qn5Op3.setFont(new Font("Arial", Font.BOLD, 15));
		Qn5Op3.setBounds(417, 715, 121, 37);
		panel.add(Qn5Op3);
		
		JRadioButton Qn5Op4 = new JRadioButton("Very Often");
		Qn5Op4.setFont(new Font("Arial", Font.BOLD, 15));
		Qn5Op4.setBounds(561, 715, 121, 37);
		panel.add(Qn5Op4);
		
		JLabel Lbl2 = new JLabel("");
		Lbl2.setBounds(876, 10, 212, 124);
		Image img1 = new ImageIcon(this.getClass().getResource("Mental Health.jfif")).getImage();
		Lbl2.setIcon(new ImageIcon(img1));
		//panel.add(Lbl2);
		// Need better image
		
		ButtonGroup Question1 = new ButtonGroup();
		Question1.add(Qn1Op1);
		Question1.add(Qn1Op2);
		Question1.add(Qn1Op3);
		Question1.add(Qn1Op4);
		
		ButtonGroup Question2 = new ButtonGroup();
		Question2.add(Qn2Op1);
		Question2.add(Qn2Op2);
		Question2.add(Qn2Op3);
		Question2.add(Qn2Op4);
		
		ButtonGroup Question3 = new ButtonGroup();
		Question3.add(Qn3Op1);
		Question3.add(Qn3Op2);
		Question3.add(Qn3Op3);
		Question3.add(Qn3Op4);
		
		ButtonGroup Question4 = new ButtonGroup();
		Question4.add(Qn4Op1);
		Question4.add(Qn4Op2);
		Question4.add(Qn4Op3);
		Question4.add(Qn4Op4);
		
		ButtonGroup Question5 = new ButtonGroup();
		Question5.add(Qn5Op1);
		Question5.add(Qn5Op2);
		Question5.add(Qn5Op3);
		Question5.add(Qn5Op4);
		
		ButtonGroup Question6 = new ButtonGroup();
		Question6.add(Qn6Op1);
		Question6.add(Qn6Op2);
		Question6.add(Qn6Op3);
		Question6.add(Qn6Op4);
		
		ButtonGroup Question7 = new ButtonGroup();
		Question7.add(Qn7Op1);
		Question7.add(Qn7Op2);
		Question7.add(Qn7Op3);
		Question7.add(Qn7Op4);
		
		ButtonGroup Question8 = new ButtonGroup();
		Question8.add(Qn8Op1);
		Question8.add(Qn8Op2);
		Question8.add(Qn8Op3);
		Question8.add(Qn8Op4);
		
		ButtonGroup Question9 = new ButtonGroup();
		Question9.add(Qn9Op1);
		Question9.add(Qn9Op2);
		Question9.add(Qn9Op3);
		Question9.add(Qn9Op4);

		ButtonGroup Question10 = new ButtonGroup();
		Question10.add(Qn10Op1);
		Question10.add(Qn10Op2);
		Question10.add(Qn10Op3);
		Question10.add(Qn10Op4);
		
		JLabel Qn10_2 = new JLabel("    problems affect your routine life ?");
		Qn10_2.setFont(new Font("Arial", Font.BOLD, 20));
		Qn10_2.setBounds(890, 687, 609, 50);
		panel.add(Qn10_2);
		
		JButton Btn1 = new JButton("Get Results");
		Btn1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if((Qn1Op1.isSelected() || Qn1Op2.isSelected() || Qn1Op3.isSelected() || Qn1Op4.isSelected()) && (Qn2Op1.isSelected() || Qn2Op2.isSelected() || Qn2Op3.isSelected() || Qn2Op4.isSelected()) && (Qn3Op1.isSelected() || Qn3Op2.isSelected() || Qn3Op3.isSelected() || Qn3Op4.isSelected()) && (Qn4Op1.isSelected() || Qn4Op2.isSelected() || Qn4Op3.isSelected() || Qn4Op4.isSelected()) && (Qn5Op1.isSelected() || Qn5Op2.isSelected() || Qn5Op3.isSelected() || Qn5Op4.isSelected()) && (Qn6Op1.isSelected() || Qn6Op2.isSelected() || Qn6Op3.isSelected() || Qn6Op4.isSelected()) && (Qn7Op1.isSelected() || Qn7Op2.isSelected() || Qn7Op3.isSelected() || Qn7Op4.isSelected()) && (Qn8Op1.isSelected() || Qn8Op2.isSelected() || Qn8Op3.isSelected() || Qn8Op4.isSelected()) && (Qn9Op1.isSelected() || Qn9Op2.isSelected() || Qn9Op3.isSelected() || Qn9Op4.isSelected()) && (Qn10Op1.isSelected() || Qn10Op2.isSelected() || Qn10Op3.isSelected() || Qn10Op4.isSelected()))
				{
					if(Qn1Op1.isSelected())
					{
						Q1 = 1;
					}
					if(Qn1Op2.isSelected())
					{
						Q1 = 2;
					}
					if(Qn1Op3.isSelected())
					{
						Q1 = 3;
					}
					if(Qn1Op4.isSelected())
					{
						Q1 = 4;
					}
					
					if(Qn2Op1.isSelected())
					{
						Q2 = 1;
					}
					if(Qn2Op2.isSelected())
					{
						Q2 = 4;
					}
					if(Qn2Op3.isSelected())
					{
						Q2 = 6;
					}
					if(Qn2Op4.isSelected())
					{
						Q2 = 8;
					}
					
					if(Qn3Op1.isSelected())
					{
						Q3 = 1;
					}
					if(Qn3Op2.isSelected())
					{
						Q3 = 2;
					}
					if(Qn3Op3.isSelected())
					{
						Q3 = 3;
					}
					if(Qn3Op4.isSelected())
					{
						Q3 = 4;
					}
					
					if(Qn4Op1.isSelected())
					{
						Q4 = 2;
					}
					if(Qn4Op2.isSelected())
					{
						Q4 = 4;
					}
					if(Qn4Op3.isSelected())
					{
						Q4 = 6;
					}
					if(Qn4Op4.isSelected())
					{
						Q4 = 8;
					}
					
					if(Qn5Op1.isSelected())
					{
						Q5 = 1;
					}
					if(Qn5Op2.isSelected())
					{
						Q5 = 2;
					}
					if(Qn5Op3.isSelected())
					{
						Q5 = 3;
					}
					if(Qn5Op4.isSelected())
					{
						Q5 = 4;
					}
					
					if(Qn6Op1.isSelected())
					{
						Q6 = 1;
					}
					if(Qn6Op2.isSelected())
					{
						Q6 = 2;
					}
					if(Qn6Op3.isSelected())
					{
						Q6 = 3;
					}
					if(Qn6Op4.isSelected())
					{
						Q6 = 4;
					}
					
					if(Qn7Op1.isSelected())
					{
						Q7 = 1;
					}
					if(Qn7Op2.isSelected())
					{
						Q7 = 4;
					}
					if(Qn7Op3.isSelected())
					{
						Q7 = 6;
					}
					if(Qn7Op4.isSelected())
					{
						Q7 = 8;
					}
					
					if(Qn8Op1.isSelected())
					{
						Q8 = 2;
					}
					if(Qn8Op2.isSelected())
					{
						Q8 = 4;
					}
					if(Qn8Op3.isSelected())
					{
						Q8 = 6;
					}
					if(Qn8Op4.isSelected())
					{
						Q8 = 8;
					}
					
					if(Qn9Op1.isSelected())
					{
						Q9 = 1;
					}
					if(Qn9Op2.isSelected())
					{
						Q9 = 2;
					}
					if(Qn9Op3.isSelected())
					{
						Q9 = 3;
					}
					if(Qn9Op4.isSelected())
					{
						Q9 = 4;
					}
					
					if(Qn10Op1.isSelected())
					{
						Q10 = 1;
					}
					if(Qn10Op2.isSelected())
					{
						Q10 = 4;
					}
					if(Qn10Op3.isSelected())
					{
						Q10 = 6;
					}
					if(Qn10Op4.isSelected())
					{
						Q10 = 8;
					}
					
					Result = Q1 + Q2 + Q3 + Q4 + Q5 + Q6 + Q7 + Q8 + Q9 + Q10;
					
					if(Result >= 50)
					{
						JOptionPane.showMessageDialog(null, "      Result :"+Result+"/60\nWe request you to seek immediate help");
						f.setVisible(false);
					}
					else if(Result<50 && Result>= 35) 
					{
						JOptionPane.showMessageDialog(null, "                                         Result :"+Result+"/60\nOur advice is for you to seek professional help and Talk to your loved ones");
						f.setVisible(false);
					}
					else if(Result<35 && Result>=20)
					{
						JOptionPane.showMessageDialog(null, "                                      Result :"+Result+"/60\nYou might be showing early signs of mental illness. Take care of yourself");
						f.setVisible(false);
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "You seem to be in good Mental Condition\nKeep Taking Care of yourself");
						f.setVisible(false);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please answer all the questions");
					f.setVisible(false);
					new Quiz();
				}
			}
		});
		Btn1.setFont(new Font("Arial", Font.BOLD, 27));
		Btn1.setBounds(1235, 33, 186, 71);
		panel.add(Btn1);
		
		f.setBounds(0, 0, 1920, 1080);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		
	}
	
	public static void main(String[] args) 
	{
		new Quiz();
	}
}
