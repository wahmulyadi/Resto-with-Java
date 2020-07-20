package jpnrestoku;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Utama extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Utama frame = new Utama();
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
	public Utama() {
		setTitle("Japan Restaurant");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 266);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/fxlog.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(0, 0, 300, 121);
		contentPane.add(label);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu nw = new Menu();
				nw.NewMenu();
			}
		});
		
		
		btnMenu.setBackground(new Color(255, 165, 0));
		btnMenu.setForeground(new Color(0, 0, 0));
		btnMenu.setBounds(10, 172, 89, 23);
		contentPane.add(btnMenu);
		
		JButton btnOrder = new JButton("Order");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewOrder nw= new NewOrder();
				//Utama.this.dispose();
				nw.NewsOrder();
			}
		});
		btnOrder.setBackground(new Color(255, 165, 0));
		btnOrder.setBounds(103, 172, 89, 23);
		contentPane.add(btnOrder);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ok = JOptionPane.showConfirmDialog(null,"Keluar?","Konfirmasi Keluar",JOptionPane.YES_NO_OPTION);
				if (ok==0) {
				
				System.exit(0);
				}		
			}
		});
		btnClose.setBackground(new Color(255, 69, 0));
		btnClose.setBounds(196, 172, 94, 23);
		contentPane.add(btnClose);
		
		JLabel lblWelcomeToJapan = new JLabel("Welcome to Japan Restaurant");
		lblWelcomeToJapan.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		lblWelcomeToJapan.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToJapan.setBounds(10, 135, 280, 26);
		contentPane.add(lblWelcomeToJapan);
	}
}
