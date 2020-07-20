package jpnrestoku;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;

public class Order extends JFrame {
	 	Connection con;
	    Statement stat;
	    ResultSet rs;
	    String sql;
	    

	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
private JComboBox comboBox;
private JComboBox  comboBox_1;
	/**
	 * Launch the application.
	 */


	public static void NewOrder() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
						Order frame = new Order();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/*
	public static void hitung() {
	String a,b;
	double c;
	a = textField_1.getText();
	b = textField_4.getText();
	c= a * b;
	
	
	
	}*/
public void fillcomboBox()
{
	 try {
         sql = "SELECT * FROM makanan";
         rs = stat.executeQuery(sql);
         while (rs.next()){
        	 comboBox.addItem(rs.getString("nama_mak"));
             }
         
     } catch (Exception e) {
        e.printStackTrace();
     }	}

	/**
	 * Create the frame.
	 */
	public Order() {
		fillcomboBox();
		setBackground(new Color(255, 165, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 506);
		contentPane = new JPanel();
	//	JScrollPane scrPane = new JScrollPane(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOrder = new JLabel("Order ");
		lblOrder.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 28));
		lblOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrder.setBounds(10, 11, 743, 53);
		contentPane.add(lblOrder);
		
		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setFont(new Font("Clarendon Lt BT", Font.BOLD, 18));
		lblTotal.setBounds(20, 389, 79, 14);
		contentPane.add(lblTotal);
	
		JButton btnKeluar = new JButton("Keluar");
		btnKeluar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Order.this.dispose();
				
				
			}
		});
		btnKeluar.setBounds(171, 419, 89, 23);
		contentPane.add(btnKeluar);
		
		JButton btnPesan = new JButton("Pesan");
		btnPesan.setBounds(54, 419, 89, 23);
		contentPane.add(btnPesan);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(365, 121, 388, 183);
		contentPane.add(tabbedPane);
		
		textField = new JTextField();
		textField.setBounds(115, 121, 92, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(115, 152, 92, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		 comboBox = new JComboBox();
		comboBox.setBounds(115, 183, 96, 22);
		contentPane.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(115, 216, 92, 20);
		contentPane.add(textField_2);
		
		 comboBox_1 = new JComboBox();
		comboBox_1.setBounds(115, 249, 96, 22);
		contentPane.add(comboBox_1);
	
		
	}

}
