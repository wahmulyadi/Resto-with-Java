package jpnrestoku;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**s
	 * Launch the application.
	 */
	
	//---- buat ngejalanin menu nya ----//
	public static void NewMenu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Menu");
		Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
		int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

       Menu.this.setLocation(x, y);
       
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setBounds(100, 100, 1007, 685);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null); 
		
		//---- volcano sushi roll ----//
		JLabel volcano = new JLabel("");
		Image img= new ImageIcon(this.getClass().getResource("/volcano roll.jpg")).getImage();
				volcano.setIcon(new ImageIcon(img));
		volcano.setBounds(50, 80, 100, 100);
		contentPane.add(volcano);
		
		JLabel lblvolcano = new JLabel("Volcano Roll");
		lblvolcano.setHorizontalAlignment(SwingConstants.CENTER);
		lblvolcano.setBounds(53, 190, 90, 14);
		contentPane.add(lblvolcano);
		
		JLabel lblhrgvolcano = new JLabel("Rp. 38.000");
		lblhrgvolcano.setHorizontalAlignment(SwingConstants.CENTER);
		lblhrgvolcano.setBounds(53, 210, 90, 14);
		contentPane.add(lblhrgvolcano);
		
		//---- unagi sushi ----//
		JLabel unagi = new JLabel("");
		Image img1= new ImageIcon(this.getClass().getResource("/unagi sushi.jpg")).getImage();
		unagi.setIcon(new ImageIcon(img1));
		unagi.setBounds(160, 80, 100, 100);
		contentPane.add(unagi);
		
		JLabel lblunagi = new JLabel("Unagi Sushi");
		lblunagi.setHorizontalAlignment(SwingConstants.CENTER);
		lblunagi.setBounds(163,190, 90, 14);
		contentPane.add(lblunagi);
		
		JLabel lblhrgunagi = new JLabel("Rp. 38.000");
		lblhrgunagi.setHorizontalAlignment(SwingConstants.CENTER);
		lblhrgunagi.setBounds(163, 210, 90, 14);
		contentPane.add(lblhrgunagi);
		
		//---- shrimp tempura sushi ----//
		JLabel tempura = new JLabel("");
		Image img2= new ImageIcon(this.getClass().getResource("/tempura sushi.jpg")).getImage();
				tempura.setIcon(new ImageIcon(img2));
		tempura.setBounds(380, 80, 100, 100);
		contentPane.add(tempura);
		
		JLabel lbltempura = new JLabel("Shrimp Tempura Sushi");
		lbltempura.setHorizontalAlignment(SwingConstants.CENTER);
		lbltempura.setBounds(360, 190, 140, 14);
		contentPane.add(lbltempura);
		
		JLabel lblhrgtempura = new JLabel("Rp. 34.000");
		lblhrgtempura.setHorizontalAlignment(SwingConstants.CENTER);
		lblhrgtempura.setBounds(383, 210, 90, 14);
		contentPane.add(lblhrgtempura);
		
		//---- tamago sushi ----//
		JLabel tamago = new JLabel("");
		Image img3= new ImageIcon(this.getClass().getResource("/Tamago Sushi.jpg")).getImage();
			tamago.setIcon(new ImageIcon(img3));
		tamago.setBounds(270, 80, 100, 100);
		contentPane.add(tamago);
		
		JLabel lbltamago = new JLabel("Tamago Sushi");
		lbltamago.setHorizontalAlignment(SwingConstants.CENTER);
		lbltamago.setBounds(273, 190, 90, 14);
		contentPane.add(lbltamago);
		
		JLabel lblhrgtamago = new JLabel("Rp. 18.000");
		lblhrgtamago.setHorizontalAlignment(SwingConstants.CENTER);
		lblhrgtamago.setBounds(273, 210, 90, 14);
		contentPane.add(lblhrgtamago);
		
		//---- spicy chiken sushi roll ----//
		JLabel spicy = new JLabel("");
		Image img4= new ImageIcon(this.getClass().getResource("/spicy chicken sushi roll.jpg")).getImage();
				spicy.setIcon(new ImageIcon(img4));
		spicy.setBounds(490, 80, 100, 100);
		contentPane.add(spicy);
		
		JLabel lblspicy = new JLabel("Chicken Sushi Roll");
		lblspicy.setHorizontalAlignment(SwingConstants.CENTER);
		lblspicy.setBounds(490, 190, 120, 14);
		contentPane.add(lblspicy);
		
		JLabel lblhrgspicy = new JLabel("Rp. 54.000");
		lblhrgspicy.setHorizontalAlignment(SwingConstants.CENTER);
		lblhrgspicy.setBounds(503, 210, 90, 14);
		contentPane.add(lblhrgspicy);
		/*
		//---- sashimi ----//
		JLabel sashimi = new JLabel("");
		Image img5= new ImageIcon(this.getClass().getResource("/sashimi.jpg")).getImage();
				sashimi.setIcon(new ImageIcon(img5));
		sashimi.setBounds(1050, 80, 100, 100);
		contentPane.add(sashimi);
		
		JLabel lblsashimi = new JLabel("Sashimi");
		lblsashimi.setHorizontalAlignment(SwingConstants.CENTER);
		lblsashimi.setBounds(1053, 190, 90, 14);
		contentPane.add(lblsashimi);
		
		JLabel lblhrgsashimi = new JLabel("Rp. 68.000");
		lblhrgsashimi.setHorizontalAlignment(SwingConstants.CENTER);
		lblhrgsashimi.setBounds(1053, 210, 90, 14);
		contentPane.add(lblhrgsashimi);
		
		//---- salmon sushi ----//
		JLabel salmon = new JLabel("");
		Image img6= new ImageIcon(this.getClass().getResource("/salmon sushi.jpg")).getImage();
				salmon.setIcon(new ImageIcon(img6));
		salmon.setBounds(1250, 80, 100, 100);
		contentPane.add(salmon);
		
		JLabel lblsalmon = new JLabel("Salmon Sushi");
		lblsalmon.setHorizontalAlignment(SwingConstants.CENTER);
		lblsalmon.setBounds(1253, 190, 90, 14);
		contentPane.add(lblsalmon);
		
		JLabel lblhrgsalmon = new JLabel("Rp. 28.000");
		lblhrgsalmon.setHorizontalAlignment(SwingConstants.CENTER);
		lblhrgsalmon.setBounds(1253, 210, 90, 14);
		contentPane.add(lblhrgsalmon);
		Image img7= new ImageIcon(this.getClass().getResource("/maguro sushi.jpg")).getImage();
		*/
		//---- gyoza ----//
		JLabel gyoza = new JLabel("");
		Image img8= new ImageIcon(this.getClass().getResource("/gyoza.jpg")).getImage();
				gyoza.setIcon(new ImageIcon(img8));
		gyoza.setBounds(270, 385, 100, 100);
		contentPane.add(gyoza);
		
		JLabel lblgyoza = new JLabel("Gyoza");
		lblgyoza.setHorizontalAlignment(SwingConstants.CENTER);
		lblgyoza.setBounds(273, 495, 90, 14);
		contentPane.add(lblgyoza);
		
		JLabel lblhrggyoza = new JLabel("Rp. 27.000");
		lblhrggyoza.setHorizontalAlignment(SwingConstants.CENTER);
		lblhrggyoza.setBounds(273, 515, 90, 14);
		contentPane.add(lblhrggyoza);
		
		//---- ebi tempura ----//
		JLabel ebi = new JLabel("");
		Image img9= new ImageIcon(this.getClass().getResource("/ebi tempura.jpg")).getImage();
				ebi.setIcon(new ImageIcon(img9));
		ebi.setBounds(380, 235, 100, 100);
		contentPane.add(ebi);
		
		JLabel lblebi = new JLabel("Ebi Tempura");
		lblebi.setHorizontalAlignment(SwingConstants.CENTER);
		lblebi.setBounds(383, 345, 90, 14);
		contentPane.add(lblebi);
		
		JLabel lblhrgebi = new JLabel("Rp. 34.000");
		lblhrgebi.setHorizontalAlignment(SwingConstants.CENTER);
		lblhrgebi.setBounds(380, 365, 90, 14);
		contentPane.add(lblhrgebi);
		
		//---- beef teriyaki bento set ----//
		JLabel beef = new JLabel("");
		Image img10= new ImageIcon(this.getClass().getResource("/beef teriyaki bento set.jpg")).getImage();
				beef.setIcon(new ImageIcon(img10));
		beef.setBounds(490, 235, 100, 100);
		contentPane.add(beef);
		
		JLabel lblbeef = new JLabel("Beef Teriyaki Bento");
		lblbeef.setHorizontalAlignment(SwingConstants.CENTER);
		lblbeef.setBounds(480, 345, 120, 14);
		contentPane.add(lblbeef);
		
		JLabel lblhrgbeef = new JLabel("Rp. 38.000");
		lblhrgbeef.setHorizontalAlignment(SwingConstants.CENTER);
		lblhrgbeef.setBounds(500, 365, 90, 14);
		contentPane.add(lblhrgbeef);
		
		//----chicken curry donburi----//
		JLabel curry = new JLabel("");
		Image img11= new ImageIcon(this.getClass().getResource("/chicken curry donburi.jpg")).getImage();
				curry.setIcon(new ImageIcon(img11));
		curry.setBounds(380, 385, 100, 100);
		contentPane.add(curry);
		
		JLabel lblcurry = new JLabel("Chicken Curry Donburi");
		lblcurry.setHorizontalAlignment(SwingConstants.CENTER);
		lblcurry.setBounds(360, 495, 130, 14);
		contentPane.add(lblcurry);
		
		JLabel lblhrgcurry = new JLabel("Rp. 34.000");
		lblhrgcurry.setHorizontalAlignment(SwingConstants.CENTER);
		lblhrgcurry.setBounds(383, 515, 90, 14);
		contentPane.add(lblhrgcurry);
		/*
		//----grilled salmon----//
		JLabel grilled = new JLabel("");
		Image img12=  new ImageIcon(this.getClass().getResource("/grilled salmon.jpg")).getImage();
				grilled.setIcon(new ImageIcon(img12));
		grilled.setBounds(1050, 250, 100, 100);
		contentPane.add(grilled);
		
		JLabel lblgrilled = new JLabel("Grilled Salmon");
		lblgrilled.setHorizontalAlignment(SwingConstants.CENTER);
		lblgrilled.setBounds(1053, 360, 90, 14);
		contentPane.add(lblgrilled);
		
		JLabel lblhrggrilled = new JLabel("Rp. 50.000");
		lblhrggrilled.setHorizontalAlignment(SwingConstants.CENTER);
		lblhrggrilled.setBounds(1053, 380, 90, 14);
		contentPane.add(lblhrggrilled);
		
		//----miso soup----//
		JLabel miso = new JLabel("");
		Image img14= new ImageIcon(this.getClass().getResource("/miso soup.jpg")).getImage();
				miso.setIcon(new ImageIcon(img14));
		miso.setBounds(1250, 250, 100, 100);
		contentPane.add(miso);
		
		JLabel lblmiso = new JLabel("Miso Soup");
		lblmiso.setHorizontalAlignment(SwingConstants.CENTER);
		lblmiso.setBounds(1253, 360, 90, 14);
		contentPane.add(lblmiso);
		
		JLabel lblhrgmiso = new JLabel("Rp. 21.000");
		lblhrgmiso.setHorizontalAlignment(SwingConstants.CENTER);
		lblhrgmiso.setBounds(1253, 380,90, 14);
		contentPane.add(lblhrgmiso);
		*/
		//----hot plate ramen----//
		JLabel hot = new JLabel("");
		Image img13= new ImageIcon(this.getClass().getResource("/hot plate ramen.jpg")).getImage();
				hot.setIcon(new ImageIcon(img13));
		hot.setBounds(47, 235, 100, 100);
		contentPane.add(hot);
		
		JLabel lblhot = new JLabel("Hot Plate Ramen");
		lblhot.setHorizontalAlignment(SwingConstants.CENTER);
		lblhot.setBounds(32, 345, 130, 14);
		contentPane.add(lblhot);
		
		JLabel lblhrghot = new JLabel("Rp. 37.000");
		lblhrghot.setHorizontalAlignment(SwingConstants.CENTER);
		lblhrghot.setBounds(50, 365, 90, 14);
		contentPane.add(lblhrghot);
		
		//----okonomiyaki----//
		JLabel okonomi = new JLabel("");
		Image img15= new ImageIcon(this.getClass().getResource("/okonomiyaki.jpg")).getImage();
				okonomi.setIcon(new ImageIcon(img15));
		okonomi.setBounds(270, 235, 100, 100);
		contentPane.add(okonomi);
		
		JLabel lblokonomi = new JLabel("okonomiyaki");
		lblokonomi.setHorizontalAlignment(SwingConstants.CENTER);
		lblokonomi.setBounds(273, 345, 90, 14);
		contentPane.add(lblokonomi);
		
		JLabel lblhrgokonomi = new JLabel("Rp. 21.000");
		lblhrgokonomi.setHorizontalAlignment(SwingConstants.CENTER);
		lblhrgokonomi.setBounds(273, 365, 90, 14);
		contentPane.add(lblhrgokonomi);
		
		//----ramen----//
		JLabel ramen = new JLabel("");
		Image img16= new ImageIcon(this.getClass().getResource("/ramen.jpg")).getImage();
				ramen.setIcon(new ImageIcon(img16));
		ramen.setBounds(160, 235, 100, 100);
		contentPane.add(ramen);
		
		JLabel lblramen = new JLabel("Ramen");
		lblramen.setHorizontalAlignment(SwingConstants.CENTER);
		lblramen.setBounds(170, 345, 90, 14);
		contentPane.add(lblramen);
		
		JLabel lblhrgramen = new JLabel("Rp. 33.000");
		lblhrgramen.setHorizontalAlignment(SwingConstants.CENTER);
		lblhrgramen.setBounds(170, 365, 90, 14);
		contentPane.add(lblhrgramen);
		
		//Image img17= new ImageIcon(this.getClass().getResource("/salmon salad.jpg")).getImage();
		
		JLabel takoyaki = new JLabel("");
		Image img18= new ImageIcon(this.getClass().getResource("/takoyaki.jpg")).getImage();
				takoyaki.setIcon(new ImageIcon(img18));
		takoyaki.setBounds(160, 385, 100, 100);
		contentPane.add(takoyaki);
		
		JLabel lbltakoyaki = new JLabel("Takoyaki");
		lbltakoyaki.setHorizontalAlignment(SwingConstants.CENTER);
		lbltakoyaki.setBounds(163, 495, 90, 14);
		contentPane.add(lbltakoyaki);
		
		JLabel lblhrgtakoyaki = new JLabel("Rp. 22.000");
		lblhrgtakoyaki.setHorizontalAlignment(SwingConstants.CENTER);
		lblhrgtakoyaki.setBounds(163, 515, 90, 14);
		contentPane.add(lblhrgtakoyaki);
		/*
		JLabel karage = new JLabel("");
		Image img19= new ImageIcon(this.getClass().getResource("/tempura karage rice.jpg")).getImage();
				karage.setIcon(new ImageIcon(img19));
		karage.setBounds(1050, 450, 100, 100);
		contentPane.add(karage);
		/*
		JLabel lblkarage = new JLabel("Salmon Salad");
		lblkarage.setHorizontalAlignment(SwingConstants.CENTER);
		lblkarage.setBounds(1053, 560, 90, 14);
		contentPane.add(lblkarage);
		
		JLabel lblhrgkarage = new JLabel("Rp. 45.000");
		lblhrgkarage.setHorizontalAlignment(SwingConstants.CENTER);
		lblhrgkarage.setBounds(1053, 580, 90, 14);
		contentPane.add(lblhrgkarage);
		*/
		//---- Teppanyaki ----///*
		//JLabel tepan = new JLabel("");
		//Image img20= new ImageIcon(this.getClass().getResource("/tepanyaki.jpg")).getImage();
			//	tepan.setIcon(new ImageIcon(img20));
		//tepan.setBounds(1250, 450, 100, 100);
		//contentPane.add(tepan);
		
	//	JLabel lbltepan = new JLabel("Beef Teppanyaki");
		//lbltepan.setHorizontalAlignment(SwingConstants.CENTER);
		//lbltepan.setBounds(1235, 560, 130, 14);
		//contentPane.add(lbltepan);
		
		//JLabel lblhrgtepan = new JLabel("Rp. 54.000");
		//lblhrgtepan.setHorizontalAlignment(SwingConstants.CENTER);
		//lblhrgtepan.setBounds(1253, 580, 90, 14);
		//contentPane.add(lblhrgtepan);
		Image img21= new ImageIcon(this.getClass().getResource("/udon.jpg")).getImage();
		
		//---- Yakitori ----//
				JLabel yaki = new JLabel("");
				Image img22= new ImageIcon(this.getClass().getResource("/yakitori.jpg")).getImage();
						yaki.setIcon(new ImageIcon(img22));
				yaki.setBounds(47, 392, 100, 100);
				contentPane.add(yaki);
				
				JLabel lblyaki = new JLabel("Beef Teppanyaki");
				lblyaki.setHorizontalAlignment(SwingConstants.CENTER);
				lblyaki.setBounds(50, 503, 90, 14);
				contentPane.add(lblyaki);
				
				JLabel lblhrgyaki = new JLabel("Rp. 54.000");
				lblhrgyaki.setHorizontalAlignment(SwingConstants.CENTER);
				lblhrgyaki.setBounds(50, 523, 90, 14);
				contentPane.add(lblhrgyaki);
				
				JPanel panel = new JPanel();
				panel.setBackground(Color.ORANGE);
				panel.setForeground(Color.GRAY);
				panel.setBounds(32, 38, 616, 514);
				contentPane.add(panel);
				
				JLabel lblFood = new JLabel("FOOD");
				lblFood.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 26));
				panel.add(lblFood);
				
				JLabel lblRp = new JLabel("Rp. 15.000");
				lblRp.setHorizontalAlignment(SwingConstants.CENTER);
				lblRp.setBounds(710, 210, 90, 14);
				contentPane.add(lblRp);
				
				JLabel lemontea = new JLabel("Lemon Tea");
				lemontea.setHorizontalAlignment(SwingConstants.CENTER);
				lemontea.setBounds(690, 190, 120, 14);
				contentPane.add(lemontea);
				
				JLabel drink1 = new JLabel("");
				Image lemon= new ImageIcon(this.getClass().getResource("/lemon tea.jpg")).getImage();
				drink1.setIcon(new ImageIcon(lemon));
				drink1.setBounds(700, 80, 100, 100);
				contentPane.add(drink1);
				
				JLabel lblRp_1 = new JLabel("Rp. 18.000");
				lblRp_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblRp_1.setBounds(849, 210, 90, 14);
				contentPane.add(lblRp_1);
				
				JLabel label_2 = new JLabel("Milk Shake");
				label_2.setHorizontalAlignment(SwingConstants.CENTER);
				label_2.setBounds(849, 190, 100, 14);
				contentPane.add(label_2);
				
				JLabel drink2 = new JLabel("");
				Image milks= new ImageIcon(this.getClass().getResource("/milk shake.jpg")).getImage();
				drink2.setIcon(new ImageIcon(milks));
				drink2.setBounds(849, 80, 100, 100);
				contentPane.add(drink2);
				
				JLabel drink3 = new JLabel("");
				Image ocha= new ImageIcon(this.getClass().getResource("/ocha.jpg")).getImage();
				drink3.setIcon(new ImageIcon(ocha));
				drink3.setBounds(700, 235, 100, 100);
				contentPane.add(drink3);
				
				JLabel lblOcha = new JLabel("Ocha");
				lblOcha.setHorizontalAlignment(SwingConstants.CENTER);
				lblOcha.setBounds(690, 345, 120, 14);
				contentPane.add(lblOcha);
				
				JLabel label_3 = new JLabel("Rp. 15.000");
				label_3.setHorizontalAlignment(SwingConstants.CENTER);
				label_3.setBounds(710, 365, 90, 14);
				contentPane.add(label_3);
				
				JLabel drink4 = new JLabel("");
				Image milkss= new ImageIcon(this.getClass().getResource("/Aqua.jpg")).getImage();
				drink4.setIcon(new ImageIcon(milkss));
				drink4.setBounds(849, 235, 100, 100);
				contentPane.add(drink4);
				
				JLabel lblAqua = new JLabel("Aqua");
				lblAqua.setHorizontalAlignment(SwingConstants.CENTER);
				lblAqua.setBounds(849, 345, 100, 14);
				contentPane.add(lblAqua);
				
				JLabel lblRp_2 = new JLabel("Rp. 5.000");
				lblRp_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblRp_2.setBounds(849, 365, 90, 14);
				contentPane.add(lblRp_2);
				
				JLabel drink5 = new JLabel("");
				Image milksss= new ImageIcon(this.getClass().getResource("/cocacola.jpg")).getImage();
				drink5.setIcon(new ImageIcon(milksss));
				drink5.setBounds(700, 385, 100, 100);
				contentPane.add(drink5);
				
				JLabel lblCocaCola = new JLabel("Coca Cola");
				lblCocaCola.setHorizontalAlignment(SwingConstants.CENTER);
				lblCocaCola.setBounds(690, 495, 120, 14);
				contentPane.add(lblCocaCola);
				
				JLabel lblRp_3 = new JLabel("Rp. 8.000");
				lblRp_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblRp_3.setBounds(710, 515, 90, 14);
				contentPane.add(lblRp_3);
				
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(Color.ORANGE);
				panel_1.setBounds(658, 38, 323, 514);
				contentPane.add(panel_1);
				
				JLabel lblDrink = new JLabel("Drink");
				lblDrink.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 19));
				panel_1.add(lblDrink);
				
				JButton btnNewButton = new JButton("Close");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Menu.this.dispose();
					}
				});
				btnNewButton.setBounds(878, 591, 89, 23);
				contentPane.add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("Order");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						NewOrder nw= new NewOrder();
						//Utama.this.dispose();
						nw.NewsOrder();
					}
					
				});
				btnNewButton_1.setBounds(779, 591, 89, 23);
				contentPane.add(btnNewButton_1);
		
	}
}
