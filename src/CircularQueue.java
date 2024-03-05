import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CircularQueue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 496);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATASTURCTURE");
		lblNewLabel.setForeground(new Color(255, 165, 0));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 18));
		lblNewLabel.setBounds(202, 27, 315, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE");
		lblNewLabel_1.setForeground(new Color(220, 20, 60));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(183, 82, 151, 35);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(365, 81, 118, 33);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE QUEUE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CREATE CIRCULAR QUEUE
				size=Integer.valueOf(length.getText());
				cq=new int[size];
				String message="Circular Queue length "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setForeground(new Color(0, 0, 205));
		create.setFont(new Font("Constantia", Font.BOLD, 14));
		create.setBounds(294, 140, 151, 35);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2.setForeground(new Color(220, 20, 60));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(183, 199, 170, 33);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(365, 199, 96, 24);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// INSERT OPERATION
				int elem;
				if(count==size) {
					JOptionPane.showMessageDialog(contentPane, "Insertion is not possible");
				}
				else {
					
					elem=Integer.valueOf(element.getText());
					r=(r+1)%size;
					cq[r]=elem;
					++count;
					JOptionPane.showMessageDialog(contentPane, "Element "+cq[r]+" inserted");
					element.setText("");
				}
			}
		});
		insert.setForeground(new Color(0, 0, 205));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(514, 199, 96, 25);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETE OPERATION
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "Deletion is not possible");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Deleted element is "+cq[f]);
					f=(f+1)%size;
					--count;
				}
			}
		});
		delete.setForeground(new Color(0, 0, 205));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(294, 255, 101, 35);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DISPLAY OPERATION
				int f1=f;
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else {
					String message="";
					for(int i=1;i<=count;i++) {
						message=message+" "+cq[f1];
						f1=(f1+1)%size;
					}
					displaybox.setText(message);
					
				}
			}
		});
		display.setForeground(new Color(0, 0, 205));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(295, 310, 100, 35);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(0, 0, 205));
		displaybox.setBackground(new Color(0, 255, 255));
		displaybox.setBounds(145, 378, 465, 35);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
