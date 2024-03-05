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

public class DOUBLYLINKEDLIST extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField element1;
	private JTextField element2;
	private JTextField displaybox;
	class Node{
		int data;
		Node prelink;
		Node nextlink;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DOUBLYLINKEDLIST frame = new DOUBLYLINKEDLIST();
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
	public DOUBLYLINKEDLIST() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 888, 569);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(255, 165, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 18));
		lblNewLabel.setBounds(280, 36, 346, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1.setForeground(new Color(0, 0, 205));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(150, 103, 168, 32);
		contentPane.add(lblNewLabel_1);
		
		element1 = new JTextField();
		element1.setBounds(363, 103, 202, 30);
		contentPane.add(element1);
		element1.setColumns(10);
		
		JButton inserRear = new JButton("INSERT REAR");
		inserRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSERT REAR OPERATION
				int elem;
				
				elem=Integer.valueOf(element1.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null) {
					first=newnode;
				}
				else {
					Node temp=first;
					while(temp.nextlink!=null) {
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
				}
				JOptionPane.showMessageDialog(contentPane, "Element "+newnode.data+" is inserted");
				element1.setText("");
			}
		});
		inserRear.setForeground(new Color(220, 20, 60));
		inserRear.setFont(new Font("Constantia", Font.BOLD, 14));
		inserRear.setBounds(622, 101, 140, 34);
		contentPane.add(inserRear);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 205));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(150, 171, 168, 32);
		contentPane.add(lblNewLabel_1_1);
		
		element2 = new JTextField();
		element2.setColumns(10);
		element2.setBounds(363, 171, 202, 30);
		contentPane.add(element2);
		
		JButton insertFront = new JButton("INSERT FRONT");
		insertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSERT FORNT OPERATION
				int elem;
				elem=Integer.valueOf(element2.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null) {
					first=newnode;
				}
				else {
					first.prelink=newnode;
					newnode.nextlink=first;
					first=newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "Element "+newnode.data+" is inserted");
				element2.setText("");
			}
		});
		insertFront.setForeground(new Color(220, 20, 60));
		insertFront.setFont(new Font("Constantia", Font.BOLD, 14));
		insertFront.setBounds(622, 171, 140, 34);
		contentPane.add(insertFront);
		
		JButton deleteRear = new JButton("DELETE REAR");
		deleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETE REAR OPERATION
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.nextlink==null) {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=null;
				}
				else {
					Node temp=first;
					while(temp.nextlink.nextlink!=null) {
						temp=temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+temp.nextlink.data);
					temp.nextlink=null;
				}
			}
		});
		deleteRear.setForeground(new Color(220, 20, 60));
		deleteRear.setFont(new Font("Constantia", Font.BOLD, 14));
		deleteRear.setBounds(363, 236, 155, 41);
		contentPane.add(deleteRear);
		
		JButton deleteFront = new JButton("DELETE FRONT");
		deleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DELETE FRONT OPERATION
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.nextlink==null) {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=null;
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=first.nextlink;
					first.prelink=null;
				}
			}
		});
		deleteFront.setForeground(new Color(220, 20, 60));
		deleteFront.setFont(new Font("Constantia", Font.BOLD, 14));
		deleteFront.setBounds(363, 312, 155, 41);
		contentPane.add(deleteFront);
		
		JButton displayForward = new JButton("DISPLAY FORWARD");
		displayForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLAY FORWARD OPERATION
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.nextlink==null) {
					displaybox.setText(first.data+"");
				}
				else {
					String message="";
					Node temp=first;
					while(temp!=null) {
						message=message+" "+temp.data;
						temp=temp.nextlink;
					}
					displaybox.setText(message);
				}
			}
		});
		displayForward.setForeground(new Color(220, 20, 60));
		displayForward.setFont(new Font("Constantia", Font.BOLD, 14));
		displayForward.setBounds(208, 391, 207, 41);
		contentPane.add(displayForward);
		
		JButton displayReverse = new JButton("DISPLAY REVERSE");
		displayReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLAY REVERSE OPERATION
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.nextlink==null) {
					displaybox.setText(first.data+"");
				}
				else {
					String message="";
					Node temp=first;
					while(temp.nextlink!=null) {
						temp=temp.nextlink;
					}
					while(temp!=null) {
						message=message+" "+temp.data;
						
						temp=temp.prelink;
					}
					displaybox.setText(message);
				}
			}
		});
		displayReverse.setForeground(new Color(220, 20, 60));
		displayReverse.setFont(new Font("Constantia", Font.BOLD, 14));
		displayReverse.setBounds(531, 391, 207, 41);
		contentPane.add(displayReverse);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(0, 255, 255));
		displaybox.setForeground(new Color(0, 0, 205));
		displaybox.setBounds(184, 468, 560, 41);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
