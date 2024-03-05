import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 548);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(263, 27, 241, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE STACK SIZE");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(177, 105, 182, 20);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(394, 89, 123, 38);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton createstack = new JButton("CREATE STACK");
		createstack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int len=Integer.valueOf(length.getText());
				s=new int[len];
				size=len;
				String message="Stack of length "+len+" is created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createstack.setFont(new Font("Constantia", Font.BOLD, 14));
		createstack.setForeground(new Color(0, 191, 255));
		createstack.setBounds(328, 158, 162, 38);
		contentPane.add(createstack);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT:");
		lblNewLabel_2.setForeground(new Color(220, 20, 60));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(208, 236, 162, 20);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(408, 232, 96, 26);
		contentPane.add(element);
		element.setColumns(10);
		//PUSH OPERATION
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//push operation
				int elem;
				if(top==size-1)
					JOptionPane.showMessageDialog(contentPane, "Push is not possible");
				else {
					elem = Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane, "Element "+elem +" pushed onto stack");
				}
				element.setText("");
				}
		});
		push.setForeground(new Color(30, 144, 255));
		push.setFont(new Font("Constantia", Font.BOLD, 16));
		push.setBounds(532, 229, 90, 29);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//POP OPERATION
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "pop not possible");
				}else {
					JOptionPane.showMessageDialog(contentPane, "element deleted is "+s[top]);
					--top;
				}
			}
		});
		pop.setForeground(new Color(30, 144, 255));
		pop.setFont(new Font("Constantia", Font.BOLD, 16));
		pop.setBounds(362, 290, 101, 27);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message="";
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "display not possible");
				}
				else {
					for(int i=top;i>=0;i--) {
						message=message+" "+s[i];
					}
					displaybox.setText(message);
				}
			}
		});
		display.setForeground(new Color(0, 191, 255));
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(362, 362, 117, 29);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(253, 245, 230));
		displaybox.setFont(new Font("Constantia", Font.BOLD, 16));
		displaybox.setForeground(new Color(0, 0, 0));
		displaybox.setBounds(177, 425, 478, 38);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
