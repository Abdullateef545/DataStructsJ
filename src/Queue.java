import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 568);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 255));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(249, 43, 240, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(204, 113, 151, 32);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(387, 113, 163, 27);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton createqueue = new JButton("CREATE QUEUE");
		createqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CREATE QUEUE
				size=Integer.valueOf(length.getText());
				q=new int[size];
				String message="Queue length "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createqueue.setFont(new Font("Constantia", Font.BOLD, 14));
		createqueue.setForeground(new Color(123, 104, 238));
		createqueue.setBounds(334, 155, 151, 39);
		contentPane.add(createqueue);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2.setForeground(new Color(220, 20, 60));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(204, 234, 158, 29);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(387, 234, 102, 27);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSERTION OPERATION
				int elem;
				if(r==size-1) {
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				}
				else {
					elem=Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane, "Element inserted is "+elem);
					element.setText("");
				}
			}
		});
		insert.setForeground(new Color(75, 0, 130));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(527, 234, 93, 27);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETE OPERATION
				if(r==-1|| f>r) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "element deleted is "+q[f]);
					++f;
				}
			}
		});
		delete.setForeground(new Color(75, 0, 130));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(334, 287, 102, 32);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLAY OPERATION
				if(r==-1 || f>r) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else {
					String message="";
					for(int i=f;i<=r;i++) {
						message=message+" "+q[i];
					}
					displaybox.setText(message);
				}
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setForeground(new Color(75, 0, 130));
		display.setBounds(336, 356, 100, 32);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(0, 0, 205));
		displaybox.setBackground(new Color(0, 255, 255));
		displaybox.setBounds(179, 424, 433, 42);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
