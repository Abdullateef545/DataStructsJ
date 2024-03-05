import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SingleLinkedList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField element1;
	private JTextField element2;
	private JTextField displaybox;
	class Node{
		int data;
		Node link;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingleLinkedList frame = new SingleLinkedList();
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
	public SingleLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 577);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(255, 127, 80));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 18));
		lblNewLabel.setBounds(262, 33, 340, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1.setForeground(new Color(220, 20, 60));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(113, 97, 197, 34);
		contentPane.add(lblNewLabel_1);
		
		element1 = new JTextField();
		element1.setBounds(333, 97, 181, 32);
		contentPane.add(element1);
		element1.setColumns(10);
		
		JButton insertRear = new JButton("INSERT REAR");
		insertRear.setForeground(new Color(0, 0, 205));
		insertRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSERT REAR OPERATION
				int elem;
				Node newnode=new Node();
				
				elem=Integer.valueOf(element1.getText());
				newnode.data=elem;
				newnode.link=null;
				if(first==null) {
					first=newnode;
				}
				else {
					Node temp;
					temp=first;
					while(temp.link!=null) {
						temp=temp.link;
					}
					temp.link=newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "Element "+newnode.data+" is inserted ar rear");
				element1.setText("");
			}
		});
		insertRear.setFont(new Font("Constantia", Font.BOLD, 14));
		insertRear.setBounds(587, 90, 156, 34);
		contentPane.add(insertRear);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_2.setForeground(new Color(220, 20, 60));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(113, 158, 181, 36);
		contentPane.add(lblNewLabel_2);
		
		element2 = new JTextField();
		element2.setBounds(333, 158, 181, 34);
		contentPane.add(element2);
		element2.setColumns(10);
		
		JButton insertFront = new JButton("INSERT FRONT");
		insertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// INSERT FRONT OPERATION
				int elem;
				Node newnode=new Node();
				
				elem=Integer.valueOf(element2.getText());
				newnode.data=elem;
				newnode.link=null;
				if(first==null) {
					first=newnode;
				}
				else {
					newnode.link=first;
					first=newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "Element "+newnode.data+" is insert at front");
				element2.setText("");
			}
		});
		insertFront.setForeground(new Color(0, 0, 205));
		insertFront.setFont(new Font("Constantia", Font.BOLD, 14));
		insertFront.setBounds(587, 151, 156, 34);
		contentPane.add(insertFront);
		
		JButton deleteRear = new JButton("DELETE REAR");
		deleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETE REAR OPERATION
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=null;
				}
				else {
					Node temp;
					temp=first;
					while(temp.link.link!=null) {
						temp=temp.link;
					}
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+temp.link.data);
					temp.link=null;
				}
			}
		});
		deleteRear.setForeground(new Color(0, 0, 205));
		deleteRear.setFont(new Font("Constantia", Font.BOLD, 14));
		deleteRear.setBounds(362, 225, 152, 44);
		contentPane.add(deleteRear);
		
		JButton deleteFront = new JButton("DELETE FRONT");
		deleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DELETE FRONT OPERATION
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane, "Deleted element is "+first.data);
					first=null;
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=first.link;
				}
			}
		});
		deleteFront.setForeground(new Color(0, 0, 205));
		deleteFront.setFont(new Font("Constantia", Font.BOLD, 14));
		deleteFront.setBounds(362, 299, 152, 44);
		contentPane.add(deleteFront);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DISPLAY OPERATION
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible.");
				}
				else if(first.link==null) {
					displaybox.setText(first.data+"");
				}
				else {
					String message="";
					Node temp=first;
					while(temp!=null) {
						message=message+" "+temp.data;
						temp=temp.link;
					}
					displaybox.setText(message);
				}
			}
			
		});
		display.setForeground(new Color(0, 0, 205));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(362, 372, 152, 44);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(0, 255, 255));
		displaybox.setForeground(new Color(0, 0, 205));
		displaybox.setBounds(154, 439, 610, 44);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
