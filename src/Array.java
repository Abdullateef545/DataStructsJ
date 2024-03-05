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

public class Array extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField insertposition;
	private JTextField deleteposition;
	private JTextField displaybox;
	private int array[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 525);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setForeground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(226, 36, 246, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBackground(new Color(0, 191, 255));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(177, 122, 198, 43);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setFont(new Font("Tahoma", Font.PLAIN, 12));
		length.setBounds(385, 120, 116, 33);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for creating array
				int len=Integer.valueOf(length.getText());
				array=new int[len];
				String message="Array of length "+len+" created.";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setForeground(new Color(128, 0, 0));
		create.setFont(new Font("Constantia", Font.BOLD, 16));
		create.setBounds(305, 175, 179, 43);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("INSERT AN ARRAY ELEMENT");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(13, 256, 233, 33);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setFont(new Font("Tahoma", Font.PLAIN, 12));
		element.setBounds(256, 252, 86, 37);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for insertion
				int elem=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(insertposition.getText());
				array[pos]=elem;
				String message="Element "+elem+" inserted at position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
			}
		});
		insert.setForeground(new Color(148, 0, 211));
		insert.setFont(new Font("Constantia", Font.BOLD, 16));
		insert.setBounds(579, 254, 116, 36);
		contentPane.add(insert);
		
		insertposition = new JTextField();
		insertposition.setFont(new Font("Tahoma", Font.PLAIN, 12));
		insertposition.setBounds(461, 252, 86, 37);
		contentPane.add(insertposition);
		insertposition.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("DELETE POSITION");
		lblNewLabel_3.setForeground(new Color(220, 20, 60));
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_3.setBounds(86, 315, 146, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("POSITION");
		lblNewLabel_4.setForeground(new Color(220, 20, 60));
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_4.setBounds(359, 262, 81, 20);
		contentPane.add(lblNewLabel_4);
		
		deleteposition = new JTextField();
		deleteposition.setFont(new Font("Tahoma", Font.PLAIN, 12));
		deleteposition.setBounds(246, 307, 96, 33);
		contentPane.add(deleteposition);
		deleteposition.setColumns(10);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				int pos=Integer.valueOf(deleteposition.getText());
				String message="Element deleted at position "+pos;
				array[pos]=0;
				JOptionPane.showMessageDialog(contentPane, message);
				deleteposition.setText("");
			}
		});
		delete.setForeground(new Color(238, 130, 238));
		delete.setFont(new Font("Constantia", Font.BOLD, 16));
		delete.setBounds(359, 309, 116, 33);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				for(int i=0;i<array.length;i++) {
					msg=msg+" "+array[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(244, 164, 96));
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(305, 371, 116, 33);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		displaybox.setBackground(new Color(255, 255, 240));
		displaybox.setForeground(new Color(0, 0, 255));
		displaybox.setBounds(126, 429, 467, 33);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
