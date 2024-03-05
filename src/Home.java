import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setBackground(new Color(255, 165, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 863, 580);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 0));
		contentPane.setBackground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(294, 10, 295, 56);
		contentPane.add(lblNewLabel);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place Array Window code here
				new Array().setVisible(true);
			}
		});
		array.setFont(new Font("Constantia", Font.BOLD, 14));
		array.setBackground(new Color(255, 255, 255));
		array.setForeground(new Color(0, 0, 0));
		array.setBounds(376, 103, 123, 56);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place Stack Window Code here
				new Stack().setVisible(true);
			}
		});
		stack.setFont(new Font("Constantia", Font.BOLD, 14));
		stack.setForeground(new Color(0, 0, 0));
		stack.setBackground(new Color(255, 255, 255));
		stack.setBounds(147, 183, 129, 56);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place Queue Window Code here
				new Queue().setVisible(true);
			}
		});
		queue.setBackground(new Color(255, 255, 255));
		queue.setFont(new Font("Constantia", Font.BOLD, 14));
		queue.setBounds(594, 183, 137, 56);
		contentPane.add(queue);
		
		JButton circularQueue = new JButton("CIRCULAR QUEUE");
		circularQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place Cicular Queue Window Code here
				new CircularQueue().setVisible(true);
			}
		});
		circularQueue.setBackground(new Color(255, 255, 255));
		circularQueue.setFont(new Font("Constantia", Font.BOLD, 14));
		circularQueue.setBounds(112, 301, 199, 56);
		contentPane.add(circularQueue);
		
		JButton singlyLinkedList = new JButton("SINGLY LINKED LIST'");
		singlyLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place Singly Linked List Window Code here
				new SingleLinkedList().setVisible(true);
			}
		});
		singlyLinkedList.setBackground(new Color(255, 255, 255));
		singlyLinkedList.setFont(new Font("Constantia", Font.BOLD, 14));
		singlyLinkedList.setBounds(564, 301, 213, 56);
		contentPane.add(singlyLinkedList);
		
		JButton doublyLinkedList = new JButton("DOUBLY LINKED LIST");
		doublyLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place Doubly Linked List Window Code here
				new DOUBLYLINKEDLIST().setVisible(true);
				
			}
		});
		doublyLinkedList.setBackground(new Color(255, 255, 255));
		doublyLinkedList.setFont(new Font("Constantia", Font.BOLD, 14));
		doublyLinkedList.setBounds(327, 405, 232, 56);
		contentPane.add(doublyLinkedList);
	}
}
