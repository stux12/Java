package Main.nangjanggo;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Main.main.MainPage;

public class recipe extends MyngoResult {

	private JPanel contentPane;
	private JTextField textField;
	int count;
	int count1;
	int count2;
	int count3;
	int count4;
	int count5;
	int count6;
	int count7;
	String url;
	ImageIcon img;

	int bi(int a, int b, int c, int d, int e, int f, int g) {
		int result = a;

		if (result < b) {
			result = b;
		}
		if (result < c) {
			result = c;
		}
		if (result < d) {
			result = d;
		}
		if (result < e) {
			result = e;
		}
		if (result < f) {
			result = f;
		}
		if (result < g) {
			result = g;
		}

		return result;

	}

	
	public recipe() {
		setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/image/simsimcom.png")));
		setTitle("심심해닷컴\r\n");
		// MainJ , MainJ2 ,MainJ3 랑 비교
		String[] a = { MainJ, MainJ2, MainJ3 };

		String[] jaeyuk = { "제육볶음", "돼지고기", "양파", "고추장", };
		String[] cowbulgogi = { "소불고기", "소고기", "양파", "간장" };
		String[] chikenbukum = { "닭볶음탕", "닭고기", "양파", "고추장" };
		String[] ojingabukum = { "오징어볶음", "오징어", "고추가루", "양파" };
		String[] eggbukbab = { "계란볶음밥", "계란", "대파", "간장" };
		String[] ganjangeggbab = { "간장계란밥", "계란", "버터", "간장" };
		String[] ssoya = { "소세지야채볶음", "소세지", "양파", "케찹" };

		String eggbukbab1 = "https://terms.naver.com/entry.nhn?docId=1988213&cid=48161&categoryId=48196";
		String jaeyuk1 = "https://terms.naver.com/entry.nhn?docId=5682392&cid=48164&categoryId=48204";
		String cowbulgogi1 = "https://blog.naver.com/dhdmsdo79/222130488275";
		String chikenbukum1 = "https://blog.naver.com/pyoun0181/222145132397";
		String ojingabukum1 = "https://blog.naver.com/babsy0817/222140235522";
		String ganjangeggbab1 = "https://blog.naver.com/lovetogapyjs/221900437426";
		String ssoya1 = "https://blog.naver.com/blogdanielland/222072218023";

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("레시피 링크   :\r\n ");
		lblNewLabel_3.setBounds(95, 172, 100, 18);
		contentPane.add(lblNewLabel_3);

		JLabel label = new JLabel(" 당신이 만들수 있는요리는 ?");
		label.setBounds(260, 47, 185, 34);
		contentPane.add(label);

		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseClicked(MouseEvent e) {
	            try {
	               Desktop.getDesktop().browse(new URI(url));
	            } catch (IOException e2) {
	               e2.printStackTrace();
	            } catch (URISyntaxException e2) {
	               e2.printStackTrace();
	            }
	         
	         }
	      });
		textField.setBounds(187, 149, 310, 64);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(204, 237, 310, 200);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("처음으로 돌아가기");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				setVisible(false);
				new MyngoMain().setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(255, 479, 185, 34);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("메인으로 돌아가기");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				setVisible(false);
				new MainPage().setVisible(true);

			}
		});
		btnNewButton_1.setBounds(255, 544, 185, 34);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(260, 93, 185, 34);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MyngoMain.class.getResource("/main/nangjanggo/main.jpg")));
		lblNewLabel_2.setBounds(0, 0, 750, 750);
		contentPane.add(lblNewLabel_2);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < jaeyuk.length; j++) {
				if (a[i].equals(jaeyuk[j])) {
					
						count1++;
				}
			}
			for (int j = 0; j < cowbulgogi.length; j++) {
				if (a[i].equals(cowbulgogi[j])) {
					
						count2++;
				}
			}

			for (int j = 0; j < chikenbukum.length; j++) {
				if (a[i].equals(chikenbukum[j])) {
				
						count3++;
				}
			}
			for (int j = 0; j < ojingabukum.length; j++) {
				if (a[i].equals(ojingabukum[j])) {
				
						count4++;
				}
			}
			for (int j = 0; j < eggbukbab.length; j++) {
				if (a[i].equals(eggbukbab[j])) {
				
						count5++;
				}
			}

			for (int j = 0; j < ganjangeggbab.length; j++) {
				if (a[i].equals(ganjangeggbab[j])) {
				
						count6++;
				}
			}
			for (int j = 0; j < ssoya.length; j++) {
				if (a[i].equals(ssoya[j])) {

						count7++;
				}
			}

			int result = bi(count1, count2, count3, count4, count5, count6, count7); // bi는 5일때

			if (count1 == result) {
	            textField.setText(jaeyuk1);
	            url = jaeyuk1;
	            lblNewLabel_1.setText(jaeyuk[0]);
	            lblNewLabel.setIcon(new ImageIcon(recipe.class.getResource("/main/nangjanggo/food-4452839_640.jpg")));
	            lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	            lblNewLabel.setBounds(187, 240, 310, 200);
	         }

	         else if (count2 == result) {
	            textField.setText(cowbulgogi1);
	            url = cowbulgogi1;
	            lblNewLabel_1.setText(cowbulgogi[0]);
	            lblNewLabel.setIcon(new ImageIcon(recipe.class.getResource("/main/nangjanggo/pot-2517765_640.jpg")));
	            lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	            lblNewLabel.setBounds(187, 240, 310, 200);
	         }

	         else if (count3 == result) {
	            textField.setText(chikenbukum1);
	            url = chikenbukum1;
	            lblNewLabel_1.setText(chikenbukum[0]);
	            lblNewLabel.setIcon(
	                  new ImageIcon(recipe.class.getResource("/main/nangjanggo/chicken-bokeumtang-460307_640.png.jpg")));
	            lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	            lblNewLabel.setBounds(187, 240, 310, 200);
	         }

	         else if (count4 == result) {
	            textField.setText(ojingabukum1);
	            url = ojingabukum1;
	            lblNewLabel_1.setText(ojingabukum[0]);
	            lblNewLabel.setIcon(new ImageIcon(recipe.class.getResource("/main/nangjanggo/squid-stir-fry-3866066_640.jpg")));
	            lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	            lblNewLabel.setBounds(187, 240, 310, 200);
	         }

	         else if (count5 == result) {
	            textField.setText(eggbukbab1);
	            url = eggbukbab1;
	            lblNewLabel_1.setText(eggbukbab[0]);
	            lblNewLabel.setIcon(new ImageIcon(recipe.class.getResource("/main/nangjanggo/restaurant-1762493_640.jpg")));
	            lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	            lblNewLabel.setBounds(187, 240, 310, 200);
	         }

	         else if (count6 == result) {
	            textField.setText(ganjangeggbab1);
	            url = ganjangeggbab1;
	            lblNewLabel_1.setText(ganjangeggbab[0]);
	            lblNewLabel.setIcon(new ImageIcon(recipe.class.getResource("/main/nangjanggo/1606765879722.jpg")));
	            lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	            lblNewLabel.setBounds(187, 240, 310, 200);
	         } else if (count7 == result) {
	            textField.setText(ssoya1);
	            url = ssoya1;
	            lblNewLabel_1.setText(ssoya[0]);
	            lblNewLabel.setIcon(new ImageIcon(recipe.class.getResource("/main/nangjanggo/1606765820240.jpg")));
	            lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	            lblNewLabel.setBounds(187, 240, 310, 200);

	         }

		}

	}
}
