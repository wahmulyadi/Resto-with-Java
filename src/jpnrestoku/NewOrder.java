package jpnrestoku;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class NewOrder extends JFrame {
	Connection connection=null;
	private JPanel contentPane;
	private JTextField kode;
	private JTextField nama;
	private JTextField hargamak;
	private JTextField jmlmak1;
	private JComboBox comboBoxMakan;
	private JComboBox comboBoxMakanan1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_1;
	private JLabel lblNewLabel;
	private JLabel lblNamaPemesan;
	private JLabel lblMakanan;
	private JLabel lblHarga;
	private JLabel lblJumlahPesanan;
	private JTextField hargamak1;
	private JTextField jmlmak2;
	private JTextField hargamin1;
	private JTextField jumlahmin1;
	private JTextField hargamin2;
	private JTextField jumlahmin2;
	private JTextField total;
	private JLabel lblNewLabel_2;
	private JTextField no_meja;
	private JLabel meja;
	/**
	 * Launch the application.
	 */
	
	//---- buat ngejalanin menu ----//
	public static void NewsOrder() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewOrder frame = new NewOrder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void autokodepesan() {
		try {
			String query="select max(right(kode_pesan,3)) as Kode from pemesanan";
			java.sql.PreparedStatement pst=connection.prepareStatement(query);
		Statement stm=connection.createStatement();
			ResultSet rs =pst.executeQuery();
			
			while (rs.next()) {
				if (rs.first()==false) {
					kode.setText("JPR001");
			}else {
				rs.last();
				int autocode= rs.getInt(1)+1;
					String nomor=String.valueOf(autocode);
					int noLong=nomor.length();
					
					
						for (int a=0;a<3-noLong;a++) 
						{	nomor="0" + nomor;
			}
						kode.setText("JPR"+nomor);
			}
			}
			
			
		}catch (Exception ex){
			ex.printStackTrace();
		}
}


		public void hitung() {
			int a,b,c,d,e,f,g,h,tota,ppn,totall,ppn_total;
			a=Integer.parseInt(hargamak.getText());
			b=Integer.parseInt(jmlmak1.getText());
			c=Integer.parseInt(hargamak1.getText());
			d=Integer.parseInt(jmlmak2.getText());
			e=Integer.parseInt(hargamin1.getText());
			f=Integer.parseInt(jumlahmin1.getText());
			g=Integer.parseInt(hargamin2.getText());
			h=Integer.parseInt(jumlahmin2.getText());
			
			
			ppn = 10/100;
			tota = (a*b)+(c*d)+(e*f)+(g*h);
			ppn_total= tota * 10/100;
			totall = ppn_total + tota;
			total.setText(""+totall);
		}
	
		public void fillcombobox() {
			try {
				String query="select *from minum";
			java.sql.PreparedStatement pst=connection.prepareStatement(query);
			ResultSet rz =pst.executeQuery();
			while (rz.next()) {
				comboBox_1.addItem(rz.getString("nama_min"));
				comboBox_2.addItem(rz.getString("nama_min"));
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}}
	
	public void fillComboBox1()
	{
		try {
			String query="select *from makanan";
			java.sql.PreparedStatement pst=connection.prepareStatement(query);
			ResultSet rs =pst.executeQuery();
			while (rs.next()) {
				comboBoxMakan.addItem(rs.getString("nama_mak"));
				comboBoxMakanan1.addItem(rs.getString("nama_mak"));
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public NewOrder() {
		setTitle("Order");
		connection=sqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 674, 425);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		kode = new JTextField();
		kode.setEnabled(false);
		kode.setBounds(147, 28, 186, 20);
		contentPane.add(kode);
		kode.setColumns(10);
		
		nama = new JTextField();
		nama.setBounds(147, 61, 186, 20);
		contentPane.add(nama);
		nama.setColumns(10);
		
		comboBoxMakan = new JComboBox();
		comboBoxMakan.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 try {
						String query="select *from makanan where nama_mak=?";
						java.sql.PreparedStatement pst=connection.prepareStatement(query);
						pst.setString(1, (String)comboBoxMakan.getSelectedItem());
						ResultSet rs =pst.executeQuery();
						while (rs.next()) {
							hargamak.setText(rs.getString("harga_mak"));
						}
					}catch (Exception ex){
						ex.printStackTrace();
					}
			}
		});
		comboBoxMakan.setBounds(147, 122, 186, 22);
		contentPane.add(comboBoxMakan);
		
		hargamak = new JTextField();
		hargamak.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		hargamak.setEnabled(false);
		hargamak.setBounds(147, 155, 186, 20);
		contentPane.add(hargamak);
		hargamak.setColumns(10);
		
		jmlmak1 = new JTextField();
		jmlmak1.setText("0");
		jmlmak1.setBounds(147, 186, 186, 20);
		contentPane.add(jmlmak1);
		jmlmak1.setColumns(10);
		
		lblNewLabel = new JLabel("Kode Pemesanan");
		lblNewLabel.setBounds(37, 31, 92, 14);
		contentPane.add(lblNewLabel);
		
		lblNamaPemesan = new JLabel("Nama Pemesan");
		lblNamaPemesan.setBounds(37, 64, 92, 14);
		contentPane.add(lblNamaPemesan);
		
		lblMakanan = new JLabel("Makanan");
		lblMakanan.setBounds(37, 126, 92, 14);
		contentPane.add(lblMakanan);
		
		lblHarga = new JLabel("Harga Satu Porsi");
		lblHarga.setBounds(37, 158, 92, 14);
		contentPane.add(lblHarga);
		
		lblJumlahPesanan = new JLabel("Jumlah Pesanan");
		lblJumlahPesanan.setBounds(37, 189, 92, 14);
		contentPane.add(lblJumlahPesanan);
		
		JLabel label = new JLabel("Jumlah Pesanan");
		label.setBounds(37, 284, 92, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Harga Satu Porsi");
		label_1.setBounds(37, 253, 92, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Makanan");
		label_2.setBounds(37, 221, 92, 14);
		contentPane.add(label_2);
		
		comboBoxMakanan1 = new JComboBox();
		comboBoxMakanan1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 try {
						String query="select *from makanan where nama_mak=?";
						java.sql.PreparedStatement pst=connection.prepareStatement(query);
						pst.setString(1, (String)comboBoxMakan.getSelectedItem());
						ResultSet rs =pst.executeQuery();
						while (rs.next()) {
							hargamak1.setText(rs.getString("harga_mak"));
						}
					}catch (Exception ex){
						ex.printStackTrace();
					}
			}
		});
		
		comboBoxMakanan1.setBounds(147, 217, 186, 22);
		contentPane.add(comboBoxMakanan1);
		
		hargamak1 = new JTextField();
		hargamak1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		hargamak1.setEnabled(false);
		hargamak1.setColumns(10);
		hargamak1.setBounds(147, 250, 186, 20);
		contentPane.add(hargamak1);
		
		jmlmak2 = new JTextField();
		jmlmak2.setText("0");
		jmlmak2.setColumns(10);
		jmlmak2.setBounds(147, 281, 186, 20);
		contentPane.add(jmlmak2);
		
		JLabel label_3 = new JLabel("Jumlah Pesanan");
		label_3.setBounds(343, 189, 92, 14);
		contentPane.add(label_3);
		
		JLabel lblHargaSatuan = new JLabel("Harga Satuan");
		lblHargaSatuan.setBounds(343, 158, 92, 14);
		contentPane.add(lblHargaSatuan);
		
		JLabel lblMinuman = new JLabel("Minuman");
		lblMinuman.setBounds(343, 126, 92, 14);
		contentPane.add(lblMinuman);
		
		comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
						String query="select *from minum where nama_min=?";
						java.sql.PreparedStatement pst=connection.prepareStatement(query);
						pst.setString(1, (String)comboBox_1.getSelectedItem());
						ResultSet rs =pst.executeQuery();
						while (rs.next()) {
							hargamin1.setText(rs.getString("harga_min"));
						}
					}catch (Exception ex){
						ex.printStackTrace();
					}
			}
		
		});
		comboBox_1.setBounds(453, 122, 186, 22);
		contentPane.add(comboBox_1);
		
		hargamin1 = new JTextField();
		hargamin1.setFont(new Font("Tahoma", Font.BOLD, 12));
		hargamin1.setColumns(10);
		hargamin1.setEnabled(false);
		hargamin1.setBounds(453, 155, 186, 20);
		contentPane.add(hargamin1);
		
		jumlahmin1 = new JTextField();
		jumlahmin1.setText("0");
		jumlahmin1.setColumns(10);
		jumlahmin1.setBounds(453, 186, 186, 20);
		contentPane.add(jumlahmin1);
		
		JLabel label_6 = new JLabel("Jumlah Pesanan");
		label_6.setBounds(343, 281, 92, 14);
		contentPane.add(label_6);
		
		JLabel lblHargaSatuan_1 = new JLabel("Harga Satuan");
		lblHargaSatuan_1.setBounds(343, 250, 92, 14);
		contentPane.add(lblHargaSatuan_1);
		
		JLabel lblMinuman_1 = new JLabel("Minuman");
		lblMinuman_1.setBounds(343, 218, 92, 14);
		contentPane.add(lblMinuman_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
						String query="select *from minum where nama_min=?";
						java.sql.PreparedStatement pst=connection.prepareStatement(query);
						pst.setString(1, (String)comboBox_2.getSelectedItem());
						ResultSet rs =pst.executeQuery();
						while (rs.next()) {
							hargamin2.setText(rs.getString("harga_min"));
						}
					}catch (Exception ex){
						ex.printStackTrace();
					}
			}
		
		});
		comboBox_2.setBounds(453, 214, 186, 22);
		contentPane.add(comboBox_2);
		
		hargamin2 = new JTextField();
		hargamin2.setFont(new Font("Tahoma", Font.BOLD, 12));
		hargamin2.setEnabled(false);
		hargamin2.setColumns(10);
		hargamin2.setBounds(453, 247, 186, 20);
		contentPane.add(hargamin2);
		
		jumlahmin2 = new JTextField();
		jumlahmin2.setText("0");
		jumlahmin2.setColumns(10);
		jumlahmin2.setBounds(453, 278, 186, 20);
		contentPane.add(jumlahmin2);
		
		total = new JTextField();
		total.setFont(new Font("Tahoma", Font.BOLD, 18));
		total.setEnabled(false);
		total.setBounds(175, 312, 162, 30);
		contentPane.add(total);
		total.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Total Bayar Rp.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(37, 313, 178, 30);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hitung();
				
			}
		});
		btnNewButton.setBounds(347, 321, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pesan");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
						String query="INSERT INTO pemesanan (kode_pesan,nama_pemesan,meja,makanan1,jumlahmak1,makanan2,jumlahmak2,minuman1,jumlahmin1,minuman2,jumlahmin2,TotalHarga) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
						java.sql.PreparedStatement stm=connection.prepareStatement(query);
						//stm.executeQuery();
						stm.setString(1,kode.getText());
						stm.setString(2,nama.getText());
						stm.setString(3,no_meja.getText());
						stm.setString(4, comboBoxMakan.getSelectedItem().toString());
						stm.setString(5,jmlmak1.getText());
						stm.setString(6,comboBoxMakanan1.getSelectedItem().toString());
						stm.setString(7,jmlmak2.getText());
						stm.setString(8,comboBox_1.getSelectedItem().toString());
						stm.setString(9,jumlahmin1.getText());
						stm.setString(10,comboBox_2.getSelectedItem().toString());
						stm.setString(11,jumlahmin2.getText());
						stm.setString(12,total.getText());
						
						stm.execute();
						stm.close();
						JOptionPane.showMessageDialog(null, "Pesanan Berhasil, Terimakasih");
						NewOrder.this.dispose();
					}catch (Exception ex){
						ex.printStackTrace();
					}
				
			}
			
			
		});
		btnNewButton_1.setBounds(454, 321, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Tutup");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ok = JOptionPane.showConfirmDialog(null,"Jika Anda Keluar Tanpa Memesan Data yang telah di masukan akan hilang,Keluar?","Konfirmasi Keluar",JOptionPane.YES_NO_OPTION);
				if (ok==0) {
				NewOrder.this.dispose();
			}}
		
		});
		btnNewButton_2.setBounds(559, 321, 89, 23);
		contentPane.add(btnNewButton_2);
		
		lblNewLabel_2 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/fxlog.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(352, 0, 296, 115);
		contentPane.add(lblNewLabel_2);
		
		no_meja = new JTextField();
		no_meja.setBounds(147, 92, 186, 20);
		contentPane.add(no_meja);
		no_meja.setColumns(10);
		
		meja = new JLabel("No Meja");
		meja.setBounds(37, 95, 46, 14);
		contentPane.add(meja);
		
		JLabel lblNewLabel_3 = new JLabel("*Harga Belum Termasuk PPN 10%");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3.setBounds(47, 354, 257, 21);
		contentPane.add(lblNewLabel_3);
		autokodepesan();
		fillComboBox1();
		fillcombobox();
	}
}
